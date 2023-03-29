package com.ctissolutions.step_definitions;

import com.ctissolutions.pages.LoginPage;
import com.ctissolutions.pages.LogoutPage;
import com.ctissolutions.pages.MessagePage_Loko;
import com.ctissolutions.utilities.BrowserUtils;
import com.ctissolutions.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lokman_messageFileUpload {
    LoginPage loginPage;
    LogoutPage logoutPage;
    WebDriver driver;
    MessagePage_Loko messagePage;


    @Before(value = "@wip", order = 2)
    public void setUp() {
        loginPage = new LoginPage();
        logoutPage = new LogoutPage();
        driver = Driver.getDriver();
        messagePage = new MessagePage_Loko();


    }

    @When("user click the massage button")
    public void user_click_the_massage_button() {
        messagePage.messageField.click();
    }

    @And("user click the uploadFiles button")
    public void user_click_the_upload_files_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(messagePage.attachButton));
        messagePage.attachButton.click();

    }

    @And("user upload a ppt file")
    public void user_upload_a_ppt_file() {
        String pptFilePath = "C:\\Users\\patri\\OneDrive\\Resimler\\Ekran Görüntüleri\\test1.pptx";

        messagePage.inputFilesButton.sendKeys(pptFilePath);

    }

    @And("user upload a cvs file")
    public void user_upload_a_cvs_file() {
        String xlsxFilePath = "C:\\Users\\patri\\OneDrive\\Resimler\\Ekran Görüntüleri\\test2.xlsx";
        messagePage.inputFilesButton.sendKeys(xlsxFilePath);
    }

    @And("user upload a image")
    public void user_upload_a_image() {
        String pngFilePath = "C:\\Users\\patri\\OneDrive\\Resimler\\Ekran Görüntüleri\\loko.png";
        messagePage.inputFilesButton.sendKeys(pngFilePath);
    }

    @Then("user should see three files uploded.")
    public void user_should_see_three_files_uploded() {
        Assert.assertTrue(messagePage.removeButton1.isEnabled());
        Assert.assertTrue(messagePage.removeButton2.isEnabled());
        Assert.assertTrue(messagePage.removeButton3.isEnabled());
    }

    @When("user click the insert in text button")
    public void user_click_the_insert_in_text_button() throws InterruptedException {
        Thread.sleep(2000);
        messagePage.insertButton1.click();
        messagePage.insertButton2.click();
        messagePage.insertButton3.click();
    }

    @Then("user should see three files inserted.")
    public void userShouldSeeThreeFilesInserted() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(messagePage.insertedImageFile.isEnabled());

    }

    @Then("user should see image file is uploded.")
    public void userShouldSeeImageFileIsUploded() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(messagePage.insertedImageFile.isEnabled());
//        Assert.assertTrue(messagePage.insertedPptxFile.isEnabled());

    }


    @And("user click the remove button")
    public void userClickTheRemoveButton() {
        messagePage.removeButton1.click();

        messagePage.removeButton2.click();

        messagePage.removeButton1.click();
    }

    @Then("user should see the images and files remove.")
    public void userShouldSeeTheImagesAndFilesRemove() {
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//table[@cellspacing='0']/tbody//tr[3]//td[5]"));
    }

    @And("user click edit button near the files")
    public void userClickEditButtonNearTheFiles() throws InterruptedException {
        BrowserUtils.hover(messagePage.renameArea);
        Thread.sleep(2000);
        messagePage.editButton.click();
    }


    @And("user change the name")
    public void userChangeTheName()  {

        messagePage.sendKeyArea.sendKeys("newname"+Keys.ENTER);


    }

    @Then("user should see new the file name.")
    public void userShouldSeeNewTheFileName() {

        String expectedFileName = "newname";

        Assert.assertTrue(messagePage.renameArea.getText().contains(expectedFileName));
    }
}
