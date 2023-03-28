package com.ctissolutions.step_definitions;

import com.ctissolutions.pages.EventPage_Armel;
import com.ctissolutions.pages.LoginPage;
import com.ctissolutions.pages.LogoutPage;
import com.ctissolutions.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EventStep {

    EventPage_Armel eventPageArmel;
    WebDriver driver;

    @Before(value = "@Event", order = 2)
    public void setup(){
        eventPageArmel = new EventPage_Armel();
        driver = Driver.getDriver();
        //a
    }


    @Given("user should click the Activity Stream button")
    public void user_should_click_the_activity_stream_button() throws InterruptedException {
        eventPageArmel.activityStream.click();
        Thread.sleep(2000);
    }
    @Given("user should click the Event tab")
    public void user_should_click_the_event_tab() throws InterruptedException {
        eventPageArmel.eventButton.click();
        Thread.sleep(2000);
    }

    @Then("user should sees today's date as default for starting date and ending date")
    public void user_should_sees_today_s_date_as_default_for_starting_date_and_ending_date() throws InterruptedException {
        String actualStartDate = eventPageArmel.startDateBox.getText();

        String actualStartDate2 = eventPageArmel.startDateBox2.getAttribute("data-date");
        System.out.println("Value is : " + actualStartDate2);
        String actualEndDate = eventPageArmel.endDateBox.getText();

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String expectedDate = dateFormat.format(date);
        System.out.println(actualStartDate);
        Assert.assertEquals(expectedDate, actualStartDate);
    }
    @When("user should add starting date")
    public void user_should_add_starting_date() {
        eventPageArmel.startDateBox.clear();
        eventPageArmel.startDateBox.sendKeys("30/03/2023");
    }
    @When("user should add starting time")
    public void user_should_add_starting_time() {
        eventPageArmel.startTimeBox.click();
        eventPageArmel.startTimeBox.clear();
        eventPageArmel.startTimeBox.sendKeys("09:30 am");
    }
    @When("user should add ending date")
    public void user_should_add_ending_date() {
        eventPageArmel.endDateBox.click();
        eventPageArmel.endDateBox.clear();
        eventPageArmel.endDateBox.sendKeys("30/03/2023");

    }
    @Then("user should add ending time")
    public void user_should_add_ending_time() throws InterruptedException {
        eventPageArmel.endTimeBox.click();
        eventPageArmel.endTimeBox.clear();
        eventPageArmel.endTimeBox.sendKeys("10:30 am");
        Thread.sleep(5000);
    }

    @Then("user should select all day")
    public void user_should_select_all_day() throws InterruptedException {
        eventPageArmel.allDayCheckbox.click();
        Thread.sleep(2000);
        Assert.assertTrue(eventPageArmel.allDayCheckbox.isSelected());
    }

    @When("user should set reminder")
    public void user_should_set_reminder() {
        Assert.assertTrue(eventPageArmel.setReminderCheckbox.isSelected());
    }

    @Then("user should set reminder time")
    public void user_should_set_reminder_time() throws InterruptedException {
        eventPageArmel.setTimeReminder.clear();
        eventPageArmel.setTimeReminder.sendKeys("1");
        eventPageArmel.setTimeReminderDropdown.click();

        Select selectTimeReminder = new Select(eventPageArmel.setTimeReminderDropdown);
        selectTimeReminder.selectByIndex(1);
        Thread.sleep(3000);

    }

    @When("user should add event name")
    public void user_should_add_event_name() {
        eventPageArmel.eventNameField.sendKeys("Retro Meeting");
        Assert.assertNotNull(eventPageArmel.eventNameField);
    }

    @When("user should click send button")
    public void user_should_click_send_button() {
       eventPageArmel.sendButton.click();
    }

    @Then("user should sees event sent on message page")
    public void user_should_sees_event_sent_on_message_page() {
        Assert.assertTrue(eventPageArmel.messagePage.isDisplayed());
    }

    @When("user should fill mandatory field")
    public void user_should_fill_mandatory_field() {
        eventPageArmel.eventNameField.sendKeys("Retro Meeting");
    }

    @When("user should click all day check box")
    public void user_should_click_all_day_check_box() throws InterruptedException {
        eventPageArmel.allDayCheckbox.click();
        Thread.sleep(2000);

    }

    @When("user should click set reminder check box")
    public void user_should_click_set_reminder_check_box() {
        Assert.assertTrue(eventPageArmel.setReminderCheckbox.isSelected());
    }

    @When("user should cancel the event by clicking the cancel button")
    public void user_should_cancel_the_event_by_clicking_the_cancel_button() {
        eventPageArmel.cancelButton.click();
    }

    @Then("user should sees message page")
    public void user_should_sees_message_page() {
        Assert.assertTrue(eventPageArmel.messagePage.isDisplayed());
    }


}
