package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusContractionPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PPlusContraction {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusContractionPage objPPlusContractionPage = new PPlusContractionPage();
	
	@Then("^Click on Clock icon to start$")
	public void Click_on_Clock_icon_to_start()  
	{
		Assert.assertTrue(objPPlusContractionPage.clickOnConStartBtn());
	}
	
	@Then("^Click on Alert popup$")
	public void Click_on_Alert_popup()  
	{
		Assert.assertTrue(objPPlusContractionPage.clickOnAlertpopup());
	}
	
	@Then("^Click on Stop Button$")
	public void Click_on_Stop_Button()  
	{
		Assert.assertTrue(objPPlusContractionPage.clickOnStopButton());
	}
	
	@Then("^Click on OK shown on pop up$")
	public void Click_on_OK_shown_on_pop_up()  
	{
		Assert.assertTrue(objPPlusContractionPage.clickOnokbutton());
	}
	
//	@Then("^Click on Clock icon to start$")
//	public void Click_on_Clock_icon_to_start()  
//	{
//		Assert.assertTrue(objPPlusContractionPage.clickOkbtn());
//	}
	
//	@Then("^Click on Stop Button$")
//	public void Click_on_Stop_Button()  
//	{
//		Assert.assertTrue(objPPlusContractionPage.clickOkbtn());
//	}
	
	
}
