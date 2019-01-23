$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PPlusComparison.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Pregnancy Plus Application",
  "description": "",
  "id": "login-into-pregnancy-plus-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11638583309,
  "status": "passed"
});
formatter.scenario({
  "line": 74,
  "name": "Login using valid username and valid password and check daily text",
  "description": "",
  "id": "login-into-pregnancy-plus-application;login-using-valid-username-and-valid-password-and-check-daily-text;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@PPlus_Hospital_Bag"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "Click on Ok Button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Enter the Password 12345678",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Click on Continue Button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Click on More tab",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Click on Hospital Bag tab",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Click on Mother\u0027s Bag tab",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Click on Birth Plan",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Click on Book Magazine",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Click on Breast Pads",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Click on My Items tab",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Enter the text in Add your item here text box Shoping",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Deselects checkbox Birth Plan",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Deselects checkbox Book Magazine",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Deselects checkbox Breast Pads",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Click on Back arrow",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Click on Partners bag tab",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Click on book Magazine tab",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "Click on Change of Cloths",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Click on Comfortable Shoes",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Click on My Items tab",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "Enter the text in Add your item here text box Shoping",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "Click on Deselects checkbox Book Magazine",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Click on Deselects checkbox Change of Cloths",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "Click on Deselects checkbox Comfortable Shoes",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "Click on Back arrow",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "Click on Babys bag tab",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "Click on Three in All tab",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Click on Three Muslin Cloths",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Click on Bibs tab",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Click on My Items tab",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "Enter the text in Add your item here text box Shoping",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "Click on Deselects checkbox Three in All tab",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "Click on Deselects checkbox Three Muslin Cloths",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "Click on Deselects checkbox Muslin Cloths",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "Click on Back arrow",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusLogin.Click_On_Login_button()"
});
formatter.result({
  "duration": 167128797,
  "error_message": "org.openqa.selenium.WebDriverException: No command or response codec has been defined. Unable to proceed\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027MACHINE-102\u0027, ip: \u0027192.168.5.102\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:148)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:180)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat core.generic.WrapperFunctions.mobileClick(WrapperFunctions.java:848)\r\n\tat com.face.pageFactory.PPlusLoginPage.clickOnNoLoginBtn(PPlusLoginPage.java:26)\r\n\tat com.face.stepDefinitions.PPlusLogin.Click_On_Login_button(PPlusLogin.java:27)\r\n\tat ✽.Given Click On Login button(PPlusComparison.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PPlusLogin.clickOnOkButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "dev_qa@email.com",
      "offset": 20
    }
  ],
  "location": "PPlusLogin.enterUserName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 19
    }
  ],
  "location": "PPlusLogin.enterPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusLogin.clickOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMore.click_on_More_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMore.Click_on_Hospital_Bag_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Mothers_Bag_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Birth_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Book_Magazine()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Breast_Pads()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.Click_on_My_Items_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Shoping",
      "offset": 46
    }
  ],
  "location": "PPlusMotherBag.Enter_the_text_in_Add_your_item_here_text_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Deselects_checkbox_Birth_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Deselects_checkbox_Book_Magazine()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Deselects_checkbox_Breast_Pads()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusPartnerBag.Click_on_Partners_bag_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusPartnerBag.Click_on_book_Magazine_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusPartnerBag.Click_on_Change_of_Cloths()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusPartnerBag.Click_on_Comfortable_Shoes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.Click_on_My_Items_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Shoping",
      "offset": 46
    }
  ],
  "location": "PPlusMotherBag.Enter_the_text_in_Add_your_item_here_text_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusPartnerBag.Click_on_Deselects_checkbox_Book_Magazine()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusPartnerBag.Click_on_Deselects_checkbox_Change_of_Cloths()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusPartnerBag.Click_on_Deselects_checkbox_Comfortable_Shoes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusBabyBag.Click_on_Babys_bag_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusBabyBag.Click_on_Three_in_All_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusBabyBag.Click_on_Three_Muslin_Cloths()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusBabyBag.Click_on_Bibs_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.Click_on_My_Items_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Shoping",
      "offset": 46
    }
  ],
  "location": "PPlusMotherBag.Enter_the_text_in_Add_your_item_here_text_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusBabyBag.Click_on_Deselects_checkbox_Three_in_All_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusBabyBag.Click_on_Deselects_checkbox_Three_Muslin_Cloths()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusBabyBag.Click_on_Deselects_checkbox_Muslin_Cloths()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "status": "skipped"
});
});