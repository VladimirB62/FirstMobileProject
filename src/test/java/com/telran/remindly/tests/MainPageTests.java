package com.telran.remindly.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends TestBase{

    @Test
    public void launchAppTest(){
        System.out.println("App launch!");
    }

    @Test
    public void mainPageReminderTextExists() {
        String reminderText = driver.findElement(By.id("com.blanyal.remindly:id/no_reminder_text")).getText();
        Assert.assertTrue(reminderText.contains("Click on the plus button below to begin creating your reminders!"));
    }

    @Test
    public void openLicensesTest() {
        driver.findElement(By.cssSelector("android.widget.ImageView")).click();
        driver.findElement(By.cssSelector("android.widget.LinearLayout")).click();
        var licenses_text = driver.findElement(By.id("com.blanyal.remindly:id/licenses_text_view")).getText();
        Assert.assertTrue(licenses_text.contains("NOTICES FOR LIBRARIES"));
    }
}
