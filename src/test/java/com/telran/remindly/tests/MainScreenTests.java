package com.telran.remindly.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase{

    @Test
    public void launchAppTest(){
        System.out.println("App launch!");
    }

    @Test
    public void mainPageReminderTextExists() {
        String reminderText = app.getMainScreen().driver.findElement(By.id("com.blanyal.remindly:id/no_reminder_text")).getText();
        Assert.assertTrue(reminderText.contains("Click on the plus button below to begin creating your reminders!"));
    }

    @Test
    public void openLicensesTest() {
        app.getMainScreen().driver.findElement(By.cssSelector("android.widget.ImageView")).click();
        app.getMainScreen().driver.findElement(By.cssSelector("android.widget.LinearLayout")).click();
        var licenses_text = app.getMainScreen().driver.findElement(By.id("com.blanyal.remindly:id/licenses_text_view")).getText();
        Assert.assertTrue(licenses_text.contains("NOTICES FOR LIBRARIES"));
    }
}
