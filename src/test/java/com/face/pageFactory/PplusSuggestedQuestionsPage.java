package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.AppiumDriver;

public class PplusSuggestedQuestionsPage {

protected static AppiumDriver appiumDriver = null;
	
	// Local variables
		private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
		private Utilities objUtilities = new Utilities();
		private StepBase2 objStepBase2 = new StepBase2();
		
		By clickFirstQuestion = By.xpath("//*[contains(@text,'I can’t sleep at night. Is there anything I can do?')]");
		By clickSecondQuestion = By.xpath("//*[contains(@text,'I feel bloated. Is this normal? What can I do?')]");
		By clickThirdQuestion = By.xpath("//*[contains(@text,'I feel dizzy sometimes. Should I be concerned?')]");	
		
		public boolean selectFirstQuestion(){
			return objWrapperFunctions.mobileClick(clickFirstQuestion);
		}

		public boolean selectSecondQuestion(){
			return objWrapperFunctions.mobileClick(clickSecondQuestion);
		}

		public boolean selectThirdQuestion(){
			return objWrapperFunctions.mobileClick(clickThirdQuestion);
		}
}
