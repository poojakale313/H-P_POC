package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusMorePage {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//MoreTab
	By clickonmoretab = By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView");
    //Shopping
	By clickonshoptab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView");
	//Hospital Bag
    By hospitalbag = By.xpath("//*[contains(@text,'Hospital Bag')]");
	//Contraction
    By contractiontab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView");
	
	public boolean clickMoreTabBtn() throws InterruptedException{
		Thread.sleep(5000);
		return objWrapperFunctions.mobileClick(clickonmoretab);
	}

	public boolean clickOnShopTab() {
		return objWrapperFunctions.mobileClick(clickonshoptab);
	}

	public boolean clickOnHospitalBag() throws InterruptedException {
		Thread.sleep(2000);
		return objWrapperFunctions.mobileClick(hospitalbag);

	}

	public boolean clickOnContractionTab() throws InterruptedException {
		Thread.sleep(2000);
		return objWrapperFunctions.mobileClick(contractiontab);

	}

}
