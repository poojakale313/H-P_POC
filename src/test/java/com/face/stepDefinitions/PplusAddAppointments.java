package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PplusAddAppointmentPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PplusAddAppointments {
	// Local variables
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PplusAddAppointmentPage objPplusAddAppointmentPage = new PplusAddAppointmentPage();
	
	@When("^Enter a name (.*)$")
	public void enterName(String NewName)  
	{
		Assert.assertTrue(objPplusAddAppointmentPage.enterPatientName(NewName));
	}
	
	@When("^Select a drop down from doctor tab$")
	public void selectDropDownDoctor()  
	{
		Assert.assertTrue(objPplusAddAppointmentPage.selectDropDownDoctor());
	}
	
	@When("^click on date$")
	public void clickOnDate(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnDate());
	}
	
	@When("^Click on OK$")
	public void clickOnDateOK(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnDateOK());
	}
	
	@When("^Click on Time$")
	public void clickOnTime(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnTime());
	}

	@When("^Perform horizontal swipe for time$")
	public void performHorizontalSwipe(){
		Assert.assertTrue(objPplusAddAppointmentPage.performHorizontalSwipe());
	}

	@When("^Click on OK of time$")
	public void clickOnOkTime(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnOkTime());
	}
	
	@When("^Click on My weight$")
	public void clickOnWeight(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnWeight());
	}
	
	@When("^Perform horizontal swipe for weight in KG$")
	public void performHorizontalSwipeForWeightKg(){
		Assert.assertTrue(objPplusAddAppointmentPage.performHorizontalSwipeForWeightKg());
	}
	
	@When("^Perform horizontal swipe for weight in GM$")
	public void performHorizontalSwipeForWeightGram(){
		Assert.assertTrue(objPplusAddAppointmentPage.performHorizontalSwipeForWeightGram());
	}
	
	@When("^Click on save weight$")
	public void clickOnSaveWeight(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnSaveWeight());
	}
	
	@When("^Click on BP$")
	public void clickOnBP(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnBP());
	}
	
	@When("^Perform horizontal swipe for BP$")
	public void performHorizontalSwipeForBP(){
		Assert.assertTrue(objPplusAddAppointmentPage.performHorizontalSwipeForBP());
	}
	
	@When("^Perform horizontal swipe for BP2$")
	public void performHorizontalSwipeForBP2(){
		Assert.assertTrue(objPplusAddAppointmentPage.performHorizontalSwipeForBP2());
	}
	
	@When("^Click on save for BP$")
	public void clickOnSaveBP(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnSaveBP());
	}
	
	@When("^Click on baby's heart$")
	public void clickOnBabysHeart(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnBabysHeart());
	}
	
	@When("^Perform horizontal swipe for baby's heart$")
	public void performHorizontalSwipeForBabyHeart(){
		Assert.assertTrue(objPplusAddAppointmentPage.performHorizontalSwipeForBabyHeart());
	}
	
	@When("^Click on save for baby's heart$")
	public void clickOnSaveBabyHeart(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickOnSaveBabyHeart());
	}
	
	@When("^Perform vertical swipe$")
	public void performVerticalSwipeAfterBabyHeart() throws InterruptedException{
		Assert.assertTrue(objPplusAddAppointmentPage.performVerticalSwipeAfterBabyHeart());
	}

	
	@When("^Click on OFF$")
	public void clickCalenderON(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickCalenderON());
	}
	
	@When("^Click on ON$")
	public void clickCalenderOFF(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickCalenderOFF());
	}
	
	@When("^Click on Final save$")
	public void clickAppointmentSave(){
		Assert.assertTrue(objPplusAddAppointmentPage.clickAppointmentSave());
	}
	
	@Then("^Added Appointment get displayed on listing screen$")
	public void AddedAppointment(){
		System.out.println("  ");
	}
}
