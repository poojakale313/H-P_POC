package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusMotherBagPage {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	

		//Mother's Bag
		By mothersbag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView");
		By birthplan = By.xpath("//*[contains(@text,'Birth plan')]");
		By bookmagazine = By.xpath("//*[contains(@text,'Book, magazine')]");
		By breastpads = By.xpath("//*[contains(@text,'Breast pads')]");
		By clickonmyitems = By.xpath("//*[contains(@text,'MY ITEMS')]");
		By addyouritemhere = By.xpath("//*[contains(@text,'Add your item here...')]");
		By checkboxbirthplan = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		By checkboxbookmagazine = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
		By checkboxbreastpads = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
		By clickonbackbtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

	
		public boolean clickOnMothresBag() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(mothersbag);

		}

		public boolean clickOnBirthPlan() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(birthplan);

		}

		public boolean clickOnBookMagazine() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(bookmagazine);

		}

		public boolean clickOnBreastPads() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(breastpads);

		}

		public boolean clickOnMyItems() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickonmyitems);

		}

		public boolean setOnAddYourItemsHere(String enterText) throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileSetText(addyouritemhere, enterText);

		}

		public boolean checkboxBirthPlan() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(checkboxbirthplan);

		}

		public boolean checkboxBookMagazine() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(checkboxbookmagazine);

		}

		public boolean checkboxBreastPads() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(checkboxbreastpads);

		}

		public boolean clickonbackbutton() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickonbackbtn);

		}


	
}
