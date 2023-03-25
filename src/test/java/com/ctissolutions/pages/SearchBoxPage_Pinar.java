package com.ctissolutions.pages;

import com.ctissolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class SearchBoxPage_Pinar {

    public SearchBoxPage_Pinar() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "LIVEFEED_search")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item']/span[2]/span[1]")
    public List<WebElement> filters;

    @FindBy(xpath = "//span[.='Work']")
    public WebElement workButton;

    @FindBy(xpath = "//span[.='Favorites']")
    public WebElement FavoritesButton;

    @FindBy(xpath = "//span[.='Announcements']")
    public WebElement announcementsButton;

    @FindBy(xpath = "//span[.='Workflows']")
    public WebElement workFlowsButton;

    @FindBy(xpath = "//span[.='My Activity']")
    public WebElement myActivityButton;


    @FindBy(xpath = "//span[.='Add field']")
    public WebElement AddField;

    @FindBy(xpath = "//span[.='Restore default fields']")
    public WebElement defaultFields;

    @FindBy(xpath = "//div[@data-id='field_FAVORITES_USER_ID']")
    public WebElement AddFieldFavorites;

    @FindBy(xpath = "//div[@data-id='field_TAG']")
    public WebElement AddFieldTag;

    @FindBy(xpath = "//div[@data-id='field_EXTRANET']")
    public WebElement AddFieldExtraNet;

    @FindBy(xpath = "//div[@data-name='TAG']/div[2]/span")
    public WebElement removeTagField;

    @FindBy(xpath = "//span[@title='Hide field']")
    public List<WebElement> removeFieldButton;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement dateDropdown;

    @FindBy(xpath = "(//div[.='This week'])[last()]")
    public WebElement dateThisWeek;

    @FindBy(xpath ="//span[@class='main-ui-item-icon main-ui-search']")
    public WebElement searchButton;



}
