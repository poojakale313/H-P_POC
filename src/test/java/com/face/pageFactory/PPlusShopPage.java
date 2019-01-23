package com.face.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;

public class PPlusShopPage extends StepBase2{

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	
		//ShopModules
		By clickonbabycare = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
		By clickon2Hoodedtowels = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
		By clickon2washcloths = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
		By clickonmyitemtab = By.xpath("//*[contains(@text,'MY ITEMS')]");
		By clickon2dHoodedtowels = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
		By clickon2dwashcloths = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
		By clickonlongpress2dwashcloths = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
		By deleteontab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
		By clickonpopupdelete = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
	
		
		
		public boolean clickOnBabycare() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickonbabycare);

		}

		public boolean clickOnHoodedTowels() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickon2Hoodedtowels);

		}

		public boolean clickOnWashCloths() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickon2washcloths);

		}

		public boolean clickOnMyItemTab() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickonmyitemtab);

		}

		public boolean clickOnSecondHoodedTowels() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickon2dHoodedtowels);

		}


		public boolean clickOnSecondWashCloths() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(clickon2dwashcloths);

		}
		
		
		public boolean Clicklongpresson2_3WashCloths(By locator) throws InterruptedException {
			WebElement ele = appiumDriver.findElement(clickonlongpress2dwashcloths);
			TouchAction action = new TouchAction(appiumDriver);
			action.longPress(ele).release().perform();
			return true;
//			WrapperFunctions.longpress(clickonlongpress2dwashcloths);
		}
		
}
