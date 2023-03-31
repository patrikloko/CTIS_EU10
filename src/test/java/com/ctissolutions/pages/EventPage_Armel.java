package com.ctissolutions.pages;

import com.ctissolutions.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EventPage_Armel {


    public EventPage_Armel(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_live_feed\"]/a/span[1]")
    public WebElement activityStream;

    @FindBy (xpath = "//span[.='Event']//span")
    public WebElement eventButton;

    @FindBy (xpath = "//div[@class='bx-calendar-cell-block']//div[4]")
    public WebElement activeDateOfTheMonth;

    @FindBy (xpath = "//div[@class='bx-calendar-cell-block']")
    public WebElement calendarCellBlock;

    @FindBy (className = "bx-calendar-top-month")
    public WebElement monthsDropdownButton;

    @FindBy (xpath = "//div[@class='bx-calendar-month-content']")
    public WebElement monthsDropdown;

    @FindBy (xpath = "//input[@class='bx-calendar-year-input']")
    public WebElement yearInput;


    @FindBy (xpath = "//input[@id = 'feed-cal-event-fromcal_3Jcl']")
    public WebElement startDateBox;
    @FindBy (xpath = "//input[@name ='TIME_FROM_' ]")
    public WebElement startTimeBox;

    @FindBy (xpath = "//input[@id='feed-cal-event-tocal_3Jcl']")
    public WebElement endDateBox;

    @FindBy (xpath = "//input[@id ='feed_cal_event_to_timecal_3Jcl']")
    public WebElement endTimeBox;

    @FindBy (xpath = "//input[@id='event-full-daycal_3Jcl']")
    public WebElement allDayCheckbox;

    @FindBy (xpath = "//div[@id='feed-cal-reminder-contcal_3Jcl']/input[@id='event-remindercal_3Jcl']")
    public WebElement setReminderCheckbox;


    @FindBy (xpath = "//span[@class='feed-event-rem-value']//input[@id='event-remind_countcal_3Jcl']")
    public WebElement setTimeReminder;

    @FindBy (xpath = "//select[@id='event-remind_typecal_3Jcl']")
    public WebElement setTimeReminderDropdown;

    @FindBy (xpath = "//input[@id='feed-cal-event-namecal_3Jcl']")
    public WebElement eventNameField;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy (xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-link']")
    public WebElement cancelButton;

    @FindBy (xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement messagePage;

    @FindBy (xpath = "//a[@class='bx-calendar-cell bx-calendar-active']")
    public WebElement calendarStartingDate;

    @FindBy (xpath = "//a[@class='bx-calendar-cell bx-calendar-active']")
    public WebElement calendarEndingDate;

    public void addStartDate(){
        String startDate = "20/03/2023";
        startDateBox.clear();
        startDateBox.sendKeys(startDate);
        String afterAssignStartDate = startDateBox.getAttribute("value");
        System.out.println("Event starting date = "+ afterAssignStartDate);

        Assert.assertEquals(startDate,afterAssignStartDate);

    }

    public void addEndDate(){
        String endDate = "30/03/2023";
        endDateBox.clear();
        endDateBox.sendKeys(endDate);
        String afterAssignEndDate = endDateBox.getAttribute("value");
        System.out.println("Event ending date = " +afterAssignEndDate);

        Assert.assertEquals(endDate,afterAssignEndDate);
    }

    public void addReminder() throws InterruptedException {
        setTimeReminder.clear();
        setTimeReminder.sendKeys("1");
        setTimeReminderDropdown.click();

        Select selectTimeReminder = new Select(setTimeReminderDropdown);
        selectTimeReminder.selectByIndex(1);
        Thread.sleep(3000);
    }

    public void addStartTime(){
       startTimeBox.click();
       startTimeBox.clear();
       startTimeBox.sendKeys("09:30 am");

    }

    public void addEndTime(){
       endTimeBox.click();
       endTimeBox.clear();
       endTimeBox.sendKeys("10:30 am");


    }



    public void verifyStartandEndDate() throws InterruptedException {
        Date todaysDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String expectedDate = dateFormat.format(todaysDate);
        String actualStartDate = startDateBox.getAttribute("value");
        String actualEndDate = endDateBox.getAttribute("value");
        Thread.sleep(3000);

        Assert.assertEquals(expectedDate,actualStartDate);
        Assert.assertEquals(expectedDate,actualEndDate);


        /*Date todaysDate = new Date();
        WebElement actualStartDateEle = startDateBox;
        WebElement actualEndDateEle = endDateBox;

        //VERİFY START DATE
        actualStartDateEle.click();
        Thread.sleep(1000);
        String activeStartDayTs = calendarStartingDate.getAttribute("data-date");
        System.out.println(activeStartDayTs);
        //Thread.sleep(1000);
        long convertedStartLongTs = Long.parseLong(activeStartDayTs);//converting String to long

        Timestamp starDateTs=new Timestamp(convertedStartLongTs);//make new object for time stamp
        Date convertedStartDate =starDateTs;//convert from time stamp to date and time
        DateFormat startDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String actualStartDate = startDateFormat.format(convertedStartDate); //change date format
        System.out.println("actualStartDate = " + actualStartDate);

        String expectedDate = startDateFormat.format(todaysDate);
        Assert.assertEquals(expectedDate, actualStartDate);

        //VERİFY END DATE
        actualEndDateEle.click();
        Thread.sleep(1000);
        String activeEndDayTs = calendarEndingDate.getAttribute("data-date");
        //Thread.sleep(1000);
        long convertedEndLongTs = Long.parseLong(activeEndDayTs);

        Timestamp endDateTs = new Timestamp(convertedEndLongTs);
        Date convertedDate = endDateTs;
        DateFormat EndDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String actualEndDate = EndDateFormat.format(convertedDate);
        System.out.println("actualEndDate = " + actualEndDate);

        Assert.assertEquals(expectedDate, actualEndDate);


    }*/

    }
}
