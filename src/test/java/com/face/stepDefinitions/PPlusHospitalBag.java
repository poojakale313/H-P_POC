package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusHospitalBagPage;

import cucumber.api.java.en.Then;

public class PPlusHospitalBag {

	PPlusHospitalBagPage objPPlusHospitalBagPage = new PPlusHospitalBagPage();
	
	@Then("^Click on Babys bag tab$")
	public void Click_on_Babys_bag_tab() throws Throwable {
		Assert.assertTrue(objPPlusHospitalBagPage.clickOnBabysBag());
	}
	
	@Then("^Click on Mother's Bag tab$")
	public void Click_on_Mothers_Bag_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusHospitalBagPage.clickOnMothresBag());
	}
	
	@Then("^Click on Partners bag tab$")
	public void Click_on_Partners_bag_tab() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(objPPlusHospitalBagPage.clickOnPartnersBag());
	}
	
}
