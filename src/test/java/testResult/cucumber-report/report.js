$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PPlusBaby.feature");
formatter.feature({
  "line": 1,
  "name": "Verification of Daily, Weekly, BabyNames",
  "description": "",
  "id": "verification-of-daily,-weekly,-babynames",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18995184906,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Login using valid username and valid password and check daily text",
  "description": "",
  "id": "verification-of-daily,-weekly,-babynames;login-using-valid-username-and-valid-password-and-check-daily-text;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Baby"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Ok Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter the Password 12345678",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on Continue Button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click on Baby Menu tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Click on daily tab",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Get text to verify",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Content get displayed for particular day",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusLogin.Click_On_Login_button()"
});
formatter.result({
  "duration": 6403102378,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnOkButton()"
});
formatter.result({
  "duration": 6144486193,
  "status": "passed"
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
  "duration": 6763128870,
  "status": "passed"
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
  "duration": 6889885726,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnContinueButton()"
});
formatter.result({
  "duration": 32113920237,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMenu.clickOn_baby()"
});
formatter.result({
  "duration": 1439999934,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBaby.clickOnDailyTab()"
});
formatter.result({
  "duration": 2523805435,
  "status": "passed"
});
formatter.match({
  "location": "PPlusDaily.GetTextToVerify()"
});
formatter.result({
  "duration": 125193440148,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "duration": 3133975367,
  "status": "passed"
});
formatter.match({
  "location": "PPlusDaily.Content_get_displayed_for_particular_day()"
});
formatter.result({
  "duration": 76965,
  "status": "passed"
});
formatter.before({
  "duration": 13927157204,
  "status": "passed"
});
formatter.scenario({
  "line": 71,
  "name": "Login using valid username and valid password and check Baby Names module from Baby menu",
  "description": "",
  "id": "verification-of-daily,-weekly,-babynames;login-using-valid-username-and-valid-password-and-check-baby-names-module-from-baby-menu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 40,
      "name": "@Baby"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "Click on Ok Button",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "Enter the Password 12345678",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Click on Continue Button",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Click on Baby Menu tab",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Click on Baby Name tab",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Click on American names",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Click on Noah",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Click on Liam",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "Click on Mason",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Click on Jacob",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "Click on gender icon",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "Click on Emma",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "Click on Olivia",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "Click on Sophia",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "Click on Isabella",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "Click on My favourites tab",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Click on heart icon of name1",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "Click on No",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "Click on heart icon of name1",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "Click on Yes",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "Swipe name1 to right or left to delete",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "Baby Names are added and selected from country listing into favourite listing",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusLogin.Click_On_Login_button()"
});
formatter.result({
  "duration": 6139549871,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnOkButton()"
});
formatter.result({
  "duration": 4639761442,
  "status": "passed"
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
  "duration": 6604122080,
  "status": "passed"
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
  "duration": 7054390714,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnContinueButton()"
});
formatter.result({
  "duration": 31935402356,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMenu.clickOn_baby()"
});
formatter.result({
  "duration": 1264723166,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBaby.clickOn_baby_Name()"
});
formatter.result({
  "duration": 2139659207,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnamericannames()"
});
formatter.result({
  "duration": 1378318367,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.Click_on_Noah()"
});
formatter.result({
  "duration": 1444523355,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnnames2()"
});
formatter.result({
  "duration": 3627576548,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnnames3()"
});
formatter.result({
  "duration": 3786196201,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnnames4()"
});
formatter.result({
  "duration": 3729655426,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOngenders()"
});
formatter.result({
  "duration": 3619462535,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnnames5()"
});
formatter.result({
  "duration": 4327180658,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnnames6()"
});
formatter.result({
  "duration": 3095879736,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnnames7()"
});
formatter.result({
  "duration": 3710449550,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnnames8()"
});
formatter.result({
  "duration": 3682997534,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "duration": 4010165970,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnfavourites()"
});
formatter.result({
  "duration": 2324668234,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnheartIcons()"
});
formatter.result({
  "duration": 2889166946,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnnoButtons()"
});
formatter.result({
  "duration": 5284828835,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnheartIcons()"
});
formatter.result({
  "duration": 2762985180,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnyesButtons()"
});
formatter.result({
  "duration": 2700559730,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.clickOnfavouriteNames()"
});
formatter.result({
  "duration": 6897767523,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "duration": 3117747671,
  "status": "passed"
});
formatter.match({
  "location": "PPlusBabyNames.BabyNames()"
});
formatter.result({
  "duration": 77956,
  "status": "passed"
});
formatter.uri("PPlusMore.feature");
formatter.feature({
  "line": 1,
  "name": "Verification of HospitalBags, Shop, Contraction, KickCounter",
  "description": "",
  "id": "verification-of-hospitalbags,-shop,-contraction,-kickcounter",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14331246913,
  "status": "passed"
});
formatter.scenario({
  "line": 66,
  "name": "Login using valid username and valid password and check daily text",
  "description": "",
  "id": "verification-of-hospitalbags,-shop,-contraction,-kickcounter;login-using-valid-username-and-valid-password-and-check-daily-text;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@More"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Ok Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter the Password 12345678",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on Continue Button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click on More tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Click on Hospital Bag tab",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Mother\u0027s Bag tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Birth Plan",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Click on Book Magazine",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click on Breast Pads",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on My Items tab",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Enter the text in Add your item here text box Shoping",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Deselects checkbox Birth Plan",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Deselects checkbox Book Magazine",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Deselects checkbox Breast Pads",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Click long press on Birth Plan",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click on delete icon",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Click on pop up delete tab",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Click on Suggested Button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Click on Book Magazine",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Click on Breast Pads",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Click on Partners bag tab",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Click on book Magazine tab",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Click on Change of Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Click on Comfortable Shoes",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Click on My Items tab",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Enter the text in Add your item here text box Shoping",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Click on Deselects checkbox Book Magazine",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Click on Deselects checkbox Change of Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Click on Deselects checkbox Comfortable Shoes",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Click long press on Comfortable Shoes",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Click on delete icon",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Click on pop up delete tab",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Click on Suggested Button",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "Click on book Magazine tab",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Click on Change of Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "Click on Babys bag tab",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Click on Three in All tab",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Click on Three Muslin Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Click on Bibs tab",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Click on My Items tab",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Enter the text in Add your item here text box Shoping",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Click on Deselects checkbox Three in All tab",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "Click on Deselects checkbox Three Muslin Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Click on Deselects checkbox Muslin Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "Click long press on Three in All",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "Click on delete icon",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "Click on pop up delete tab",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "Click on Suggested Button",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "Click on Three Muslin Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "Click on Bibs tab",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "Suggested Items from different hospital bags are added into my items list",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusLogin.Click_On_Login_button()"
});
formatter.result({
  "duration": 6194306912,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnOkButton()"
});
formatter.result({
  "duration": 4479447571,
  "status": "passed"
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
  "duration": 7109171207,
  "status": "passed"
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
  "duration": 7223117540,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnContinueButton()"
});
formatter.result({
  "duration": 31734537575,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMenu.click_on_More_tab()"
});
formatter.result({
  "duration": 5602758184,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMore.Click_on_Hospital_Bag_tab()"
});
formatter.result({
  "duration": 2441744692,
  "status": "passed"
});
formatter.match({
  "location": "PPlusHospitalBag.Click_on_Mothers_Bag_tab()"
});
formatter.result({
  "duration": 2821666768,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Birth_Plan()"
});
formatter.result({
  "duration": 2443732895,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Book_Magazine()"
});
formatter.result({
  "duration": 2543195958,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Breast_Pads()"
});
formatter.result({
  "duration": 2462426442,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.Click_on_My_Items_tab()"
});
formatter.result({
  "duration": 2433302999,
  "status": "passed"
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
  "duration": 11799956728,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Deselects_checkbox_Birth_Plan()"
});
formatter.result({
  "duration": 2748968324,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Deselects_checkbox_Book_Magazine()"
});
formatter.result({
  "duration": 2485643738,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Deselects_checkbox_Breast_Pads()"
});
formatter.result({
  "duration": 32337944509,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.34 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Machine-126\u0027, ip: \u0027192.168.250.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{app\u003dC:\\Users\\user\\eclipse-workspace\\PPlus_5.0\\APK_File\\Pregnancy_liteRelease-5.0Dev-RC27.apk, appPackage\u003dcom.hp.pregnancy.lite, deviceScreenSize\u003d1440x2560, networkConnectionEnabled\u003dtrue, warnings\u003d{}, appWaitPackage\u003dcom.hp.pregnancy.lite, appWaitActivity\u003dcom.hp.pregnancy.lite.onboarding.SplashScreenActivity, databaseEnabled\u003dfalse, version\u003d7.1.0, deviceName\u003d192.168.250.101:5555, platform\u003dLINUX, deviceUDID\u003d192.168.250.101:5555, appActivity\u003dcom.hp.pregnancy.lite.onboarding.SplashScreenActivity, desired\u003d{app\u003dC:\\Users\\user\\eclipse-workspace\\PPlus_5.0\\APK_File\\Pregnancy_liteRelease-5.0Dev-RC27.apk, platformName\u003dAndroid, version\u003d7.1.0, deviceName\u003dGoogle Nexus 6P}, platformVersion\u003d7.1.1, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, deviceModel\u003dGoogle Nexus 6P - 7.1.0 - API 25 - 1440x2560, platformName\u003dAndroid, deviceManufacturer\u003dGenymotion}]\nSession ID: 2a754298-cca1-4e6e-9362-5929e6b4e839\n*** Element info: {Using\u003dxpath, value\u003d/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:180)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat core.generic.WrapperFunctions.mobileClick(WrapperFunctions.java:850)\r\n\tat com.face.pageFactory.PPlusMotherBagPage.checkboxBreastPads(PPlusMotherBagPage.java:77)\r\n\tat com.face.stepDefinitions.PPlusMotherBag.Deselects_checkbox_Breast_Pads(PPlusMotherBag.java:53)\r\n\tat ✽.When Deselects checkbox Breast Pads(PPlusMore.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PPlusMotherBag.click_long_press_on_Birth_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.click_on_delete_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.click_on_pop_up_delete_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Suggested_Button()"
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
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusHospitalBag.Click_on_Partners_bag_tab()"
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
  "location": "PPlusPartnerBag.Click_long_press_on_Comfortable_Shoes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.click_on_delete_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.click_on_pop_up_delete_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Suggested_Button()"
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
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusHospitalBag.Click_on_Babys_bag_tab()"
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
  "location": "PPlusBabyBag.click_long_press_on_Three_in_All()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.click_on_delete_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusShop.click_on_pop_up_delete_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Suggested_Button()"
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
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
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
  "location": "PPlusMotherBag.Suggested_Items_from_different_hospital_bags_are_added_into_my_items_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 14300273341,
  "status": "passed"
});
formatter.scenario({
  "line": 95,
  "name": "Login using valid username and valid password and check daily text",
  "description": "",
  "id": "verification-of-hospitalbags,-shop,-contraction,-kickcounter;login-using-valid-username-and-valid-password-and-check-daily-text;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 69,
      "name": "@More"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "Click on Ok Button",
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "Enter the Password 12345678",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "Click on Continue Button",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "Click on More tab",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "Click on shop tab",
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "Click on baby care",
  "keyword": "When "
});
formatter.step({
  "line": 79,
  "name": "Click on first Hooded towels",
  "keyword": "When "
});
formatter.step({
  "line": 80,
  "name": "Click on first Wash Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 81,
  "name": "Click on My Items tab",
  "keyword": "When "
});
formatter.step({
  "line": 82,
  "name": "Click on second Hooded towels",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "Click on second Wash Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "Click long press on  2-3 Wash Cloths",
  "keyword": "When "
});
formatter.step({
  "line": 85,
  "name": "Click on delete icon",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "Click on pop up delete tab",
  "keyword": "When "
});
formatter.step({
  "line": 87,
  "name": "Click on Suggested Button",
  "keyword": "When "
});
formatter.step({
  "line": 88,
  "name": "Click on second Hooded towels",
  "keyword": "When "
});
formatter.step({
  "line": 89,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 90,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "Suggested Items from different shopping sections are added into my items list",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusLogin.Click_On_Login_button()"
});
formatter.result({
  "duration": 6393591105,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnOkButton()"
});
formatter.result({
  "duration": 4381073577,
  "status": "passed"
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
  "duration": 6692201938,
  "status": "passed"
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
  "duration": 7849451749,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnContinueButton()"
});
formatter.result({
  "duration": 31576423643,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMenu.click_on_More_tab()"
});
formatter.result({
  "duration": 5622774336,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMore.click_on_shop_tab()"
});
formatter.result({
  "duration": 1918598248,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.click_on_baby_care()"
});
formatter.result({
  "duration": 2850575832,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.click_on_first_Hooded_towels()"
});
formatter.result({
  "duration": 2503429231,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.click_on_first_Wash_Cloths()"
});
formatter.result({
  "duration": 2401660855,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.Click_on_My_Items_tab()"
});
formatter.result({
  "duration": 2386786485,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.click_on_second_Hooded_towels()"
});
formatter.result({
  "duration": 2356586194,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.click_on_second_Wash_Cloths()"
});
formatter.result({
  "duration": 2321633571,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.Clicklongpresson2_3WashCloths()"
});
formatter.result({
  "duration": 1774434779,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.click_on_delete_icon()"
});
formatter.result({
  "duration": 3059053860,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.click_on_pop_up_delete_tab()"
});
formatter.result({
  "duration": 2999771418,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Suggested_Button()"
});
formatter.result({
  "duration": 2386384154,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.click_on_second_Hooded_towels()"
});
formatter.result({
  "duration": 2465331948,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "duration": 2255135589,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "duration": 2510618014,
  "status": "passed"
});
formatter.match({
  "location": "PPlusShop.SuggestedItemsshopping()"
});
formatter.result({
  "duration": 93151,
  "status": "passed"
});
formatter.before({
  "duration": 15514338094,
  "status": "passed"
});
formatter.scenario({
  "line": 121,
  "name": "Login using valid username and valid password and click on Contractions tab",
  "description": "",
  "id": "verification-of-hospitalbags,-shop,-contraction,-kickcounter;login-using-valid-username-and-valid-password-and-click-on-contractions-tab;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 98,
      "name": "@More"
    }
  ]
});
formatter.step({
  "line": 100,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 101,
  "name": "Click on Ok Button",
  "keyword": "When "
});
formatter.step({
  "line": 102,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 103,
  "name": "Enter the Password 12345678",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 104,
  "name": "Click on Continue Button",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "Click on More tab",
  "keyword": "When "
});
formatter.step({
  "line": 106,
  "name": "Click on Contractions tab",
  "keyword": "When "
});
formatter.step({
  "line": 107,
  "name": "Click on Clock icon to start",
  "keyword": "When "
});
formatter.step({
  "line": 108,
  "name": "Click on Alert popup",
  "keyword": "When "
});
formatter.step({
  "line": 109,
  "name": "Click on Stop Button",
  "keyword": "When "
});
formatter.step({
  "line": 110,
  "name": "Click on OK shown on pop up",
  "keyword": "When "
});
formatter.step({
  "line": 111,
  "name": "Click on Clock icon to start",
  "keyword": "When "
});
formatter.step({
  "line": 112,
  "name": "Click on Stop Button",
  "keyword": "When "
});
formatter.step({
  "line": 113,
  "name": "Scroll down to view overview and Contraction Info",
  "keyword": "When "
});
formatter.step({
  "line": 114,
  "name": "Switch the tabs from Last 3 to Last 5 or All",
  "keyword": "When "
});
formatter.step({
  "line": 115,
  "name": "Swipe any record shown in session history to delete",
  "keyword": "When "
});
formatter.step({
  "line": 116,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 117,
  "name": "Added contraction are displayed in session history listing",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusLogin.Click_On_Login_button()"
});
formatter.result({
  "duration": 6267990374,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnOkButton()"
});
formatter.result({
  "duration": 4661382626,
  "status": "passed"
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
  "duration": 7582602304,
  "status": "passed"
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
  "duration": 7922303793,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnContinueButton()"
});
formatter.result({
  "duration": 31942463306,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMenu.click_on_More_tab()"
});
formatter.result({
  "duration": 5464124294,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMore.Click_on_Contractions_tab()"
});
formatter.result({
  "duration": 2272521393,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Click_on_Clock_icon_to_start()"
});
formatter.result({
  "duration": 1286450383,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Click_on_Alert_popup()"
});
formatter.result({
  "duration": 30752084905,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Click_on_Stop_Button()"
});
formatter.result({
  "duration": 399707005,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Click_on_OK_shown_on_pop_up()"
});
formatter.result({
  "duration": 1821909555,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Click_on_Clock_icon_to_start()"
});
formatter.result({
  "duration": 1054032315,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Click_on_Stop_Button()"
});
formatter.result({
  "duration": 1357790216,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Scroll_Down_To_View_Overview_And_Contraction_Info()"
});
formatter.result({
  "duration": 4512545440,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Switch_The_Tabs_From_Last3_To_Last5_Or_All()"
});
formatter.result({
  "duration": 3137965319,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Swipe_Any_Record_Shown_In_Session_History_To_Delete()"
});
formatter.result({
  "duration": 6351355886,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "duration": 3360366062,
  "status": "passed"
});
formatter.match({
  "location": "PPlusContraction.Addedcontraction()"
});
formatter.result({
  "duration": 87205,
  "status": "passed"
});
formatter.before({
  "duration": 16090307876,
  "status": "passed"
});
formatter.scenario({
  "line": 155,
  "name": "Check counter kicks",
  "description": "",
  "id": "verification-of-hospitalbags,-shop,-contraction,-kickcounter;check-counter-kicks;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 124,
      "name": "@More"
    }
  ]
});
formatter.step({
  "line": 126,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 127,
  "name": "Click on Ok Button",
  "keyword": "When "
});
formatter.step({
  "line": 128,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 129,
  "name": "Enter the Password 12345678",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 130,
  "name": "Click on Continue Button",
  "keyword": "When "
});
formatter.step({
  "line": 131,
  "name": "Click on More tab",
  "keyword": "When "
});
formatter.step({
  "line": 132,
  "name": "Click on Kick Counter tab",
  "keyword": "When "
});
formatter.step({
  "line": 133,
  "name": "Tap on the foot icon for 2 times",
  "keyword": "When "
});
formatter.step({
  "line": 134,
  "name": "Click on Finish button",
  "keyword": "When "
});
formatter.step({
  "line": 135,
  "name": "Click on NO shown on alert pop up",
  "keyword": "When "
});
formatter.step({
  "line": 136,
  "name": "Click on Finish button",
  "keyword": "When "
});
formatter.step({
  "line": 137,
  "name": "Click on YES shown on alert pop up",
  "keyword": "When "
});
formatter.step({
  "line": 138,
  "name": "Click on DONE shown on session ended pop up",
  "keyword": "When "
});
formatter.step({
  "line": 139,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 140,
  "name": "Tap on the foot icon for 10 times",
  "keyword": "When "
});
formatter.step({
  "line": 141,
  "name": "Click on Undo button",
  "keyword": "When "
});
formatter.step({
  "line": 142,
  "name": "Click on NO button shown in alert pop up",
  "keyword": "When "
});
formatter.step({
  "line": 143,
  "name": "Click on Undo button",
  "keyword": "When "
});
formatter.step({
  "line": 144,
  "name": "Click on YES button shown in alert pop up",
  "keyword": "When "
});
formatter.step({
  "line": 145,
  "name": "Tap on the foot icon for 2 times",
  "keyword": "When "
});
formatter.step({
  "line": 146,
  "name": "Click on DONE shown on session saved pop up",
  "keyword": "When "
});
formatter.step({
  "line": 147,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 148,
  "name": "Click on History",
  "keyword": "When "
});
formatter.step({
  "line": 149,
  "name": "Swipe any entry to delete it",
  "keyword": "When "
});
formatter.step({
  "line": 150,
  "name": "Click on Back arrow",
  "keyword": "When "
});
formatter.step({
  "line": 151,
  "name": "Kick counts are displayed in session history listing",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusLogin.Click_On_Login_button()"
});
formatter.result({
  "duration": 6964633814,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnOkButton()"
});
formatter.result({
  "duration": 3693569469,
  "status": "passed"
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
  "duration": 7696948326,
  "status": "passed"
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
  "duration": 6918675874,
  "status": "passed"
});
formatter.match({
  "location": "PPlusLogin.clickOnContinueButton()"
});
formatter.result({
  "duration": 31684544099,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMenu.click_on_More_tab()"
});
formatter.result({
  "duration": 5721108361,
  "status": "passed"
});
formatter.match({
  "location": "PPlusMore.click_On_Counter_Icon()"
});
formatter.result({
  "duration": 2609638116,
  "status": "passed"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_FootIcon2Times()"
});
formatter.result({
  "duration": 1411120929,
  "status": "passed"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Finish_Button()"
});
formatter.result({
  "duration": 1067640895,
  "status": "passed"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_No_Button_OnAlert()"
});
formatter.result({
  "duration": 1012950579,
  "status": "passed"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Finish_Button()"
});
formatter.result({
  "duration": 999086331,
  "status": "passed"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Yes_Button_OnAlert()"
});
formatter.result({
  "duration": 1176676670,
  "status": "passed"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Done_Button_For_EndSession()"
});
formatter.result({
  "duration": 30467288772,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.47 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Machine-126\u0027, ip: \u0027192.168.250.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{app\u003dC:\\Users\\user\\eclipse-workspace\\PPlus_5.0\\APK_File\\Pregnancy_liteRelease-5.0Dev-RC27.apk, appPackage\u003dcom.hp.pregnancy.lite, deviceScreenSize\u003d1440x2560, networkConnectionEnabled\u003dtrue, warnings\u003d{}, appWaitPackage\u003dcom.hp.pregnancy.lite, appWaitActivity\u003dcom.hp.pregnancy.lite.onboarding.SplashScreenActivity, databaseEnabled\u003dfalse, version\u003d7.1.0, deviceName\u003d192.168.250.101:5555, platform\u003dLINUX, deviceUDID\u003d192.168.250.101:5555, appActivity\u003dcom.hp.pregnancy.lite.onboarding.SplashScreenActivity, desired\u003d{app\u003dC:\\Users\\user\\eclipse-workspace\\PPlus_5.0\\APK_File\\Pregnancy_liteRelease-5.0Dev-RC27.apk, platformName\u003dAndroid, version\u003d7.1.0, deviceName\u003dGoogle Nexus 6P}, platformVersion\u003d7.1.1, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, deviceModel\u003dGoogle Nexus 6P - 7.1.0 - API 25 - 1440x2560, platformName\u003dAndroid, deviceManufacturer\u003dGenymotion}]\nSession ID: 86982187-d99f-4706-ad8c-755da8830c21\n*** Element info: {Using\u003dxpath, value\u003d/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:180)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat core.generic.WrapperFunctions.mobileClick(WrapperFunctions.java:850)\r\n\tat com.face.pageFactory.PPlusKickCounterPage.clickOnDoneButtonForEndSession(PPlusKickCounterPage.java:54)\r\n\tat com.face.stepDefinitions.PPlusKickCounter.click_On_Done_Button_For_EndSession(PPlusKickCounter.java:45)\r\n\tat ✽.When Click on DONE shown on session ended pop up(PPlusMore.feature:138)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PPlusMotherBag.Click_on_Back_arrow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Foot_Icon_10Time()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Undo_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Undo_Button_No()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Undo_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Undo_Button_Yes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_FootIcon2Times()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Done_For_Session_SavedPopUp()"
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
  "location": "PPlusKickCounter.click_On_HistoryBtn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusKickCounter.click_On_Swipe_To_DeleteEntry()"
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
  "location": "PPlusKickCounter.Kickcounts()"
});
formatter.result({
  "status": "skipped"
});
});