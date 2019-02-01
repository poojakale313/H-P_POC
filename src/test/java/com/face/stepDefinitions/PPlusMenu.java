package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusMenuPage;

import cucumber.api.java.en.Then;

public class PPlusMenu {

	PPlusMenuPage objPPlusMenuPage = new PPlusMenuPage();
	
	@Then("^Click on Baby Menu tab$")
	public void clickOn_baby() throws Throwable {
		Assert.assertTrue(objPPlusMenuPage.clickOnbaby());
	}
	
	@Then("^Click on Me menu$")
	public void clickOnMemenu() throws InterruptedException{
		Assert.assertTrue(objPPlusMenuPage.clickOnMeMenu());
	}
	
	@Then("^Click on More tab$")
	public void click_on_More_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusMenuPage.clickMoreTabBtn());
	}
	
}
