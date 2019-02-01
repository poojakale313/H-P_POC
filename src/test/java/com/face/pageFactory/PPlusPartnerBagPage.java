package com.face.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.TouchAction;

public class PPlusPartnerBagPage extends StepBase2 {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//Partner's Bag
		
		By partnersbookmagazine = By.xpath("//*[contains(@text,'Book, magazine')]");
		By changeofcloths = By.xpath("//*[contains(@text,'Change of clothes')]");
		By comfortableshoes = By.xpath("//*[contains(@text,'Comfortable shoes')]");
		//  By clickonmyitems = By.xpath("//*[contains(@text,'MY ITEMS')]");	
		//	By addyouritemhere = By.xpath("//*[contains(@text,'Add your item here...')]");
		By checkboxpartnersbookmagazine = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		By checkboxchangeofcloths = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
		By checkboxcomfortableshoes = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
		//	By clickonbackbtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        By longpressoncomfortableshoes = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");


		

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
		
		public boolean ClicklongpressonComfortableShoes(By locator) throws InterruptedException {
			WebElement ele = appiumDriver.findElement(longpressoncomfortableshoes);
			TouchAction action = new TouchAction(appiumDriver);
			action.longPress(ele).release().perform();
			return true;
//			WrapperFunctions.longpress(clickonlongpress2dwashcloths);
		}
	
}
