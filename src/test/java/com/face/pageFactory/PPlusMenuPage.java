package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusMenuPage {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//BabyTab
	By baby = By.id("com.hp.pregnancy.lite:id/navigation_baby");
	//MeTab
	By btnMe = By.xpath("//android.widget.FrameLayout[@content-desc='Me']/android.widget.ImageView");
	By btnRemindMeLater = By.xpath("//*[contains(@text,'Remind me later')]");
	//MoreTab
	By clickonmoretab = By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView");
	
	By meMenu = By.xpath("//android.widget.FrameLayout[@content-desc='Me']");
	
	public boolean clickOnbaby() throws InterruptedException {
		Thread.sleep(1000);
		return objWrapperFunctions.mobileClick(baby);

	}
	
//	public boolean clickOnMeTab() {
//		objWrapperFunctions.mobileClick(btnMe);
//		try{
//			objWrapperFunctions.mobileClick(btnRemindMeLater);
//		}catch(Exception e){
//			System.out.println("Remind me later button not appeared");
//		}
//		return true;
//	}
//	
	public boolean clickOnMeMenu() throws InterruptedException {
		Thread.sleep(2000);
		return objWrapperFunctions.mobileClick(meMenu);

	}
	
	
	public boolean clickMoreTabBtn() throws InterruptedException{
		Thread.sleep(5000);
		return objWrapperFunctions.mobileClick(clickonmoretab);
	}
}
