package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusContractionPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusContraction {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusContractionPage objPPlusContractionPage = new PPlusContractionPage();
	
	@When("^Click on Clock icon to start$")
	public void Click_on_Clock_icon_to_start()  
	{
		Assert.assertTrue(objPPlusContractionPage.clickOnConStartBtn());
	}
	
	@When("^Click on Alert popup$")
	public void Click_on_Alert_popup()  
	{
		Assert.assertTrue(objPPlusContractionPage.clickOnAlertpopup());
	}
	
	@When("^Click on Stop Button$")
	public void Click_on_Stop_Button()  
	{
		Assert.assertTrue(objPPlusContractionPage.clickOnStopButton());
	}
	
	@When("^Scroll down to view overview and Contraction Info$")
	 public void Scroll_Down_To_View_Overview_And_Contraction_Info()  
	 {
	 Assert.assertTrue(objPPlusContractionPage.ScrollDownToViewOverviewAndContractionInfo());
	 }

	 @When("^Switch the tabs from Last 3 to Last 5 or All$")
	 public void Switch_The_Tabs_From_Last3_To_Last5_Or_All()  
	 {
	  Assert.assertTrue(objPPlusContractionPage.SwitchTheTabsFromLast3ToLast5OrAll());
	 }

	 @When("^Swipe any record shown in session history to delete$")
	 public void Swipe_Any_Record_Shown_In_Session_History_To_Delete()  
	 {
	  Assert.assertTrue(objPPlusContractionPage.SwipeAnyRecordShownInSessionHistoryToDelete());
	 }

	
	@When("^Click on OK shown on pop up$")
	public void Click_on_OK_shown_on_pop_up()  
	{
		Assert.assertTrue(objPPlusContractionPage.clickOnokbutton());
	}
	
	@Then("^Added contraction are displayed in session history listing$")
	public void Addedcontraction()  
	{
		System.out.println(" ");
	}
	
//	@When("^Click on Clock icon to start$")
//	public void Click_on_Clock_icon_to_start()  
//	{
//		Assert.assertTrue(objPPlusContractionPage.clickOkbtn());
//	}
	
//	@When("^Click on Stop Button$")
//	public void Click_on_Stop_Button()  
//	{
//		Assert.assertTrue(objPPlusContractionPage.clickOkbtn());
//	}
	
	
}
