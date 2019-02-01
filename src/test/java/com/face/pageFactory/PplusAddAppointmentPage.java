package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.AppiumDriver;

public class PplusAddAppointmentPage {

protected static AppiumDriver appiumDriver = null;
	
	// Local variables
		private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
		private Utilities objUtilities = new Utilities();
		private StepBase2 objStepBase2 = new StepBase2();
		
		By btnAddName = By.xpath("//*[contains(@text,'Name')]");
		By btnDateAdd = By.xpath("//android.widget.EditText[contains(@resource-id,'com.hp.pregnancy.lite:id/et_date')]");
		By btnDateOk = By.xpath("//android.widget.Button[contains(@resource-id,'com.hp.pregnancy.lite:id/mdtp_ok')]");
		By btnTimeAdd = By.xpath("//android.widget.EditText[contains(@resource-id,'com.hp.pregnancy.lite:id/et_time')]");
		By btnTimeOk = By.xpath("//android.widget.Button[contains(@resource-id,'com.hp.pregnancy.lite:id/mdtp_ok')]");
		By btnClickWeight = By.xpath("//android.widget.EditText[contains(@resource-id,'com.hp.pregnancy.lite:id/et_my_weight')]");
		By btnSaveWeight = By.xpath("//*[contains(@text,'SAVE WEIGHT')]");
		By btnClickBP = By.xpath("//*[contains(@text,'BP')]");
		By btnSaveBP = By.xpath("//*[contains(@text,'SAVE')]");
		By btnClickBabyHeart = By.xpath("//android.widget.EditText[contains(@resource-id,'com.hp.pregnancy.lite:id/et_baby_heart')]");
		By btnClickSaveBabyHeart = By.xpath("//*[contains(@text,'SAVE')]");
		By btnCalenderON = By.xpath("//*[contains(@text,'ON')]");
		By btnCalenderOFF = By.xpath("//*[contains(@text,'OFF')]");
		By btnClickFinalSave = By.xpath("//*[contains(@text,'SAVE')]");
		By btnAllowPopUp = By.xpath("//*[contains(@text,'ALLOW')]");
		By drpdwnDoctor = By.xpath("//*[contains(@text,'Doctor')]");
		By btnSelectType = By.xpath("//*[contains(@text,'Health Visitor')]");
		By btnOkType = By.xpath("//*[contains(@text,'OK')]");
		
		public boolean enterPatientName(String NewName){
			return objWrapperFunctions.mobileSetText(btnAddName, NewName);		
		}
		
		public boolean selectDropDownDoctor(){
			objWrapperFunctions.mobileClick(drpdwnDoctor);
			objWrapperFunctions.mobileClick(btnSelectType);
			return objWrapperFunctions.mobileClick(btnOkType);
		}
		
		public boolean clickOnDate(){
			return objWrapperFunctions.mobileClick(btnDateAdd);
		}
		
		public boolean clickOnDateOK(){
			return objWrapperFunctions.mobileClick(btnDateOk);
		}
		
		public boolean clickOnTime(){
			return objWrapperFunctions.mobileClick(btnTimeAdd);
		}
		
		public boolean performHorizontalSwipe(){
			return objWrapperFunctions.swipeHorizontal(712, 1614, 874, 1591, 100);
		}
		
		public boolean clickOnOkTime(){
			return objWrapperFunctions.mobileClick(btnTimeOk);
		}
		
		public boolean clickOnWeight(){
			return objWrapperFunctions.mobileClick(btnClickWeight);
		}
		
		public boolean performHorizontalSwipeForWeightKg(){
			return objWrapperFunctions.swipeHorizontal(712, 1709, 146, 1709, 100);
		}
		
		public boolean performHorizontalSwipeForWeightGram(){
			return objWrapperFunctions.swipeHorizontal(712, 2023, 353, 2023, 100);
		}
		
		public boolean clickOnSaveWeight(){
			return objWrapperFunctions.mobileClick(btnSaveWeight);
		}
		
		public boolean clickOnBP(){
			return objWrapperFunctions.mobileClick(btnClickBP);
		}
		
		public boolean performHorizontalSwipeForBP(){
			return objWrapperFunctions.swipeHorizontal(712, 1003, 342, 1003, 100);
		}
		
		public boolean performHorizontalSwipeForBP2(){
			return objWrapperFunctions.swipeHorizontal(712, 1871, 308, 1871, 100);
		}
		
		public boolean clickOnSaveBP(){
			return objWrapperFunctions.mobileClick(btnSaveBP);
		}
		
		public boolean clickOnBabysHeart(){
			return objWrapperFunctions.mobileClick(btnClickBabyHeart);
		}
		
		public boolean performHorizontalSwipeForBabyHeart(){
			return objWrapperFunctions.swipeHorizontal(740, 1804, 364, 1804, 100);
		}
		
		public boolean clickOnSaveBabyHeart(){
			return objWrapperFunctions.mobileClick(btnClickSaveBabyHeart);
		}
		
		public boolean performVerticalSwipeAfterBabyHeart() throws InterruptedException{
			Thread.sleep(3000);
			//return objWrapperFunctions.swipeVerticle(1177, 1944, 1000, 1177, 1014);
			return objWrapperFunctions.swipeVerticle(620,1976,2000,525,748);
		}
		
		public boolean clickCalenderON(){
			return objWrapperFunctions.mobileClick(btnCalenderOFF);
		}
		
		public boolean clickCalenderOFF(){
			return objWrapperFunctions.mobileClick(btnCalenderON);
		}
		
		public boolean clickAppointmentSave(){
			objWrapperFunctions.mobileClick(btnClickFinalSave);
			try{
				objWrapperFunctions.mobileClick(btnAllowPopUp);
			}catch(Exception e){
				System.out.println("Allow popup not appeared");
			}
			return true;
		}
}
