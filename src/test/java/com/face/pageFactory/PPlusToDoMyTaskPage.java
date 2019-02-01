package com.face.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.TouchAction;

public class PPlusToDoMyTaskPage extends StepBase2{

	//Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//MyTask
    By selectMyTaskTab = By.xpath("//androidx.appcompat.app.ActionBar.b[@content-desc='My Tasks']");
    By textboxTypeYourTask = By.id("com.hp.pregnancy.lite:id/et_add_todo_item");
    By checkboxMaternity = By.xpath("//*[contains(@text,'Discuss maternity leave with my boss')]");
    By checkboxWorkingFromHome = By.xpath("//*[contains(@text,'Discuss working from home to cope with morning sickness')]");
    By chechboxBookFitting = By.xpath("//*[contains(@text,'Book a fitting for a maternity bra')]");
    By longPressOnDiscussMaternity = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    By deleteIconToDoMyTask = By.id("com.hp.pregnancy.lite:id/tv_toolbar_profile");
    By btnDeleteOnPopup = By.xpath("//*[contains(@text,'DELETE')]");
    public boolean clickOnMyTask() {
		return objWrapperFunctions.mobileClick(selectMyTaskTab);
	}
    
    public boolean enterYourTask(String task) {
		objWrapperFunctions.mobileSetText(textboxTypeYourTask, task);
		return true;
	}
    
    public boolean selectcheckboxMaternity() {
		return objWrapperFunctions.mobileClick(checkboxMaternity);
	}
    public boolean selectcheckboxWorkingFromHome() {
		return objWrapperFunctions.mobileClick(checkboxWorkingFromHome);
	}
    public boolean selectcheckboxBookFitting() {
		return objWrapperFunctions.mobileClick(chechboxBookFitting);
	}
    
    public boolean deselectCheckboxMaternity() {
		return objWrapperFunctions.mobileClick(checkboxMaternity);
	}
    public boolean deselectCheckboxWorkingFromHome() {
		return objWrapperFunctions.mobileClick(checkboxWorkingFromHome);
	}
    public boolean deselectCheckboxBookFitting() {
		return objWrapperFunctions.mobileClick(chechboxBookFitting);
	}
    
   
    public boolean longPressOnDiscussMaternity(By locator) throws InterruptedException {
    	   WebElement ele = appiumDriver.findElement(longPressOnDiscussMaternity);
    	   TouchAction action = new TouchAction(appiumDriver);
    	   action.longPress(ele).release().perform();
    	   return true;
    	//   WrapperFunctions.longpress(clickonlongpress2dwashcloths);
    	  }
    
    public boolean clickOnDeleteIconToDoMyTask() {
  		return objWrapperFunctions.mobileClick(deleteIconToDoMyTask);
  	}
    
    public boolean clickOnDeleteButtonOnPopup() {
  		return objWrapperFunctions.mobileClick(btnDeleteOnPopup);
  	}
}
