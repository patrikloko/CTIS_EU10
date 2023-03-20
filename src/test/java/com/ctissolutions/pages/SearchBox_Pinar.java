package com.ctissolutions.pages;

import com.ctissolutions.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox_Pinar {

    public SearchBox_Pinar() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "")
    public WebElement searchBox;
}
