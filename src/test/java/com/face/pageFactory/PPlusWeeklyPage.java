package com.face.pageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusWeeklyPage {

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
	
	
	public boolean getTextToVerifyWeeklyPages() throws IOException, InterruptedException {

		for (int k = 2 ;  k >= -10 ; k = k-4) 
			{
				System.out.println(k);
				if (k >= 2) {
					Thread.sleep(2000);
					By week6 = By.xpath("//*[@text='"+k+"']");
					Thread.sleep(2000);
					objWrapperFunctions.mobileClick(week6);



				} else {
					Thread.sleep(2000);
					By week6 = By.xpath("//*[@text='1']");
					Thread.sleep(2000);
					objWrapperFunctions.mobileClick(week6);
					break;

				}

			}

//			try {
//				objWrapperFunctions.mobileClick(btnGotIt);
//			} catch (Exception e) {
//				System.out.println("Could not find");
//				Thread.sleep(2000);
//			}

			// Reading data from XL
//			System.out.println("Reading Excel sheet");
//			FileInputStream file = new FileInputStream("C:\\Users\\user\\Documents\\weeks.xlsx");
//			XSSFWorkbook workbook = new XSSFWorkbook(file);
//			XSSFSheet sheet = workbook.getSheet("weeks");
//
//			Iterator itr = sheet.iterator();
//			Row rowitr = (Row) itr.next();
//			Iterator cellitr = rowitr.cellIterator();
//			int rowCount = sheet.getLastRowNum();
//			System.out.println("Total no of pages: " + rowCount);
//
//			objWrapperFunctions.swipeHorizontal(278, 352, 100, 352, 1000);
//			// Thread.sleep(2000);
//			// objWrapperFunctions.swipeHorizontal(183, 347, 930, 347, 1000);
//
//			for (int i = 0; i <= rowCount; i++) {
//
//				//para1
//				Thread.sleep(2000);
//				try {
//					String initialText1 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara1)).getText();
//					String finalText1 = initialText1.trim();
//					System.out.println("Device:" + finalText1);
//
//					String cellValue11 = sheet.getRow(i).getCell(2).getStringCellValue();
//					String cellValue1 = cellValue11.trim();
//					System.out.println(cellValue1);
//					if (finalText1.equals(cellValue1)) {
//						System.out.println(i + " :Pass");
//					} else {
//						System.out.println(i + " :Fail");
//					}
//				} catch (Exception e3) {
//					// TODO Auto-generated catch block
//					System.out.println("Para 1 not found");
//				}
//
//				//para2
//				objWrapperFunctions.swipeVerticle(700, 2000, 400, 700, 100);
//				Thread.sleep(2000);
//				try {
//					String initialText2 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara2)).getText();
//					System.out.println("para2  " + initialText2);
//					String finalText2 = initialText2.trim();
//					System.out.println("Device:" + finalText2);
//
//					String cellValue22 = sheet.getRow(i).getCell(4).getStringCellValue();
//					String cellValue2 = cellValue22.trim();
//					if (finalText2.equals(cellValue2)) {
//						System.out.println(i + " :Pass");
//					} else {
//						System.out.println(i + " :Fail");
//					}
//				} catch (Exception e2) {
//					// TODO Auto-generated catch block
//					System.out.println("Para 2 not found");
//				}
//
//				//para3
//				objWrapperFunctions.swipeVerticle(700, 2000, 400, 700, 750);
//				Thread.sleep(2000);
//				try {
//					String initialText3 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara3)).getText();
//					System.out.println("para3  " + initialText3);
//					String finalText3 = initialText3.trim();
//					System.out.println("Device:" + finalText3);
//
//					String cellValue33 = sheet.getRow(i).getCell(6).getStringCellValue();
//					String cellValue3 = cellValue33.trim();
//					if (finalText3.equals(cellValue3)) {
//						System.out.println(i + " :Pass");
//					} else {
//						System.out.println(i + " :Fail");
//					}
//				} catch (Exception e2) {
//					// TODO Auto-generated catch block
//					System.out.println("Para 3 not found");
//				}
//
//				//para4
//				objWrapperFunctions.swipeVerticle(700, 2000, 400, 700, 750);
//				Thread.sleep(2000);
//				try {
//					String initialText4 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara4)).getText();
//					System.out.println("para4  " + initialText4);
//					String finalText4 = initialText4.trim();
//					System.out.println("Device:" + finalText4);
//
//					String cellValue44 = sheet.getRow(i).getCell(8).getStringCellValue();
//					String cellValue4 = cellValue44.trim();
//					if (finalText4.equals(cellValue4)) {
//						System.out.println(i + " :Pass");
//					} else {
//						System.out.println(i + " :Fail");
//					}
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					System.out.println("Para 4 not found");
//				}
//
//				//para5
//				objWrapperFunctions.swipeVerticle(700, 2000, 400, 700, 750);
//				Thread.sleep(2000);
//				try {
//					String initialText5 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara5)).getText();
//					System.out.println("para5" + initialText5);
//					String finalText5 = initialText5.trim();
//					System.out.println("Device:" + finalText5);
//					String cellValue55 = sheet.getRow(i).getCell(10).getStringCellValue();
//					String cellValue5 = cellValue55.trim();
//					if (finalText5.equals(cellValue5)) {
//						System.out.println(i + " :Pass");
//					} else {
//						System.out.println(i + " :Fail");
//					}
//				} catch (Exception e) {
//					System.out.println("Para5 not found");
//				}
//
//				Thread.sleep(1000);
//				objWrapperFunctions.swipeHorizontal(1370, 1400, 100, 1400, 500);
//			}
			return true;
		}
}
