package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusMotherBagPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PPlusMotherBag {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusMotherBagPage objPPlusMotherBagPage = new PPlusMotherBagPage();
	
		
	@Then("^Click on Mother's Bag tab$")
	public void Click_on_Mothers_Bag_tab() throws InterruptedException {
		Assert.assertTrue(objPPlusMotherBagPage.clickOnMothresBag());
	}
	
	@Then("^Click on Birth Plan$")
	public void Click_on_Birth_Plan() throws InterruptedException {
		Assert.assertTrue(objPPlusMotherBagPage.clickOnBirthPlan());
	}
	
	@Then("^Click on Book Magazine$")
	public void Click_on_Book_Magazine() throws InterruptedException {
		Assert.assertTrue(objPPlusMotherBagPage.clickOnBookMagazine());
	}
	
	@Then("^Click on Breast Pads$")
	public void Click_on_Breast_Pads() throws InterruptedException {
		Assert.assertTrue(objPPlusMotherBagPage.clickOnBreastPads());
	}
	
	@Then("^Enter the text in Add your item here text box (.*)$")
	public void Enter_the_text_in_Add_your_item_here_text_box(String enterText) throws InterruptedException  
	{
		Assert.assertTrue(objPPlusMotherBagPage.setOnAddYourItemsHere(enterText));
	}
	
	@Then("^Deselects checkbox Birth Plan$")
	public void Deselects_checkbox_Birth_Plan() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.checkboxBirthPlan());
	}

	@Then("^Deselects checkbox Book Magazine$")
	public void Deselects_checkbox_Book_Magazine() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.checkboxBookMagazine());
	}

	@Then("^Deselects checkbox Breast Pads$")
	public void Deselects_checkbox_Breast_Pads() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.checkboxBreastPads());
	}

	@Then("^Click on Back arrow$")
	public void Click_on_Back_arrow() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.clickonbackbutton());
	}

	
}
