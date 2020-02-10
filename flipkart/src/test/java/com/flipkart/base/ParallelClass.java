/*package com.flipkart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class ParallelClass {
	
	static WebDriver driver;
	@Test
	public void createDriver(){
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		
		ChromeDriverManager.chromedriver().setup();
		//FirefoxDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
	//	driver.switchTo().window("");
	//	driver.manage().timeouts().implicitlyWait(3444, TimeUnit.SECONDS);
	//	WebDriverWait wait = new WebDriverWait(driver, 1000);
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}
	@Test
	public void createDriver2(){
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		
		ChromeDriverManager.chromedriver().setup();
		//FirefoxDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
	//	driver.switchTo().window("");
	//	driver.manage().timeouts().implicitlyWait(3444, TimeUnit.SECONDS);
	//	WebDriverWait wait = new WebDriverWait(driver, 1000);
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}


}
*/