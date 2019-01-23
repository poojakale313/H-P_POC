package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusPartnerBagPage {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//Partner's Bag
		By partnersbag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]");
		By partnersbookmagazine = By.xpath("//*[contains(@text,'Book, magazine')]");
		By changeofcloths = By.xpath("//*[contains(@text,'Change of clothes')]");
		By comfortableshoes = By.xpath("//*[contains(@text,'Comfortable shoes')]");
		//  By clickonmyitems = By.xpath("//*[contains(@text,'MY ITEMS')]");	
		//	By addyouritemhere = By.xpath("//*[contains(@text,'Add your item here...')]");
		By checkboxpartnersbookmagazine = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		By checkboxchangeofcloths = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
		By checkboxcomfortableshoes = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
		//	By clickonbackbtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");



		public boolean clickOnPartnersBag() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(partnersbag);

		}

		public boolean clickOnPartnersBookMagazine() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(partnersbookmagazine);

		}

		public boolean clickonChangeofCloths() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(changeofcloths);

		}

		public boolean clickOnComfortableShoes() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(comfortableshoes);

		}

		public boolean checkboxPartnersBookMagazine() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(checkboxpartnersbookmagazine);

		}

		public boolean checkboxChangeofCloths() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(checkboxchangeofcloths);

		}

		public boolean checkboxComfortableShoes() throws InterruptedException {
			Thread.sleep(4000);
			return objWrapperFunctions.mobileClick(checkboxcomfortableshoes);

		}
		

	
}
