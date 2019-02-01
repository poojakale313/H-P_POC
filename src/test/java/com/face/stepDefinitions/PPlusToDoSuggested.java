package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusToDoSuggestedPage;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.When;

public class PPlusToDoSuggested {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusToDoSuggestedPage objToDoSuggestedPage = new PPlusToDoSuggestedPage();
	
	
//	@When("^Click on Me tab$")
//	public void click_On_Me_Button() throws InterruptedException {
//		Assert.assertTrue(objToDoSuggestedPage.clickOnMeButton());
//	}
	
	
	
	@When("^Click on Discuss maternity leave$")
	public void select_Discuss_Maternity() throws InterruptedException {
		Assert.assertTrue(objToDoSuggestedPage.selectDiscussMaternity());
	}
	
	@When("^Click on Discuss working from home$")
	public void select_Discuss_Working() throws InterruptedException {
		Assert.assertTrue(objToDoSuggestedPage.selectDiscussWorking());
	}
	
	@When("^Click on Book a fitting$")
	public void select_BookFitting() throws InterruptedException {
		Assert.assertTrue(objToDoSuggestedPage.selectBookFitting());
	}
	@When("^Click on Suggested tab$")
	public void select_SuggestedTab() throws InterruptedException {
		Assert.assertTrue(objToDoSuggestedPage.selectSuggestedTab());
	}
	
	
	@When("^Select week from Week dropdown$")
	 public void select_Week_DropDown() throws Throwable {
 	  Assert.assertTrue(objToDoSuggestedPage.selectWeekDropDown());
	 }
	
	@When("^Click on Arrange a water purification$")
	public void click_MakeAppointment() throws InterruptedException {
		Assert.assertTrue(objToDoSuggestedPage.clickMakeAppointment());
	}
	
	@When("^Click on Book an appointment$")
	public void click_BookAppointment() throws InterruptedException {
		Assert.assertTrue(objToDoSuggestedPage.clickBookAppointment());
	}
	
	@Then("^Suggested Items are added into MyTask list$")
	public void SuggestedItemsToDo() throws InterruptedException {
		System.out.println("  ");
	}
	
//	@When("^Click on Back arrow$")
//	public void click_BackArrow() throws InterruptedException {
//		Assert.assertTrue(objToDoSuggestedPage.clickBackArrow());
//	}
}
