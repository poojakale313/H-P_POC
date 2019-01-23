package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusContractionPage 
{
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();

	By clickonstartbtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
	By clickonalertpopup = By.id("android:id/button1");
	By clickonstopbtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
	By clickonokbutton = By.id("android:id/button1");
	
	
	public boolean clickOnConStartBtn() {
		return objWrapperFunctions.mobileClick(clickonstartbtn);
	}

	public boolean clickOnAlertpopup() {
		return objWrapperFunctions.mobileClick(clickonalertpopup);
	}
	
	public boolean clickOnStopButton() {
		return objWrapperFunctions.mobileClick(clickonstopbtn);
	}
	
	public boolean clickOnokbutton() {
		return objWrapperFunctions.mobileClick(clickonokbutton);
	}
	
}
