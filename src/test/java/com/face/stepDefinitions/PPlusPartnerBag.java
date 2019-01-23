package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusPartnerBagPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PPlusPartnerBag {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusPartnerBagPage objPPlusPartnerBagPage = new PPlusPartnerBagPage();
	
	@Then("^Click on Partners bag tab$")
	public void Click_on_Partners_bag_tab() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(objPPlusPartnerBagPage.clickOnPartnersBag());
	}

	@Then("^Click on book Magazine tab$")
	public void Click_on_book_Magazine_tab() throws Throwable {
		Assert.assertTrue(objPPlusPartnerBagPage.clickOnPartnersBookMagazine());
	}

	@Then("^Click on Change of Cloths$")
	public void Click_on_Change_of_Cloths() throws Throwable {
		Assert.assertTrue(objPPlusPartnerBagPage.clickonChangeofCloths());
	}

	@Then("^Click on Comfortable Shoes$")
	public void Click_on_Comfortable_Shoes() throws Throwable {
		Assert.assertTrue(objPPlusPartnerBagPage.clickOnComfortableShoes());
	}

	@Then("^Click on Deselects checkbox Book Magazine$")
	public void Click_on_Deselects_checkbox_Book_Magazine() throws Throwable {
		Assert.assertTrue(objPPlusPartnerBagPage.checkboxPartnersBookMagazine());
	}

	@Then("^Click on Deselects checkbox Change of Cloths$")
	public void Click_on_Deselects_checkbox_Change_of_Cloths() throws Throwable {
		Assert.assertTrue(objPPlusPartnerBagPage.checkboxChangeofCloths());
	}

	@Then("^Click on Deselects checkbox Comfortable Shoes$")
	public void Click_on_Deselects_checkbox_Comfortable_Shoes() throws Throwable {
		Assert.assertTrue(objPPlusPartnerBagPage.checkboxComfortableShoes());
	}


}
