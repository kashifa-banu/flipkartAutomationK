package com.flipkart.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.base.DriverCreation;
import com.flipkart.page.LoginPage;

public class LoginpageAction {
	
	WebDriver driver;
	DriverCreation createDriver = new DriverCreation();
	public LoginpageAction(){
		driver = createDriver.getDriver();
	}
	
	public WebElement gethelloText(){
		Actions act = new Actions(driver);
		WebElement profile = driver.findElement(By.xpath(LoginPage.profileXpath));
		act.moveToElement(profile).build().perform();
		return driver.findElement(By.xpath(LoginPage.helloText));
	}

	public void clickOnLogin() {
		Actions act = new Actions(driver);
		WebElement profileElement=driver.findElement(By.xpath(LoginPage.profileXpath));
		act.moveToElement(profileElement).moveToElement(driver.findElement(By.xpath(LoginPage.loginXpath))).click().build().perform();;
	}

	public void enterEmailID() {
		driver.findElement(By.name(LoginPage.emailName)).sendKeys("kashifabn4@gmail.com");
		
	}
	public void enterPassword() {
		driver.findElement(By.name(LoginPage.password)).sendKeys("rafath100");
		
	}
	public void clickLogin() {
		driver.findElement(By.xpath(LoginPage.loginbtn)).click();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			
	}

	public void waitForLogin(int i) {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
	}

}
