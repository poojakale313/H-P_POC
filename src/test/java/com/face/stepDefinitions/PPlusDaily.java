package com.face.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.face.pageFactory.PPlusDailyPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusDaily {

	PPlusDailyPage objPPlusDailyPage = new PPlusDailyPage();
	
	
	@When("^Get text to verify$")
	public void GetTextToVerify() throws InterruptedException, IOException {
		Assert.assertTrue(objPPlusDailyPage.GetTextToVerify());
	}

	@Then("^Content get displayed for particular day$")
	public void Content_get_displayed_for_particular_day() throws InterruptedException, IOException {
		System.out.println("   ");
	}
	
	
}
