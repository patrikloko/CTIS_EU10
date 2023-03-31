package com.ctissolutions.step_definitions;

import com.ctissolutions.pages.LoginPage;
import com.ctissolutions.pages.LogoutPage;
import com.ctissolutions.pages.SearchBoxPage_Pinar;
import com.ctissolutions.pages.SendMessagesPage_Busra;
import com.ctissolutions.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendMessage_Busra {

   // SendMessagesPage_Busra sendMessagesPageBusra= new SendMessagesPage_Busra();
   // LoginPage loginPage=new LoginPage();
    //LogoutPage logoutPage=new LogoutPage();

    LoginPage loginPage;
    LogoutPage logoutPage;
    SendMessagesPage_Busra sendMessagesPageBusra;

    @Before(value = "@sendMessage", order = 2)
    public void setUp() {
        loginPage = new LoginPage();
        logoutPage = new LogoutPage();
        sendMessagesPageBusra = new SendMessagesPage_Busra();
    }

    @Given("user clicks the send message field")
    public void user_clicks_the_send_message_field() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(sendMessagesPageBusra.sendMessageField));
        sendMessagesPageBusra.sendMessageField.click();

    }

    @When("user writes message")
    public void user_writes_message() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        sendMessagesPageBusra.messageField.sendKeys("hello11");
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user clicks the send button")
    public void user_clicks_the_send_button() throws InterruptedException {
        Thread.sleep(3000);
        sendMessagesPageBusra.sendButton.click();
    }

    @Then("users should see the their message")
    public void users_should_see_the_their_message() {
        sendMessagesPageBusra.sendingMessageForEveryone.isDisplayed();
    }






    @When("user doesn't write message")
    public void user_doesn_t_write_message() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        sendMessagesPageBusra.messageField.sendKeys(" ");
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("user should see The message title is not specified message")
    public void user_should_see_the_message_title_is_not_specified_message() {
        String expectedMessage= "The message title is not specified";
        String actualMessage=sendMessagesPageBusra.errorMessageForTitle.getText();

        Assert.assertEquals("Not match",expectedMessage, actualMessage);
    }







    @When("user remove default All employees")
    public void user_remove_default_all_employees() {
        sendMessagesPageBusra.getAllEmployeesRemoveButton.click();
    }

    @Then("user should see Please specify at least one person. message")
    public void user_should_see_please_specify_at_least_one_person_message() throws InterruptedException {
        Thread.sleep(3000);
        String expectedMessage2= "Please specify at least one person.";
        String actualMessage2=sendMessagesPageBusra.errorMessageForPerson.getText();

        Assert.assertEquals("Not match",expectedMessage2, actualMessage2);
    }





    @When("user writes messages")
    public void user_writes_messages() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        sendMessagesPageBusra.messageField.sendKeys("hello33");
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user should see all employees by default for recipients")
    public void user_should_see_all_employees_by_default_for_recipients() throws InterruptedException {
        Thread.sleep(3000);
        sendMessagesPageBusra.allEmployeesButton.isDisplayed();

    }

    @When("user remove default and add new more than one, changeable")
    public void user_remove_default_and_add_new_more_than_one_changeable() throws InterruptedException {
        Thread.sleep(2000);
        sendMessagesPageBusra.getAllEmployeesRemoveButton.click();
        Thread.sleep(2000);
        sendMessagesPageBusra.addPersonButton.click();
        Thread.sleep(2000);
        sendMessagesPageBusra.employeesAndDepatments.click();
        Thread.sleep(2000);
        sendMessagesPageBusra.addAnotherRecipents.click();
    }

    @Then("users should see adding employees")
    public void users_should_see_adding_employees() {
        sendMessagesPageBusra.addingOtherEmployees.isDisplayed();
    }









    @When("user clicks the cancel button")
    public void user_clicks_the_cancel_button() {
        sendMessagesPageBusra.cancelButton.click();
    }
    @Then("users should see their empty messages field")
    public void users_should_see_their_empty_messages_field() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        Assert.assertTrue(sendMessagesPageBusra.messageField.isDisplayed());
        Driver.getDriver().switchTo().parentFrame();

    }







    @When("user writes the message")
    public void user_writes_the_message() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        sendMessagesPageBusra.messageField.sendKeys("hello22");
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("user clicks more and then delete button to delete the message")
    public void user_clicks_more_and_then_delete_button_to_delete_the_message() throws InterruptedException {
        Thread.sleep(5000);
        sendMessagesPageBusra.moreButtonUnderMessage.click();
        Thread.sleep(3000);
        sendMessagesPageBusra.deleteButtonUnderMore.click();



    }

}
