package com.ctissolutions.step_definitions;

import com.ctissolutions.pages.LoginPage;
import com.ctissolutions.pages.LogoutPage;
import com.ctissolutions.pages.erdal_CTS10_240_page;
import com.ctissolutions.utilities.BrowserUtils;
import com.ctissolutions.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class erdal_CTS10_240_Steps {

    LoginPage loginPage;
    LogoutPage logoutPage;
    WebDriver driver;
    erdal_CTS10_240_page erdalPage;

    @Before(value = "@wip", order = 2)
    public void setUp() {
        loginPage = new LoginPage();
        logoutPage = new LogoutPage();
        driver = Driver.getDriver();
        erdalPage = new erdal_CTS10_240_page();
    }

    @Given("the user clicks to Send Message text under Message menu and see Send button")
    public void the_user_clicks_to_send_message_text_under_message_menu_and_see_send_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(erdalPage.sendMessageTextArea));
        erdalPage.sendMessageTextArea.click();
        wait.until(ExpectedConditions.visibilityOf(erdalPage.send_btn));
    }

    @When("User click Add mention button")
    public void user_click_add_mention_button() {
        erdalPage.add_Mention_btn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(erdalPage.add_Mention_hr1User));

    }

    @When("User click hr1user")
    public void user_click_hr1user() {
        erdalPage.add_Mention_hr1User.click();
    }

    @When("User send message with added the mention")
    public void userSendMessageWithAddedTheMention() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(erdalPage.send_btn));
        erdalPage.send_btn.click();
    }

    @Then("User should be able to add mentions")
    public void user_should_be_able_to_add_mentions() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(erdalPage.check_Mention_hr1User));
        Assert.assertTrue(erdalPage.check_Mention_hr1User.isDisplayed());
    }

    @When("User click Link button")
    public void user_click_link_button() {
        erdalPage.link_btn.click();

    }

    @When("User write {string} in Link box")
    public void user_write_in_link_box(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(erdalPage.link_Save_btn));
        erdalPage.link_URL_box.click();
        erdalPage.link_URL_box.sendKeys(string);
    }

    @When("User write {string} in Text box")
    public void user_write_in_text_box(String string) {
        erdalPage.link_Text_box.click();
        erdalPage.link_Text_box.sendKeys(string);
    }

    @When("User clicks Save button")
    public void user_clicks_save_button() throws InterruptedException {
        erdalPage.link_Save_btn.click();

    }

    @And("User send message with the added link")
    public void userSendMessageWithTheAddedLink() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(erdalPage.send_btn));
        erdalPage.send_btn.click();
    }

    @Then("User should be able to attach the link to the specified text.")
    public void user_should_be_able_to_attach_the_link_to_the_specified_text() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(erdalPage.link_check));
        Assert.assertTrue(erdalPage.link_check.isDisplayed());
    }

    @When("User click Insert video button")
    public void user_click_ınsert_video_button() {
        erdalPage.insert_Video_btn.click();
    }

    @When("User click Video source box")
    public void user_click_video_source_box() {
        erdalPage.video_Source_box.click();
    }

    @When("User write {string} in Video source box")
    public void user_write_in_video_source_box(String string) {
        erdalPage.video_Source_box.sendKeys(string);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(erdalPage.video_loaded_check));
    }

    @When("User clicks video Save button")
    public void user_clicks_video_save_button() throws InterruptedException {
        erdalPage.video_Save_btn.click();
        Thread.sleep(5000);
    }

    @And("User send message with added the video")
    public void userSendMessageWithAddedTheVideo() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(erdalPage.send_btn));
        erdalPage.send_btn.click();
    }

    @Then("User should be able to insert  videos")
    public void user_should_be_able_to_insert_videos() {
        Assert.assertTrue(erdalPage.video_Added_check.isDisplayed());
    }


    @Given("User write {string} in Message Field")
    public void userWriteInMessageField(String arg0) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        erdalPage.messageField.sendKeys(arg0);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("User click Add tag button")
    public void user_click_add_tag_button() {
        erdalPage.add_tag_btn.click();
    }

    @When("User write {string} in the box")
    public void user_write_in_the_box(String string) {
        erdalPage.add_tag_area.clear();
        erdalPage.add_tag_area.sendKeys(string);
    }

    @When("User clicks ADD button")
    public void user_clicks_add_button() {
        erdalPage.add_btn.click();
    }

    @And("User sends message with added the tag")
    public void userSendsMessageWithAddedTheTag() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(erdalPage.send_btn));
        erdalPage.send_btn.click();
    }

    @Then("User should be able to add tags to messages")
    public void user_should_be_able_to_add_tags_to_messages() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(erdalPage.add_Tag_check));
        Assert.assertTrue(erdalPage.add_Tag_check.isDisplayed());
    }


    @Given("user add a tag with {string}")
    public void user_add_a_tag_with(String string) {
        erdalPage.add_tag_btn.click();
        erdalPage.add_tag_area.clear();
        erdalPage.add_tag_area.sendKeys(string);
        erdalPage.add_btn.click();
        Assert.assertTrue(erdalPage.add_Tag_check.isDisplayed());
    }

    @When("User click cross button near the tag in tags column")
    public void user_click_cross_button_near_the_tag_in_tags_column() throws InterruptedException {
        Thread.sleep(4000);
        erdalPage.remove_link_btn.click();

        Thread.sleep(4000);
    }

    @Then("User should be able to remove tags before sending the message")
    public void user_should_be_able_to_remove_tags_before_sending_the_message() {

        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[.='test']"));
    }


    @Given("the user added a link {string} with the specified text {string}")
    public void the_user_added_a_link_with_the_specified_text(String url, String text) {

        erdalPage.link_btn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(erdalPage.link_Save_btn));

        erdalPage.link_URL_box.click();
        erdalPage.link_URL_box.sendKeys(url);

        erdalPage.link_Text_box.click();
        erdalPage.link_Text_box.sendKeys(text);

        erdalPage.link_Save_btn.click();
        erdalPage.send_btn.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        wait.until(ExpectedConditions.visibilityOf(erdalPage.link_check));

        Assert.assertTrue(erdalPage.link_check.isDisplayed());
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("User right click the link with the specified text")
    public void user_right_click_the_link_with_the_specified_text() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(erdalPage.link_check).contextClick().build().perform();
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("User click Remove link")
    public void user_click_remove_link() {
        erdalPage.link_remove.click();
    }

    @Then("User should be able to cancel the link before sending the message")
    public void user_should_be_able_to_cancel_the_link_before_sending_the_message() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        BrowserUtils.verifyElementNotDisplayed(By.linkText("test2"));
        Driver.getDriver().switchTo().parentFrame();
    }

    //-----------------------------------------------------------------------------
    @Given("the user added a video {string}")
    public void the_user_added_a_video(String url) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        erdalPage.insert_Video_btn.click();

        erdalPage.video_Source_box.click();

        erdalPage.video_Source_box.sendKeys(url);

        wait.until(ExpectedConditions.visibilityOf(erdalPage.video_loaded_check));

        erdalPage.video_Save_btn.click();

        Assert.assertTrue(erdalPage.video_Added_check.isDisplayed());


    }

    @When("User right click the video")
    public void user_right_click_the_video() {

    }

    @When("User click Delete video")
    public void user_click_delete_video() {

    }

    @Then("User should be able to cancel the video before sending the message")
    public void user_should_be_able_to_cancel_the_video_before_sending_the_message() {

    }




//-----------------------------------------------------------------------------


}
