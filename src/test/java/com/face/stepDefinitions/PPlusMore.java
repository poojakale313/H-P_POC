package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusMorePage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PPlusMore {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusMorePage objPPlusMorePage = new PPlusMorePage();
	

	
	@Then("^Click on shop tab$")
	public void click_on_shop_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusMorePage.clickOnShopTab());
	}
	
	@Then("^Click on Hospital Bag tab$")
	public void Click_on_Hospital_Bag_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusMorePage.clickOnHospitalBag());
	}
	
	@Then("^Click on Contractions tab$")
	public void Click_on_Contractions_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusMorePage.clickOnContractionTab());
	}
	
	@Then("^Click on Kick Counter tab$")
	public void click_On_Counter_Icon() throws InterruptedException {
		Assert.assertTrue(objPPlusMorePage.clickOnCounterIcon());
	}
	
}
