package com.face.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.face.pageFactory.PPlusBabyPage;

import cucumber.api.java.en.Then;

public class PPlusBaby {

	PPlusBabyPage objPPlusBabyPage = new PPlusBabyPage();
	
	
	@Then("^Click on Baby Name tab$")
	public void clickOn_baby_Name() throws Throwable {
		Assert.assertTrue(objPPlusBabyPage.clickOnbabyName());
	}
	
	@Then("^Click on daily tab$")
	public void clickOnDailyTab() throws InterruptedException {
		Assert.assertTrue(objPPlusBabyPage.clickOnDailyTab());
	}

	@Then("^Click on weekly tab$")
	public void clickOnWeeklyTab() throws InterruptedException {
		Assert.assertTrue(objPPlusBabyPage.clickOnWeeklyTab());
	}

	
}
