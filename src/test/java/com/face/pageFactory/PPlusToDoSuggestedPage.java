package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusToDoSuggestedPage {

	
	//Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//Me 
	By btnMe = By.id("com.hp.pregnancy.lite:id/navigation_me");
	
	
    //Suggested 
	By selectSuggestedTab = By.xpath("//androidx.appcompat.app.ActionBar.b[@content-desc='SUGGESTED']");
	By selectDiscussMaternity = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    By selectDiscussWorking = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
    By selectBookFitting = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
    By dropdownWeek6 = By.xpath("//*[contains(@text,'Week 6')]");
    By dropdownWeek = By.xpath("//*[contains(@text,'Week 9')]");
    By selectMakeAppointment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
    By selectBookAppointment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
    By btnBackArrow = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    
    
//    public boolean clickOnMeButton() {
//		return objWrapperFunctions.mobileClick(btnMe);
//	}
//    
   
    public boolean selectDiscussMaternity(){
    	return objWrapperFunctions.mobileClick(selectDiscussMaternity);
    }
    
    public boolean selectDiscussWorking(){
    	return objWrapperFunctions.mobileClick(selectDiscussWorking);
    }
    
    public boolean selectBookFitting(){
    	return objWrapperFunctions.mobileClick(selectBookFitting);
    }

    public boolean selectSuggestedTab(){
    	return objWrapperFunctions.mobileClick(selectSuggestedTab);
    }
    
    public boolean selectWeekDropDown(){   	
    	objWrapperFunctions.mobileClick(dropdownWeek6);
    	objWrapperFunctions.waitForMobile(3000);
    	return objWrapperFunctions.mobileClick(dropdownWeek);
    }
    
    public boolean clickMakeAppointment(){
    	return objWrapperFunctions.mobileClick(selectMakeAppointment);
    }
    
    public boolean clickBookAppointment(){
    	return objWrapperFunctions.mobileClick(selectBookAppointment);
    }
    
//    public boolean clickBackArrow(){
//    	return objWrapperFunctions.mobileClick(btnBackArrow);
//    }

}

