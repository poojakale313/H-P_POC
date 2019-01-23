package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusBabyBagPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PPlusBabyBag {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusBabyBagPage objPPlusBabyBagPage = new PPlusBabyBagPage();
	
	@Then("^Click on Babys bag tab$")
	public void Click_on_Babys_bag_tab() throws Throwable {
		Assert.assertTrue(objPPlusBabyBagPage.clickOnBabysBag());
	}

	@Then("^Click on Three in All tab$")
	public void Click_on_Three_in_All_tab() throws Throwable {
		Assert.assertTrue(objPPlusBabyBagPage.clickOnThreeInAllOutfits());
	}

	@Then("^Click on Three Muslin Cloths$")
	public void Click_on_Three_Muslin_Cloths() throws Throwable {
		Assert.assertTrue(objPPlusBabyBagPage.clickonThreeMuslinCloths());
	}

	@Then("^Click on Bibs tab$")
	public void Click_on_Bibs_tab() throws Throwable {
		Assert.assertTrue(objPPlusBabyBagPage.clickOnBibsTab());
	}

	@Then("^Click on Deselects checkbox Three in All tab$")
	public void Click_on_Deselects_checkbox_Three_in_All_tab() throws Throwable {
		Assert.assertTrue(objPPlusBabyBagPage.checkboxThreeInAllOutfits());
	}

	@Then("^Click on Deselects checkbox Three Muslin Cloths$")
	public void Click_on_Deselects_checkbox_Three_Muslin_Cloths() throws Throwable {
		Assert.assertTrue(objPPlusBabyBagPage.checkboxThreeMuslinCloths());
	}

	@Then("^Click on Deselects checkbox Muslin Cloths$")
	public void Click_on_Deselects_checkbox_Muslin_Cloths() throws Throwable {
		Assert.assertTrue(objPPlusBabyBagPage.checkboxBibsTab());
	}

	
}
