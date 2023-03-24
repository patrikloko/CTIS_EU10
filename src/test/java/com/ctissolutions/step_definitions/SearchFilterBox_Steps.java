package com.ctissolutions.step_definitions;

import com.ctissolutions.pages.LoginPage;
import com.ctissolutions.pages.LogoutPage;
import com.ctissolutions.pages.SearchBoxPage_Pinar;
import com.ctissolutions.utilities.Driver;
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


    @When("user click on the search-filter box")
    public void user_click_on_the_search_filter_box() {
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

    @And("user sees {string} and clicks on it")
    public void user_sees_and_clicks_on_it(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(searchBoxPage.AddField));
        searchBoxPage.AddField.click();
    }


    @Then("user adds the field")
    public void user_adds_the_field() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(searchBoxPage.AddFieldExtraNet));
            searchBoxPage.AddFieldExtraNet.click();
            searchBoxPage.AddFieldFavorites.click();
            searchBoxPage.AddFieldTag.click();
    }


}
