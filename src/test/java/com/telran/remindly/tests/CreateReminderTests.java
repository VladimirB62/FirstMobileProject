package com.telran.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateReminderTests extends TestBase{

    @Test
    public void addReminderWithDefaultDataTest() {
        int quantittyBeforeAdd;
        int quantityAfterAdd;
        quantittyBeforeAdd = app.getMainScreen().getTotalReminders();

        app.getReminder().tapOnAddButton();
        app.getReminder().fillReminderName("Test", 10);
        app.getReminder().saveReminder();
        app.getReminder().pause(1000);
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantittyBeforeAdd + 1);
    }

    @Test
    public void addReminderWithRandomSwipeTest() {
        int quantittyBeforeAdd;
        int quantityAfterAdd;
        quantittyBeforeAdd = app.getMainScreen().getTotalReminders();

        app.getReminder().tapOnAddButton();
        app.getReminder().fillReminderName("Test", 10);
        app.getReminder().tapOnData();
        app.getReminder().pause(2000);
        app.getReminder().swipeUp();
        app.getReminder().selectDay(9);
        app.getReminder().tapOnOk();
        app.getReminder().pause(1000);
        app.getReminder().switchOffRepeat();
        app.getReminder().enterRepeatNumber("5",10);
        app.getReminder().swipeUp();
        app.getReminder().selectRepeatTime("3");
        app.getReminder().saveReminder();
        app.getReminder().pause(1000);

        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantittyBeforeAdd + 1);

    }
}


