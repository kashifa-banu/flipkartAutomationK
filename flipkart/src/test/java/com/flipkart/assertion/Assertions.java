package com.flipkart.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.page.LoginPage;

public class Assertions  {
	
	static public boolean isloginSuccessfull(WebDriver driver,WebElement webelement){
		
		if(webelement.isDisplayed())		
		return true;
		else
			return false;
		
	}

}
