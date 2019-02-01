package com.face.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.TouchAction;

public class PPlusMotherBagPage extends StepBase2{

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	     

		//Mother's Bag
		
		By birthplan = By.xpath("//*[contains(@text,'Birth plan')]");
		By bookmagazine = By.xpath("//*[contains(@text,'Book, magazine')]");
		By breastpads = By.xpath("//*[contains(@text,'Breast pads')]");
		By clickonmyitems = By.xpath("//*[contains(@text,'MY ITEMS')]");
		By addyouritemhere = By.xpath("//*[contains(@text,'Add your item here...')]");
		By checkboxbirthplan = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		By checkboxbookmagazine = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
		By checkboxbreastpads = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
		By clickonbackbtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        By longpressonbookmagazine = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	    By clickonsuggestedtab = By.xpath("//androidx.appcompat.app.ActionBar.b[@content-desc=\"SUGGESTED\"]/android.widget.TextView");
		
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

		public boolean ClicklongpressonBookMagazine(By locator) throws InterruptedException {
			WebElement ele = appiumDriver.findElement(longpressonbookmagazine);
			TouchAction action = new TouchAction(appiumDriver);
			action.longPress(ele).release().perform();
			return true;
//			WrapperFunctions.longpress(clickonlongpress2dwashcloths);
		}
		
		public boolean ClicklongpressonBirthPlan(By locator) throws InterruptedException {
			WebElement ele = appiumDriver.findElement(checkboxbirthplan);
			TouchAction action = new TouchAction(appiumDriver);
			action.longPress(ele).release().perform();
			return true;
//			WrapperFunctions.longpress(clickonlongpress2dwashcloths);
		}
		
		public boolean ClicklongpressonBreastPads(By locator) throws InterruptedException {
			WebElement ele = appiumDriver.findElement(checkboxbreastpads);
			TouchAction action = new TouchAction(appiumDriver);
			action.longPress(ele).release().perform();
			return true;
//			WrapperFunctions.longpress(clickonlongpress2dwashcloths);
		}
		
		public boolean clickonbackbutton() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickonbackbtn);

		}

		public boolean ClickonSuggestedButton() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickonsuggestedtab);

		}
	
}
