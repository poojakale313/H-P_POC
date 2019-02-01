package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PPlusMotherBagPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PPlusMotherBag {

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	private PPlusMotherBagPage objPPlusMotherBagPage = new PPlusMotherBagPage();
	
		
	@When("^Click on Birth Plan$")
	public void Click_on_Birth_Plan() throws InterruptedException {
		Assert.assertTrue(objPPlusMotherBagPage.clickOnBirthPlan());
	}
	
	@When("^Click on Book Magazine$")
	public void Click_on_Book_Magazine() throws InterruptedException {
		Assert.assertTrue(objPPlusMotherBagPage.clickOnBookMagazine());
	}
	
	@When("^Click on Breast Pads$")
	public void Click_on_Breast_Pads() throws InterruptedException {
		Assert.assertTrue(objPPlusMotherBagPage.clickOnBreastPads());
	}
	
	@When("^Enter the text in Add your item here text box (.*)$")
	public void Enter_the_text_in_Add_your_item_here_text_box(String enterText) throws InterruptedException  
	{
		Assert.assertTrue(objPPlusMotherBagPage.setOnAddYourItemsHere(enterText));
	}
	
	@When("^Deselects checkbox Birth Plan$")
	public void Deselects_checkbox_Birth_Plan() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.checkboxBirthPlan());
	}

	@When("^Deselects checkbox Book Magazine$")
	public void Deselects_checkbox_Book_Magazine() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.checkboxBookMagazine());
	}

	@When("^Deselects checkbox Breast Pads$")
	public void Deselects_checkbox_Breast_Pads() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.checkboxBreastPads());
	}

	@When("^Click long press on Book Magazine$")
	public void click_long_press_on_Book_Magazine() throws InterruptedException {
		objPPlusMotherBagPage.ClicklongpressonBookMagazine(null);
	}
	
	@When("^Click long press on Birth Plan$")
	public void click_long_press_on_Birth_Plan() throws InterruptedException {
		objPPlusMotherBagPage.ClicklongpressonBirthPlan(null);
	}
	
	@When("^Click long press on Breast Pads$")
	public void click_long_press_on_Breast_Pads() throws InterruptedException {
		objPPlusMotherBagPage.ClicklongpressonBreastPads(null);
	}
	
	@When("^Click on Suggested Button$")
	public void Click_on_Suggested_Button() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.ClickonSuggestedButton());
	}

	
	@When("^Click on Back arrow$")
	public void Click_on_Back_arrow() throws Throwable {
		Assert.assertTrue(objPPlusMotherBagPage.clickonbackbutton());
	}
 
	@Then("^Suggested Items from different hospital bags are added into my items list$")
	public void Suggested_Items_from_different_hospital_bags_are_added_into_my_items_list() throws Throwable {
		System.out.println(" ");
	}
	
	
}
