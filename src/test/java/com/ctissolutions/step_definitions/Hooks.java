package com.ctissolutions.step_definitions;


import com.ctissolutions.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */
public class Hooks {
    @After
    public void teardownScenario(Scenario scenario) {

//scenario .is failed------> if scenario failed take screenshot if scenario pass no screenshot
        if (scenario.isFailed()){

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }


        Driver.closeDriver();


    }


}
