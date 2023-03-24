package com.ctissolutions.step_definitions;


import com.ctissolutions.pages.LoginPage;
import com.ctissolutions.pages.LogoutPage;
import com.ctissolutions.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */
public class Hooks {
    LoginPage loginPage;
    LogoutPage logoutPage;

    @Before
    public void setUp() {
        loginPage = new LoginPage();
        logoutPage = new LogoutPage();


    }

    @After
    public void teardownScenario(Scenario scenario) {

//scenario .is failed------> if scenario failed take screenshot if scenario pass no screenshot
        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        Driver.closeDriver();
    }

        @Given("the user should enter app with valid {string} {string} {string}")
        public void the_user_should_enter_app_with_valid (String url, String username, String password){
            Driver.getDriver().get(url);
            loginPage.login(username, password);
        }


    }

