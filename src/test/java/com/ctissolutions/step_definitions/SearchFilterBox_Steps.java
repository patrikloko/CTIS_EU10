package com.ctissolutions.step_definitions;

import com.ctissolutions.pages.SearchBoxPage_Pinar;
import com.ctissolutions.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class SearchFilterBox_Steps {
            SearchBoxPage_Pinar searchBoxPage = new SearchBoxPage_Pinar();
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("https://qa.ctissolutions.com");
        searchBoxPage.usernameInput.sendKeys("hr1@cybertekschool.com");
        searchBoxPage.passwordInput.sendKeys("UserUser");
        searchBoxPage.loginButton.click();
        //cemil login() method will come


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

}
