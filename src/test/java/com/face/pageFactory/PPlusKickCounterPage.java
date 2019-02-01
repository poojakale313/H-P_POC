package com.face.pageFactory;
import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusKickCounterPage {
	
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	// Buttons-amol
	By btnMore = By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView");
	
	By btnFootIcon = By.id("com.hp.pregnancy.lite:id/kickBtn");
	By btnFinish = By.id("com.hp.pregnancy.lite:id/btn_finish");
	By btnNoAlertForFinishBtn = By.id("android:id/button2");
	By btnYesAlertForFinishBtn = By.id("android:id/button1");
	By btnDoneforEndsSession = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");
	By btnBack = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
	By btnUndo = By.id("com.hp.pregnancy.lite:id/btn_undo");
	By btnUndoAlertNoBtn = By.xpath("//*[contains(@text,'NO')]");
	By btnUndoAlertYesBtn = By.xpath("//*[contains(@text,'YES')]");
	By btnDoneSessionSaved = By.xpath("//*[contains(@text,'DONE')]");
	By btnHistory = By.xpath("//*[contains(@text,'History')]");
	
	
//	public boolean clickOnMoreButton(){
//		return objWrapperFunctions.mobileClick(btnMore);
//	}

	
	public boolean clickOnFootIcon2Times(){
		objWrapperFunctions.mobileClick(btnFootIcon);
		return objWrapperFunctions.mobileClick(btnFootIcon);
	}

	public boolean clickOnFinishButton(){
		return objWrapperFunctions.mobileClick(btnFinish);
	}

	public boolean clickOnNoButtonOnAlert(){
		return objWrapperFunctions.mobileClick(btnNoAlertForFinishBtn);
	}
	
	public boolean clickOnYesButtonOnAlert(){
		return objWrapperFunctions.mobileClick(btnYesAlertForFinishBtn);
	}
	
	public boolean clickOnDoneButtonForEndSession(){
		return objWrapperFunctions.mobileClick(btnDoneforEndsSession);
	}
	
//	public boolean clickOnBackArrow(){
//		return objWrapperFunctions.mobileClick(btnBack);
//	}
//	
	public boolean clickOnFootIcon10Time(){
		for(int i= 1; i<=9; i++)
		{
			objWrapperFunctions.mobileClick(btnFootIcon);
		}
		return objWrapperFunctions.mobileClick(btnFootIcon);
	}
	
	public boolean clickOnUndoButton(){
		return objWrapperFunctions.mobileClick(btnUndo);
	}
	
	public boolean clickOnUndoButtonNo(){
		return objWrapperFunctions.mobileClick(btnUndoAlertNoBtn);
	}
	
	public boolean clickOnUndoButtonYes(){
		return objWrapperFunctions.mobileClick(btnUndoAlertYesBtn);
	}

	public boolean clickOnDoneForSessionSavedPopUp(){
		return objWrapperFunctions.mobileClick(btnDoneSessionSaved);
	}

	public boolean clickOnHistoryBtn(){
		return objWrapperFunctions.mobileClick(btnHistory);
	}

	public boolean clickOnSwipeToDeleteEntry(){
		objWrapperFunctions.waitForMobile(2000);
		return objWrapperFunctions.swipeHorizontal(263,863,1423,868,3000);
	}
}
