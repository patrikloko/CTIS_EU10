package com.ctissolutions.step_definitions;

import com.ctissolutions.pages.LoginPage;
import com.ctissolutions.pages.LogoutPage;
import com.ctissolutions.pages.SearchBoxPage_Pinar;
import com.ctissolutions.utilities.BrowserUtils;
import com.ctissolutions.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class SearchFilterBox_Steps {


    LoginPage loginPage;
    LogoutPage logoutPage;
    WebDriver driver;
    SearchBoxPage_Pinar searchBoxPage;

    @Before(value = "@wip", order = 2)
    public void setUp() {
        loginPage = new LoginPage();
        logoutPage = new LogoutPage();
        driver= Driver.getDriver();
        searchBoxPage = new SearchBoxPage_Pinar();
    }


     @When("user clicks on the search-filter box")
     public void user_clicks_on_the_search_filter_box() {
        searchBoxPage.searchBox.click();


    }

    @Then("user should see the buttons")
    public void user_should_see_the_buttons(List<String> expectedFilters) throws InterruptedException {

        System.out.println(expectedFilters);
        List<String> actual = new ArrayList<>();
        for (WebElement filter : searchBoxPage.filters) {
            Thread.sleep(5000);
            actual.add(filter.getText());
        }

        System.out.println(actual);
        for (String element : actual) {
            Assert.assertTrue(expectedFilters.contains(element));
        }
    }

    @When("user clicks on the hide field button")
    public void user_clicks_on_the_hide_field_button() throws InterruptedException {
        System.out.println(searchBoxPage.removeFieldButton);
        Thread.sleep(3000);
        for (WebElement each : searchBoxPage.removeFieldButton) {
            each.click();
            Thread.sleep(1000);
        }
    }
     @Then("verify fields are removed")
     public void verify_fields_are_removed() {
         for (WebElement field : searchBoxPage.fields) {
             Assert.assertFalse(field.isSelected());
        }
    }

    @And("user sees {string} and clicks on it")
    public void user_sees_and_clicks_on_it(String AddField) {
        BrowserUtils.waitForVisibility(searchBoxPage.AddField,10);
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
       //wait.until(ExpectedConditions.visibilityOf(searchBoxPage.AddField));
        searchBoxPage.AddField.click();
    }


    @When("user adds the fields")
    public void user_adds_the_field() {
        BrowserUtils.waitForClickablility(searchBoxPage.AddFieldExtraNet,10);
      //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
      //  wait.until(ExpectedConditions.elementToBeClickable(searchBoxPage.AddFieldExtraNet));
            searchBoxPage.AddFieldExtraNet.click();

    }
    @Then("verify user added the fields")
    public void verify_user_added_the_fields() {
        BrowserUtils.waitForClickablility(searchBoxPage.extraNetDropdown,10);
       Assert.assertTrue(searchBoxPage.extraNetDropdown.isEnabled());
    }

    @When("user clicks {string}")
    public void user_clicks(String string) {
        BrowserUtils.waitForClickablility(searchBoxPage.defaultFields,10);
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
       // wait.until(ExpectedConditions.elementToBeClickable(searchBoxPage.defaultFields));
        searchBoxPage.defaultFields.click();
    }


    @When("user selects a date option {string}")
    public void user_selects_a_date_option(String string) {
        BrowserUtils.waitForClickablility(searchBoxPage.dateDropdown,10);
        searchBoxPage.dateDropdown.click();
        searchBoxPage.dateThisWeek.click();

    }
    @Then("user clicks on search button")
    public void user_clicks_on_search_button() throws InterruptedException {
        BrowserUtils.waitFor(3);
        searchBoxPage.searchButton.click();
    }

    @Then("verify user searched with a date option {string}")
    public void verify_user_searched_with_a_date_option(String expectegThisWeekTitle) {
         expectegThisWeekTitle="Date: This week";
         String actualThisWeekTitle=searchBoxPage.thisWeekTitle.getText();
         Assert.assertEquals(expectegThisWeekTitle,actualThisWeekTitle);
    }



    @When("clicks on type inputbox")
    public void clicks_on_type_inputbox() {
        BrowserUtils.waitForClickablility(searchBoxPage.typeInputBox,10);
       searchBoxPage.typeInputBox.click();

    }
    @When("clicks on {string} option")
    public void clicks_on_option(String string) {
       searchBoxPage.postsType.click();
    }

    @Then("verify user searhed with {string} option")
    public void verify_user_searhed_with_option(String typeTitle) {
        BrowserUtils.waitFor(5);
        String expectedTypeTitle="Type: "+typeTitle;
        String actualTitle= searchBoxPage.searchBoxTitle.getText();
        Assert.assertEquals(expectedTypeTitle, actualTitle);
    }

    @When("clicks on multiple options {string},{string},{string}")
    public void clicks_on_multiple_options(String string, String string2, String string3) {
            searchBoxPage.pollsType.click();
            searchBoxPage.tasksType.click();
            searchBoxPage.announcementsType.click();
    }
    @Then("verify user searhed with {string},{string},{string} options")
    public void verify_user_searhed_with_options(String string, String string2, String string3) {
        String expectedSearchBoxTitle="Announcements, Polls, Tasks";
        String actualSearchBoxTitle=searchBoxPage.searchBoxTitle.getText();
        Assert.assertEquals(expectedSearchBoxTitle,actualSearchBoxTitle);
    }

    @When("user clicks on save Filter")
    public void user_clicks_on() {
        BrowserUtils.waitFor(5);
        searchBoxPage.saveFilter.click();
    }
    @When("user writes a filter name {string} and clicks save button")
    public void user_writes_a_filter_name_user_clicks_save_button(String string) {
        searchBoxPage.filterNameInput.sendKeys("GROUPS");
        searchBoxPage.saveButton.click();
    }

    @Then("verify new filter is saved")
    public void verify_new_filter_is_saved() {
        String expectedSearchBoxTitle="GROUPS";
        Assert.assertEquals(expectedSearchBoxTitle,searchBoxPage.searchBoxTitle.getText());
    }

    @When("user clicks restore default fields")
    public void user_clicks_restore_default_fields() {
        BrowserUtils.waitFor(3);
       searchBoxPage.defaultFields.click();
    }
    @Then("verify default fields are restored")
    public void verify_default_fields_are_restored(List<String> expectedDefaultFfields) {

        List<String> actualDefaults = new ArrayList<>();
        for (WebElement defaultField : searchBoxPage.defaultFieldsNames) {
            actualDefaults.add(defaultField.getText());
        }
        Assert.assertEquals(expectedDefaultFfields, actualDefaults);
    }

        @When("user click reset button")
        public void user_click_reset_button() {
                searchBoxPage.resetButton.click();
        }
        @Then("verify filters are resetted")
        public void verify_filters_are_resetted() {
               searchBoxPage.searchBox.click();
               Assert.assertEquals("Any date",searchBoxPage.anyDateDefault.getText());
        }






}
