package com.telran.remindly.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    AppiumDriver driver;

    DesiredCapabilities capabilities;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android" );
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("deviceName", "Nexus_5_API_26");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage","com.blanyal.remindly" );
        capabilities.setCapability("appActivity","com.blanyal.remindme.MainActivity" );
        capabilities.setCapability("app", "C:/Tools/com.blanyal.remindly_2_apps.evozi.com.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

}


/*{
  "platformName": "Android",
  "appium:platformVersion": "8.0",
  "appium:deviceName": "Nexus_5_API_26",
  "appium:appPackage": "com.blanyal.remindly",
  "appium:appActivity": "com.blanyal.remindme.MainActivity"
}*/
