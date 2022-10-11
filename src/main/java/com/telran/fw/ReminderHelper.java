package com.telran.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderHelper extends HelperBase{
    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void tapOnAddButton() {
        tap(By.id("add_reminder"));
    }

    public void fillReminderName(String text, int timeOut) {
        waitForElementAndType(By.id("reminder_title"), timeOut, text);
        hideKeyBoard();
    }

    public void saveReminder() {
        tap(By.id("save_reminder"));
    }

    public void tapOnData() {
        tap(By.id("date_text"));
    }

    public void selectDay(int index) {
        List<WebElement> days= driver.findElements(By.className("android.view.View"));
        days.get(index).click();

    }

    public void tapOnOk() {
        tap(By.id("ok"));
    }

    public void switchOffRepeat() {
        tap(By.id("repeat_switch"));
    }

    public void enterRepeatNumber(String text, int timeOut) {
        tap(By.id("repeat_no_text"));
        waitForElementAndType(By.cssSelector("android.widget.EditText"),timeOut,text);
        hideKeyBoard();
        tap(By.id("android:id/button1"));
    }

    public void selectRepeatTime(String numberOfTimeType) {
        tap(By.id("RepeatType"));
        tap(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[" + numberOfTimeType + "]"));
    }
}
