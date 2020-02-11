package com.flipkart.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class DriverCreation {

	static WebDriver driver;
	static ExtentReports extent;
	static ExtentTest test;

	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeTest
	public void reportSetup(){
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/extentReport_" + System.currentTimeMillis()+".html");
		extent.addSystemInfo("OS", "OS");
		extent.addSystemInfo("Browser", "chrome");
		test = extent.startTest("myntra");
		
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if(ITestResult.SUCCESS==result.getStatus())
			test.log(LogStatus.PASS, "passed");
		if(ITestResult.FAILURE==result.getStatus())
			test.log(LogStatus.FAIL, test.addScreenCapture(getScreenshotPath()));
		extent.endTest(test);

		driver.quit();

	}

	private String getScreenshotPath() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png" ;
		File target = new File(screenshotPath);
		FileUtils.copyFile(src, target);
		return screenshotPath;
	}
	
	@AfterTest
	public void endReport(){
	extent.flush();
	extent.close();
	}

}
