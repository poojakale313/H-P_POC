package com.face.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.face.pageFactory.PPlusWeeklyPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusWeekly {

	PPlusWeeklyPage objPPlusWeeklyPage = new PPlusWeeklyPage();
	
	@When("^Get text to verify weekly pages$")
	public void getTextToVerifyWeeklyPages() throws InterruptedException, IOException {
		Assert.assertTrue(objPPlusWeeklyPage.getTextToVerifyWeeklyPages());
	}
	
	@Then("^Content get displayed for particular week$")
	public void getTextToVerifyweek() throws InterruptedException, IOException {
		System.out.println("  ");
	}
	
}
