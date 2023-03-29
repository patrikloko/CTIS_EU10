package com.ctissolutions.pages;

import com.ctissolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage_Loko {

    public MessagePage_Loko(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement messageField;

    @FindBy(css = "span[id='bx-b-uploadfile-blogPostForm']")
    public WebElement attachButton;
    @FindBy(css = "input[name='bxu_files[]']")
    public WebElement inputFilesButton;

   //remove buttons
    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[1]//td[5]")
   public WebElement removeButton1;
    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[2]//td[5]")
    public  WebElement removeButton2;
    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[3]//td[5]")
    public WebElement removeButton3;

    //insert buttons
    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[1]//td[4]")
    public WebElement insertButton1;
    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[2]//td[4]")
    public  WebElement insertButton2;
    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[3]//td[4]")
    public WebElement insertButton3;

    //After insert
    @FindBy(xpath = "//span[.='test1.pptx']")
    public WebElement insertedPptxFile;

    @FindBy(xpath = "//img[contains(@src,'loko')]")
    public WebElement insertedImageFile;

    // message text iframe
    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageTextIframe;

    //after a image loaded
    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[1]//td[1]//input[@type='text']")
    public  WebElement imageloaded;

    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public  WebElement editButton;

    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[1]//td[1]/span/span[1]")
    public WebElement renameArea;

    @FindBy(xpath = "//table[@cellspacing='0']/tbody//tr[1]//td[1]//input[1]")
    public WebElement sendKeyArea;






}
