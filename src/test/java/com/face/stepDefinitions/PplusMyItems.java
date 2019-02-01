package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PplusMyitemsPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PplusMyItems {

	// Local variables
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PplusMyitemsPage objPplusMyitemsPage = new PplusMyitemsPage();
	
	@Then("^Click on My items tab$")
	public void clickOnMyItemsTab(){
		Assert.assertTrue(objPplusMyitemsPage.clickOnMyItemsTab());
	}
	
	@Then("^Enter a question in Add question section (.*)$")
	public void enterQuestion(String Question)  
	{
		Assert.assertTrue(objPplusMyitemsPage.enterQuestion(Question));
	}

	@Then("^Long press on first question$")
	public void longPressFirstQuestion() throws InterruptedException{
		Assert.assertTrue(objPplusMyitemsPage.ClicklongpressonFirstQuestion(null));
	}

	@Then("^Click on delete button$")
	public void clickOnDeleteButton(){
		Assert.assertTrue(objPplusMyitemsPage.clickOnDeleteButton());
	}

	@Then("^Click on delete popup$")
	public void clickOnDeletePopupButton(){
		Assert.assertTrue(objPplusMyitemsPage.clickOnDeleteButtonPopup());
	}
	
	@Then("^Click on down arrow to type answer$")
	public void clickOnDownArrow(){
		Assert.assertTrue(objPplusMyitemsPage.clickOnDownArrow());
	}
	
	@Then("^Enter a text in answer tab (.*)$")
	public void enterAnswer(String Answer)  
	{
		Assert.assertTrue(objPplusMyitemsPage.enterAnswer(Answer));
	}
	
	@Then("^Click on up arrow$")
	public void clickOnUpArrow(){
		Assert.assertTrue(objPplusMyitemsPage.clickOnUpArrow());
	}
}
