package com.flipkart.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.action.LoginpageAction;
import com.flipkart.assertion.Assertions;
import com.flipkart.base.DriverCreation;

public class LoginTestcase extends DriverCreation {
	
	
	
	@Test
	public void login(){
		LoginpageAction login = new LoginpageAction();
		login.clickOnLogin();
		login.enterEmailID();
		login.enterPassword();
		login.clickLogin();
		login.waitForLogin(2000);
		Assert.assertTrue(Assertions.isloginSuccessfull(getDriver(),login.gethelloText()),"login error");
	}
	
	@Test
	public void check(){
		System.out.println("hai");
	}

}
