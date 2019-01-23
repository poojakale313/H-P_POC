package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusBabyBagPage {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//Baby's Bag
		By babysbag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]");
		By threeinall = By.xpath("//*[contains(@text,'3 all-in-one stretchy outfits')]");
		By threemuslincloths = By.xpath("//*[contains(@text,'3 muslin cloths / burp cloths')]");
		By clickonbibs = By.xpath("//*[contains(@text,'Bibs')]");
		//  By clickonmyitems = By.xpath("//*[contains(@text,'MY ITEMS')]");	
		//	By addyouritemhere = By.xpath("//*[contains(@text,'Add your item here...')]");
		By checkboxthreeinall = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		By checkboxmuslincloths = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
		By checkboxbibs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");


		public boolean clickOnBabysBag() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(babysbag);

		}

		public boolean clickOnThreeInAllOutfits() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(threeinall);

		}

		public boolean clickonThreeMuslinCloths() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(threemuslincloths);

		}

		public boolean clickOnBibsTab() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickonbibs);

		}

		public boolean checkboxThreeInAllOutfits() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(checkboxthreeinall);

		}

		public boolean checkboxThreeMuslinCloths() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(checkboxmuslincloths);

		}

		public boolean checkboxBibsTab() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(checkboxbibs);

		}
		

	
}