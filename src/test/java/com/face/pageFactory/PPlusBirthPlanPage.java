package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusBirthPlanPage {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	//Me Module
				
		By environmentTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup");
		By femaleDoctor = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		By privateRoom = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
		By giveBirth = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
		By myItems = By.xpath("//androidx.appcompat.app.ActionBar.b[@content-desc='My Items']");
		By taskTextBox = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
		By backArrow1 = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
		By companionsTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup");
		By wantAny = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		By partner = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
		By labor = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
		By item = By.xpath("//androidx.appcompat.app.ActionBar.b[@content-desc='My Items']");
		
		
		
		public boolean clickOnEnvironment() throws InterruptedException {
			Thread.sleep(1000);
			return objWrapperFunctions.mobileClick(environmentTab);

		}
		
		public boolean clickOnfemaleDoctor() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(femaleDoctor);

		}
		
		public boolean clickOnprivateRoom() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(privateRoom);

		}
		
		public boolean clickOngiveBirth() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(giveBirth);

		}
		
		public boolean clickOnmyItems() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(myItems);

		}
		
		public boolean settaskTextBox(String text) throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileSetText(taskTextBox, text);

		}
		
		public boolean clickOnBackArrow() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(backArrow1);

		}
		
		public boolean clickOnCompanions() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(companionsTab);

		}
		
		public boolean clickOnwantAny() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(wantAny);

		}
		
		public boolean clickOnPartner() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(partner);

		}
		
		public boolean clickOnlabor() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(labor);

		}
		
		public boolean clickOnItem() throws InterruptedException {
			Thread.sleep(2000);
			return objWrapperFunctions.mobileClick(item);

		}					
	
}
