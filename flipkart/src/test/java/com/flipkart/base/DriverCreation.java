package com.flipkart.base;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;


public class DriverCreation {
	
	static WebDriver driver;
	@Test
	public void createDriver(){
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
	

		driver.get("https://www.google.com/");
	}


}
