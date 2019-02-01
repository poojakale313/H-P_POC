package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusKickCounterPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusKickCounter {
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private PPlusKickCounterPage objKickCounterPage = new PPlusKickCounterPage();
	
//	@When("^Click on More tab$")
//	public void click_On_More_Button() throws InterruptedException {
//		Assert.assertTrue(objKickCounterPage.clickOnMoreButton());
//	}
	
		
	@When("^Tap on the foot icon for 2 times$")
	public void click_On_FootIcon2Times() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnFootIcon2Times());
	}
	
	@When("^Click on Finish button$")
	public void click_On_Finish_Button() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnFinishButton());
	}
	
	@When("^Click on NO shown on alert pop up$")
	public void click_On_No_Button_OnAlert() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnNoButtonOnAlert());
	}
	
	@When("^Click on YES shown on alert pop up$")
	public void click_On_Yes_Button_OnAlert() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnYesButtonOnAlert());
	}
	
	@When("^Click on DONE shown on session ended pop up$")
	public void click_On_Done_Button_For_EndSession() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnDoneButtonForEndSession());
	}
	
//	@When("^Click on back arrow$")
//	public void click_On_BackArrow() throws InterruptedException {
//		Assert.assertTrue(objKickCounterPage.clickOnBackArrow());
//	}
//	
	@When("^Tap on the foot icon for 10 times$")
	public void click_On_Foot_Icon_10Time() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnFootIcon10Time());
	}
	
	@When("^Click on Undo button$")
	public void click_On_Undo_Button() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnUndoButton());
	}
	
	@When("^Click on NO button shown in alert pop up$")
	public void click_On_Undo_Button_No() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnUndoButtonNo());
	}
	
	@When("^Click on YES button shown in alert pop up$")
	public void click_On_Undo_Button_Yes() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnUndoButtonYes());
	}
	
	@When("^Click on DONE shown on session saved pop up$")
	public void click_On_Done_For_Session_SavedPopUp() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnDoneForSessionSavedPopUp());
	}
	
	@When("^Click on History$")
	public void click_On_HistoryBtn() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnHistoryBtn());
	}
	
	@When("^Swipe any entry to delete it$")
	public void click_On_Swipe_To_DeleteEntry() throws InterruptedException {
		Assert.assertTrue(objKickCounterPage.clickOnSwipeToDeleteEntry());
	}
	
	@Then("^Kick counts are displayed in session history listing$")
	public void Kickcounts() throws InterruptedException {
		System.out.println(" ");
	}
	
}
