package com.face.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.face.pageFactory.PPlusShopPage;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;

public class PPlusShop extends StepBase2 {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PPlusShopPage objPPlusShopPage = new PPlusShopPage();
	
	
		
	@Then("^Click on baby care$")
	public void click_on_baby_care() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnBabycare());
	}
	

	@Then("^Click on first Hooded towels$")
	public void click_on_first_Hooded_towels() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnHoodedTowels());
	}


	@Then("^Click on first Wash Cloths$")
	public void click_on_first_Wash_Cloths() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnWashCloths());
	}
	

	@Then("^Click on My Items tab$")
	public void Click_on_My_Items_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnMyItemTab());
	}
	
	
	@Then("^Click on second Hooded towels$")
	public void click_on_second_Hooded_towels() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnSecondHoodedTowels());
	}
	
	@Then("^Click on second Wash Cloths$")
	public void click_on_second_Wash_Cloths() throws InterruptedException {
		Assert.assertTrue(objPPlusShopPage.clickOnSecondWashCloths());
	}
	
	@Then("^Click long press on  2-3 Wash Cloths$")
	public void Clicklongpresson2_3WashCloths() throws InterruptedException {
		objPPlusShopPage.Clicklongpresson2_3WashCloths(null);
	}
}
