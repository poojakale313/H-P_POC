package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusMyWeightPage {

	//Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//My Weight page
	
	By startingWeight = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]");
	By currentWeight = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]");
	By btnSubmitWeight = By.xpath("//*[contains(@text,'SUBMIT WEIGHT')]");
	By firstWeight = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TableLayout/android.widget.TableRow");
	By weightUnitDropDown = By.id("com.hp.pregnancy.lite:id/sp_units");
	By lbunit = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
	By stunit = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
	By btnsaveWeight = By.xpath("//*[contains(@text,'SAVE WEIGHT')]");
	By btnOkayGotIt = By.xpath("//*[contains(@text,'OKAY GOT IT')]");
	
	
	 public boolean clickOnStartingWeight() {
			return objWrapperFunctions.mobileClick(startingWeight);
		}
	 
	 public boolean selectWeightFromRoller() {
			return objWrapperFunctions.swipeHorizontal(913, 1698, 633, 1709, 1000);
		}
	 
	 public boolean clickOnSaveWeightButton() {
			return objWrapperFunctions.mobileClick(btnsaveWeight);
		}
	
	 public boolean clickOnOkGotItButton() throws InterruptedException {
			    Thread.sleep(3000);
			try {
				objWrapperFunctions.mobileClick(btnOkayGotIt);
			} catch (Exception e) {
				
			}
			return true;
		}
	 
	 public boolean clickOnCurrentWeight() {
			return objWrapperFunctions.mobileClick(currentWeight);
		}
	 
	 public boolean clickOnSubmitWeightButton() {
			return objWrapperFunctions.mobileClick(btnSubmitWeight);
		}
	
	 public boolean scrollTillFullHistory() {
			return objWrapperFunctions.swipeVerticle(700, 1855, 1000, 667, 308);
		}
	 
	 public boolean clickOnFirstWeight() {
			return objWrapperFunctions.mobileClick(firstWeight);
		}
	 
	 public boolean selectLBUnitWeightDropdown() {
		 objWrapperFunctions.mobileClick(weightUnitDropDown);
		 return objWrapperFunctions.mobileClick(lbunit);
		}
	 
	 public boolean selectSTUnitWeightDropdown() {
		 objWrapperFunctions.mobileClick(weightUnitDropDown);
		 return objWrapperFunctions.mobileClick(stunit);
		}

	 public boolean swipeFirstWeightToDelete() {
			return objWrapperFunctions.swipeHorizontal(213, 1647, 1322, 1647, 3000);
		}
	 
	 public boolean swipeSecondWeightToDelete() {
		    objWrapperFunctions.waitForMobile(3000);
			return objWrapperFunctions.swipeHorizontal(331, 1810, 1401, 1843, 3000);
		}
	 
}
