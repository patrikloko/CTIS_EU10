package com.ctissolutions.pages;

import com.ctissolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagesPage_Busra {

    public SendMessagesPage_Busra(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement sendMessageField;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageField;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "(//span[.='All employees'])[2]")
    public WebElement allEmployeesButton;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMoreButton;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement getAllEmployeesRemoveButton;

    @FindBy(xpath = "//a[@id='destination1655006_last_U594']")
    public WebElement anotherEmployeeToAdd;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMessageForTitle;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorMessageForPerson;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[1]")
    public WebElement moreButtonUnderMessage;

    @FindBy(xpath="(//span[.='Delete'])[2]")
    public WebElement deleteButtonUnderMore;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addPersonButton;

    @FindBy(xpath = "//a[@href='#U592']")
    public WebElement addAnotherRecipents;

    @FindBy(xpath = "//a[@id='destLastTab_rdL6v2']")
    public WebElement recentButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepatments;

    @FindBy(xpath = "//a[@id='destEmailTab_rdL6v2']")
    public WebElement emailUsers;

  @FindBy (xpath="(//div[@class='feed-post-text-block'])[1]")
    public WebElement sendingMessageForEveryone;


  @FindBy (xpath="//span[@id='feed-add-post-destination-item']")
    public WebElement addingOtherEmployees;

  @FindBy (xpath="//body[@style='min-height: 184px;']")
    public WebElement messageFieldToProveAfterCancel;
}
