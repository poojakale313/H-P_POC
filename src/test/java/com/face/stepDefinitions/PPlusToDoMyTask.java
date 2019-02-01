package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusToDoMyTaskPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusToDoMyTask {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusToDoMyTaskPage objToDoMyTaskPage = new PPlusToDoMyTaskPage();
	
	@Then("^Click on My Tasks tab$")
	public void click_On_Me_Button() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.clickOnMyTask());
	}
	
	@Then("^To Do Enter the text in Type your task text box (.*)$")
	public void To_Do_Enter_the_text_in_Type_your_task_text_box(String task) {
		Assert.assertTrue(objToDoMyTaskPage.enterYourTask(task));
	}
	
	@Then("^Select check box Maternity leave$")
	public void select_checkbox_Maternity() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.selectcheckboxMaternity());
	}
	
	@Then("^Select check box working from home$")
	public void select_checkbox_WorkingFromHome() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.selectcheckboxWorkingFromHome());
	}
	
	@Then("^Select check box Book a fitting$")
	public void select_checkbox_BookFitting() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.selectcheckboxBookFitting());
	}
	
	@Then("^Deselects Maternity leave$")
	public void deselect_checkbox_Maternity() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.deselectCheckboxMaternity());
	}
	
	@Then("^Deselects check box working from home$")
	public void deselect_checkbox_WorkingFromHome() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.deselectCheckboxWorkingFromHome());
	}
	
	@Then("^Deselects check box Book a fitting$")
	public void deselect_checkbox_BookFitting() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.deselectCheckboxBookFitting());
	}
	
	@Then("^Long Press on any item from My Items$")
	public void long_Press_OnDiscussMaternity() throws InterruptedException {
		//objToDoMyTaskPage.longPressOnDiscussMaternity();
		Assert.assertTrue(objToDoMyTaskPage.longPressOnDiscussMaternity(null));
	}
	
	@Then("^Click on Delete icon$")
	public void click_On_Delete_IconToDoMyTask() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.clickOnDeleteIconToDoMyTask());
	}
	
	@Then("^Click on Delete button shown on confirmation pop up$")
	public void click_On_Delete_Button_OnPopup() throws InterruptedException {
		Assert.assertTrue(objToDoMyTaskPage.clickOnDeleteButtonOnPopup());
	}
}
