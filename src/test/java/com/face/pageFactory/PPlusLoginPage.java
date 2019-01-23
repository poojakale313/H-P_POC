
package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusLoginPage  {
	
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();

	/* ------------------------------------------------------------------------------------------------------*/
	//Login
	By clickonloginbtn = By.id("com.hp.pregnancy.lite:id/btn_login");
	By okbtn = By.id("android:id/button1");
	By inputusername = By.id("com.hp.pregnancy.lite:id/et_email");
	By inputUserPass = By.id("com.hp.pregnancy.lite:id/et_password");
	By continuebutton = By.id("com.hp.pregnancy.lite:id/btn_login");

	public boolean clickOnNoLoginBtn() {
		return objWrapperFunctions.mobileClick(clickonloginbtn);
	}

	public boolean clickOkbtn(){
		try {
			objWrapperFunctions.mobileClick(okbtn);
		} catch (Exception e) {
			//	System.out.println(".apk launched on device");
		}
		return true;
	}

	public boolean setUserName(String userName){
		return objWrapperFunctions.mobileSetText(inputusername, userName);

	}

	public boolean setUserPassword(String password){
		return objWrapperFunctions.mobileSetText(inputUserPass, password);
	}

	public boolean clickContinueBtn(){
		objWrapperFunctions.mobileClick(continuebutton);
		try {
			objWrapperFunctions.mobileClick(continuebutton);
		}catch(Exception e) {

		}
		return true;
	}

	
	
}
