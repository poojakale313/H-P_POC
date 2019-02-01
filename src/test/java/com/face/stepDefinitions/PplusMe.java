package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PplusMePage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PplusMe {
	// Local variables
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PplusMePage objPplusMePage = new PplusMePage();
	
	
	
	@Then("^Click on appointment tab$")
	public void clickOnAppointmentTab(){
		Assert.assertTrue(objPplusMePage.clickOnAppointmentTab());
	}
	
	@Then("^Click on My Weight$")
	public void click_On_My_Weight_Button() throws InterruptedException {
		Assert.assertTrue(objPplusMePage.clickOnMyWeightButton());
	}
	
	@Then("^Click on Birth Plan tab$")
	public void clickOnBirthPlanModule() throws Throwable {
		Assert.assertTrue(objPplusMePage.clickOnBirthPlan());
	}
	
	@Then("^Click To Do Tab$")
	public void click_On_ToDo_Button() throws InterruptedException {
		Assert.assertTrue(objPplusMePage.clickOnToDoButton());
	}
	
	
}
