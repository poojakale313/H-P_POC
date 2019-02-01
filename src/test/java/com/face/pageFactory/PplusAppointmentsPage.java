package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.AppiumDriver;

public class PplusAppointmentsPage {

protected static AppiumDriver appiumDriver = null;
	
	// Local variables
		private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
		private Utilities objUtilities = new Utilities();
		private StepBase2 objStepBase2 = new StepBase2();
		
		
		By btnQuestions = By.xpath("//*[contains(@text,'QUESTIONS')]");
		By btnClickOnAdd = By.xpath("//*[contains(@text,'ADD')]");
		
		public boolean clickOnQuestionsTab(){
			return objWrapperFunctions.mobileClick(btnQuestions);
		}
		
		public boolean clickOnAdd(){
			return objWrapperFunctions.mobileClick(btnClickOnAdd);
		}
		
		public boolean performHorizontalSwipeToDeleteRecord(){
			return objWrapperFunctions.swipeHorizontal(168, 1160, 1261, 1160, 100);
		}	
}
