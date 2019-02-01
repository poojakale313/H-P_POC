package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PplusAppointmentsPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PplusAppointments {
	// Local variables
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PplusAppointmentsPage objPplusAppointmentsPage = new PplusAppointmentsPage();

	@Then("^Click on questions tab$")
	public void clickOnQuestionsTab(){
		Assert.assertTrue(objPplusAppointmentsPage.clickOnQuestionsTab());
	}
	
	@Then("^Click on Add$")
	public void clickOnAdd(){
		Assert.assertTrue(objPplusAppointmentsPage.clickOnAdd());
	}
	
	@Then("^Perform horizontal swipe to delete the record$")
	public void performHorizontalSwipeToDeleteRecord(){
		Assert.assertTrue(objPplusAppointmentsPage.performHorizontalSwipeToDeleteRecord());
	}
}
