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
	By contractionDownArrow = By.id("com.hp.pregnancy.lite:id/iv_down_arrow");
	By contractionLast3 = By.xpath("//*[contains(@text,'LAST 3')]");
	By contractionLast5 = By.xpath("//*[contains(@text,'LAST 5')]");
	By contractionALL = By.xpath("//*[contains(@text,'ALL')]");


	public boolean clickOnConStartBtn() {
		return objWrapperFunctions.mobileClick(clickonstartbtn);
	}

	 public boolean clickOnAlertpopup() {
		  //return objWrapperFunctions.mobileClick(clickonalertpopup);
		  try {
		      objWrapperFunctions.mobileClick(clickonalertpopup);
		     } catch (Exception e) {

		     }
		     return true;
		    }


	public boolean clickOnStopButton() {
		return objWrapperFunctions.mobileClick(clickonstopbtn);
	}

	public boolean clickOnokbutton() {
		  try{
		   objWrapperFunctions.mobileClick(clickonokbutton);
		  }
		  catch (Exception e) {    
		    }
		  return true;
		 }

	public boolean ScrollDownToViewOverviewAndContractionInfo() {
		objWrapperFunctions.mobileClick(contractionDownArrow);
		objWrapperFunctions.waitForMobile(1000);
		return objWrapperFunctions.swipeVerticle(644,2090,2000,616,95);
	}

	public boolean SwitchTheTabsFromLast3ToLast5OrAll() {
		objWrapperFunctions.mobileClick(contractionLast5);
		objWrapperFunctions.mobileClick(contractionALL);
		return objWrapperFunctions.mobileClick(contractionLast3);
	}

	public boolean SwipeAnyRecordShownInSessionHistoryToDelete() {
		objWrapperFunctions.waitForMobile(3000);
		return objWrapperFunctions.swipeHorizontal(207,1681,1373,1692,2000);
	}


}
