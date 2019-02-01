package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusBabyBagPage;
import com.face.pageFactory.PPlusBabyNamePage;
import com.face.pageFactory.PPlusBirthPlanPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusBabyNames {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusBabyNamePage objPPlusNamePage = new PPlusBabyNamePage();
	
	
	
	@When("^Click on American names$")
	public void clickOnamericannames() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnamericanName());
	}
	
	@When("^Click on Noah$")
	public void Click_on_Noah() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnname1());
	}
	
	@When("^Click on Liam$")
	public void clickOnnames2() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnname2());
	}
	
	@When("^Click on Mason$")
	public void clickOnnames3() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnname3());
	}
	
	@When("^Click on Jacob$")
	public void clickOnnames4() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnname4());
	}
	
	@When("^Click on gender icon$")
	public void clickOngenders() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOngender());
	}
	
	@When("^Click on Emma$")
	public void clickOnnames5() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnname5());
	}
	
	@When("^Click on Olivia$")
	public void clickOnnames6() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnname6());
	}
	
	@When("^Click on Sophia$")
	public void clickOnnames7() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnname7());
	}
	
	@When("^Click on Isabella$")
	public void clickOnnames8() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnname8());
	}
	
	@When("^Click on My favourites tab$")
	public void clickOnfavourites() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnfavourite());
	}
	
	@When("^Click on heart icon of name1$")
	public void clickOnheartIcons() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnheartIcon());
	}
	
	@When("^Click on No$")
	public void clickOnnoButtons() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnnoButton());
	}
	
	@When("^Click on Yes$")
	public void clickOnyesButtons() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnyesButton());
	}
	
	@When("^Swipe name1 to right or left to delete$")
	public void clickOnfavouriteNames() throws Throwable {
		Assert.assertTrue(objPPlusNamePage.clickOnfavouriteName());
	}
	
	@Then("^Baby Names are added and selected from country listing into favourite listing$")
	public void BabyNames() throws Throwable {
		System.out.println("  ");
	}
	
}
