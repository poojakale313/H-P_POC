package com.face.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.face.pageFactory.PPlusLoginPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class PPlusLogin {
	// Local variables

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PPlusLoginPage objPPlusLoginPage = new PPlusLoginPage();
	
	@Given("^Click On Login button$")
	public void Click_On_Login_button() {

		Assert.assertTrue(objPPlusLoginPage.clickOnNoLoginBtn());
	}

	@Then("^Click on Ok Button$")
	public void clickOnOkButton()  
	{
		Assert.assertTrue(objPPlusLoginPage.clickOkbtn());
	}
	
	
	@Then("^Enter the User Name (.*)$")
	public void enterUserName(String userName)  
	{
		Assert.assertTrue(objPPlusLoginPage.setUserName(userName));
		
	}
	
	@Then("^Enter the Password (.*)$")
	public void enterPassword(String password)  
	{
		Assert.assertTrue(objPPlusLoginPage.setUserPassword(password));
	}
	
	@Then("^Click on Continue Button$")
	public void clickOnContinueButton() throws InterruptedException  
	{
		Assert.assertTrue(objPPlusLoginPage.clickContinueBtn());
	}
	
		
}


