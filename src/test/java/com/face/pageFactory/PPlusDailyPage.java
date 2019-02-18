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

public class PPlusDailyPage {

	public static String initialText = "test";
	public static String initialText1 = "test";
	public static String finalText = "test";

	static boolean para1 = false;
	static boolean para2 = false;
	static boolean para3 = false;
	static boolean para4 = false;
	static boolean para5 = false;

	
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	
	
	
public boolean GetTextToVerify() throws IOException, InterruptedException {
		

		for (int j = 38;  j >= -10 ; j = j-4) 
		{
			System.out.println(j);
			if (j >= 2) {
				Thread.sleep(5000);
				By day38 = By.xpath("//*[@text='"+j+"']");
				Thread.sleep(5000);
				objWrapperFunctions.mobileClick(day38);



			} else {
				Thread.sleep(2000);
				By day1 = By.xpath("//*[@text='1']");
				Thread.sleep(2000);
				objWrapperFunctions.mobileClick(day1);
				break;

			}

		}

//		// Reading data from XL
//		System.out.println("Reading Excel sheet");
//		FileInputStream file = new FileInputStream("APK_File/daily (1).xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet sheet = workbook.getSheet("daily");
//
//		Iterator itr = sheet.iterator();
//		Row rowitr = (Row) itr.next();
//		Iterator cellitr = rowitr.cellIterator();
//		int rowCount = sheet.getLastRowNum();
//		System.out.println("Total no of pages: " + rowCount);
//
//		for (int i = 0; i <= rowCount; i++) {
//			initialText = objStepBase2.getDriver().findElement(By.xpath(txtDailyPage1)).getText();
//			String finalText = initialText.trim();
//			// System.out.println("Device:" + finalText);
//
//			String cellValue = sheet.getRow(i).getCell(3).getStringCellValue();
//			// System.out.println(i);
//			// System.out.println(cellValue);
//
//			String re1 = "<([^>]+)>"; // Tag 1
//			String re2 = "([^<]*)"; // Variable Name 1
//			String re3 = re1;
//
//			StringBuffer sbuff = new StringBuffer();
//			Pattern p = Pattern.compile(re1 + re2 + re3, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
//			Matcher m = p.matcher(cellValue);
//
//			while (m.find()) {
//				String var1 = m.group(2);
//				m.appendReplacement(sbuff,var1.toString().trim());
//			}
//			m.appendTail(sbuff);
//			String finalCellValue = sbuff.toString();
//			//     System.out.println(sbuff.toString());
//
//			if (finalText.equals(finalCellValue)) {
//				System.out.println(i + " :Pass");
//			} else {
//				System.out.println(i + " :Fail");
//			}
//			Thread.sleep(2000);
//			objWrapperFunctions.swipeHorizontal(1370, 1400, 100, 1400, 500);
//			Thread.sleep(1000);
//		}

		return true;
	}

	
}
