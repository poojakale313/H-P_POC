package com.face.pageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusBabyPage {

	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	
	By babyName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[6]/android.view.ViewGroup");
	By btnDaily = By.xpath("//*[@text='Daily']");
	By btnWeekly = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView");
	
	
	public boolean clickOnbabyName() throws InterruptedException {
		Thread.sleep(1000);
		return objWrapperFunctions.mobileClick(babyName);

	}
	
	public boolean clickOnDailyTab() throws InterruptedException {
		Thread.sleep(2000);
		return objWrapperFunctions.mobileClick(btnDaily);

	}
	
	public boolean clickOnWeeklyTab() {

		return objWrapperFunctions.mobileClick(btnWeekly);

	}
	

	
	
}
