package com.face.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class PplusMyitemsPage {

protected static AppiumDriver appiumDriver = null;
	
	// Local variables
		private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
		private Utilities objUtilities = new Utilities();
		private StepBase2 objStepBase2 = new StepBase2();
		
		By clickMyItems = By.xpath("//*[contains(@text,'MY ITEMS')]");
		By txtAddQuestion = By.xpath("//*[contains(@text,'Add question')]");
		By txtAddAnswer = By.xpath("//*[contains(@text,'Type answer...')]");
		By clickFirstQuestion = By.xpath("//*[contains(@text,'I can’t sleep at night. Is there anything I can do?')]");
		By btnDelete = By.id("com.hp.pregnancy.lite:id/tv_toolbar_profile");
		By brnDeletePopup = By.xpath("//*[contains(@text,'DELETE')]");
		By btnClickUpDownArrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		By btnClickNavigateBack = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
		
		public boolean clickOnMyItemsTab(){
			return objWrapperFunctions.mobileClick(clickMyItems);
		}
		
		public boolean enterQuestion(String Question){
			return objWrapperFunctions.mobileSetText(txtAddQuestion, Question);
		}
		
		
		public boolean ClicklongpressonFirstQuestion(By locator) throws InterruptedException {
			WebElement ele = appiumDriver.findElement(clickFirstQuestion);
			TouchAction action = new TouchAction(appiumDriver);
			action.longPress(ele).release().perform();
			return true;
//			WrapperFunctions.longpress(clickonlongpress2dwashcloths);
		}
		
		
		public boolean clickOnDeleteButton(){
			return objWrapperFunctions.mobileClick(btnDelete);
		}

		public boolean clickOnDeleteButtonPopup(){
			return objWrapperFunctions.mobileClick(brnDeletePopup);
		}
		
		public boolean clickOnDownArrow(){
			return objWrapperFunctions.mobileClick(btnClickUpDownArrow);
		}
		
		public boolean enterAnswer(String Answer){
		 objWrapperFunctions.mobileSetText(txtAddAnswer, Answer);
		 objWrapperFunctions.selectEnter();
		 return true;
		}
		
		public boolean clickOnUpArrow() {
			objWrapperFunctions.mobileClick(btnClickUpDownArrow);
			objWrapperFunctions.navigateBack();
			objWrapperFunctions.navigateBack();
			return true;
		}
}
