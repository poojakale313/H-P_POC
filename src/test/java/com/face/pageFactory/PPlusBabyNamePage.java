package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusBabyNamePage {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//Baby Names Module
		
		
		By americanName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout");
		By name1 = By.xpath("//*[contains(@text,'1. Noah')]");
		By name2 = By.xpath("//*[contains(@text,'2. Liam')]");
		By name3 = By.xpath("//*[contains(@text,'3. Mason')]");
		By name4 = By.xpath("//*[contains(@text,'4. Jacob')]");
//		By gender = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		By gender = By.id ("com.hp.pregnancy.lite:id/girl");
		By name5 = By.xpath("//*[contains(@text,'1. Emma')]");
		By name6 = By.xpath("//*[contains(@text,'2. Olivia')]");
		By name7 = By.xpath("//*[contains(@text,'3. Sophia')]");
		By name8 = By.xpath("//*[contains(@text,'4. Isabella')]");
		By backArrow = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
		By favourite = By.xpath("//androidx.appcompat.app.ActionBar.b[@content-desc='My Favourites']");
		By heartIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
		By noButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]");
		By yesButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
		By favouriteName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
		
		
		
		
		public boolean clickOnamericanName() throws InterruptedException {
			Thread.sleep(1000);
			return objWrapperFunctions.mobileClick(americanName);

		}

		public boolean clickOnname1() throws InterruptedException {
			Thread.sleep(1000);
			return objWrapperFunctions.mobileClick(name1);

		}
		
		public boolean clickOnname2() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(name2);

		}
		
		public boolean clickOnname3() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(name3);

		}
		
		public boolean clickOnname4() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(name4);

		}
		
		public boolean clickOngender() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(gender);

		}
		
		public boolean clickOnname5() throws InterruptedException {
			Thread.sleep(4000);
			return objWrapperFunctions.mobileClick(name5);

		}
		
		public boolean clickOnname6() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(name6);

		}
		
		public boolean clickOnname7() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(name7);

		}
		
		public boolean clickOnname8() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(name8);

		}
		
//		public boolean clickOnbackArrow() throws InterruptedException {
//			Thread.sleep(2000);
//			return objWrapperFunctions.mobileClick(backArrow);
//
//		}
		
		public boolean clickOnfavourite() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(favourite);

		}
		
		public boolean clickOnheartIcon() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(heartIcon);

		}
		
		public boolean clickOnnoButton() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(noButton);

		}
		
		public boolean clickOnyesButton() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(yesButton);

		}
		
		public boolean clickOnfavouriteName() throws InterruptedException {
			Thread.sleep(4000);
			return objWrapperFunctions.swipeHorizontal(74, 831, 1308, 842, 2000);

		}
		
		
}
