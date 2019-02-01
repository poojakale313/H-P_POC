package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.AppiumDriver;

public class PplusMePage {

	protected static AppiumDriver appiumDriver = null;

	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();


	By btnAppoinment = By.xpath("//*[contains(@text,'Appointments')]");
	By btnMyWeight = By.xpath("//*[contains(@text,'My Weight')]");
	By birthPlan = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/android.view.ViewGroup");
	By btnToDo = By.xpath("//*[contains(@text,'To Do')]");	


	public boolean clickOnAppointmentTab(){
		return objWrapperFunctions.mobileClick(btnAppoinment);
	}

	public boolean clickOnMyWeightButton() {
		return objWrapperFunctions.mobileClick(btnMyWeight);
	}

	public boolean clickOnBirthPlan() throws InterruptedException {
		Thread.sleep(1000);
		return objWrapperFunctions.mobileClick(birthPlan);

	}

	public boolean clickOnToDoButton() {
		return objWrapperFunctions.mobileClick(btnToDo);
	}


}
