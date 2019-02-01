package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusBabyBagPage;
import com.face.pageFactory.PPlusBirthPlanPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusBirthPlan {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusBirthPlanPage objPPlusMe = new PPlusBirthPlanPage();
	
	
	@When("^Click on Environment tab$")
	public void clickOnEnvironmentTab() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnEnvironment());
	}
	
	@When("^Click on I prefer a female doctor$")
	public void clickOnfemaleDoctoroption() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnfemaleDoctor());
	}
	
	@When("^Click on I prefer a private room$")
	public void clickOnprivateRoomOption() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnprivateRoom());
	}
	
	@When("^Click on I would like to give birth at home$")
	public void clickOngiveBirthOption() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOngiveBirth());
	}
	
	@When("^Click on My Items tab1$")
	public void clickOnmyItemsTab1() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnmyItems());
	}
	
	@When("^Birth Plan Enter the text in Type your task text box (.*)$")
	public void Birth_Plan_Enter_the_text_in_Type_your_task_text_box(String text) throws InterruptedException  
	{
		Assert.assertTrue(objPPlusMe.settaskTextBox(text));
	}
	
	@When("^Click on back arrow$")
	public void clickOnBackArrow1() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnBackArrow());
	}
	
	@When("^Click on Companions tab$")
	public void clickOnCompanionsTab() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnCompanions());
	}
	
	@When("^Click on I don`t want any students or other hospital staff in the room$")
	public void clickOnwantAnyOption() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnwantAny());
	}
	
	@When("^Click on I only want my partner$")
	public void clickOnPartnerOption() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnPartner());
	}
	
	@When("^Click on I would like my partner or companion to be with me during labor$")
	public void clickOnlaborOption() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnlabor());
	}
	
	@When("^Click on Item button$")
	public void clickOnItemTab2() throws Throwable {
		Assert.assertTrue(objPPlusMe.clickOnItem());
	}
	
	@Then("^Birth Plan Items are selected from listing$")
	public void BirthPlanItems() throws Throwable {
		System.out.println("   ");
	}
	
}
