package com.face.stepDefinitions;
import org.junit.Assert;

import com.face.pageFactory.PPlusMyWeightPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusMyWeight {
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();	
	private PPlusMyWeightPage objMyWeightPage = new PPlusMyWeightPage();
	
	
	
	@When("^Click on Starting Weight$")
	public void click_On_Starting_Weight() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.clickOnStartingWeight());
	}
	
	@When("^Select weight from roller$")
	public void select_Weight_From_Roller() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.selectWeightFromRoller());
	}
	
	@When("^Click on Save Weight button$")
	public void click_On_Save_Weight_Button() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.clickOnSaveWeightButton());
	}
	
	@When("^Click on Okay Got It button$")
	public void click_On_Ok_GotIt_Button() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.clickOnOkGotItButton());
	}
	
	@When("^Click on Current Weight$")
	public void click_On_Current_Weight() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.clickOnCurrentWeight());
	}
	
	@When("^Click on Submit Weight button$")
	public void click_On_Submit_Weight_Button() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.clickOnSubmitWeightButton());
	}
	
	@When("^Scroll down till Full History$")
	public void scroll_Till_Full_History() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.scrollTillFullHistory());
	}
	
	@When("^Click on first Weight$")
	public void click_On_First_Weight() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.clickOnFirstWeight());
	}
	
	@When("^Select LB unit from Weight unit drop down$")
	public void select_LBUnit_WeightDropdown() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.selectLBUnitWeightDropdown());
	}
	
	@When("^Select ST unit from Weight unit drop down$")
	public void select_STUnit_WeightDropdown() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.selectSTUnitWeightDropdown());
	}
		
	@When("^Swipe first weight to right or left to delete$")
	public void swipe_First_Weight_ToDelete() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.swipeFirstWeightToDelete());
	}
	
	@When("^Swipe second weight to right or left to delete$")
	public void swipe_Second_Weight_ToDelete() throws InterruptedException {
		Assert.assertTrue(objMyWeightPage.swipeSecondWeightToDelete());
	}
	
	@Then("^Added weight get displayed on full history list$")
	public void Addedweightget() throws InterruptedException {
		System.out.println("   ");
	}
}
