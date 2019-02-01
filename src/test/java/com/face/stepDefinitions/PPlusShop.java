package com.face.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.face.pageFactory.PPlusShopPage;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;

public class PPlusShop extends StepBase2 {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PPlusShopPage objPPlusShopPage = new PPlusShopPage();
	
	
		
	@When("^Click on baby care$")
	public void click_on_baby_care() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnBabycare());
	}
	

	@When("^Click on first Hooded towels$")
	public void click_on_first_Hooded_towels() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnHoodedTowels());
	}


	@When("^Click on first Wash Cloths$")
	public void click_on_first_Wash_Cloths() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnWashCloths());
	}
	

	@When("^Click on My Items tab$")
	public void Click_on_My_Items_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnMyItemTab());
	}
	
	
	@When("^Click on second Hooded towels$")
	public void click_on_second_Hooded_towels() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnSecondHoodedTowels());
	}
	
	@When("^Click on second Wash Cloths$")
	public void click_on_second_Wash_Cloths() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnSecondWashCloths());
	}
	
	@When("^Click long press on  2-3 Wash Cloths$")
	public void Clicklongpresson2_3WashCloths() throws InterruptedException {
		objPPlusShopPage.Clicklongpresson2_3WashCloths(null);
	}
	
	@When("^Click on delete icon$")
	public void click_on_delete_icon() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOndeletebtn());
	}
	
	@When("^Click on pop up delete tab$")
	public void click_on_pop_up_delete_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnpopupdeletetab());
	}
	
	@Then("^Suggested Items from different shopping sections are added into my items list$")
	public void SuggestedItemsshopping() throws InterruptedException {
		System.out.println(" ");
	}
	
}

