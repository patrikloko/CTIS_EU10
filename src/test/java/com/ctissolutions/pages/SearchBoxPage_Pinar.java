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

    @FindBy(css = ".main-ui-control.main-ui-select[data-name='EXTRANET']")
    public WebElement extraNetDropdown;


    @FindBy(xpath = "//div[@data-name='TAG']/div[2]/span")
    public WebElement removeTagField;

    @FindBy(xpath = "//span[@title='Hide field']")
    public List<WebElement> removeFieldButton;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement dateDropdown;

    @FindBy(xpath = "(//div[.='This week'])[last()]")
    public WebElement dateThisWeek;

    @FindBy(xpath = "//div[@title='Date: This week']/div")
    public WebElement thisWeekTitle;

    @FindBy(xpath ="//span[@class='main-ui-item-icon main-ui-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][text()='Posts']")
    public WebElement postsType;

    @FindBy(xpath = "//div[@class='main-ui-square-item']")
    public WebElement searchBoxTitle;

    @FindBy(xpath = "//div[@class='main-ui-control main-ui-multi-select']")
    public WebElement typeInputBox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][text()='Announcements']")
    public WebElement announcementsType;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][text()='Polls']")
    public WebElement pollsType;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][text()='Tasks']")
    public WebElement tasksType;

    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement saveFilter;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    public WebElement filterNameInput;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label']")
    public List<WebElement> fields;

    @FindBy(xpath = "//div[@class='main-ui-item-icon-block main-ui-show']//span[@class='main-ui-item-icon main-ui-delete']")
    public WebElement crossSignOfSearchBox;

    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text'][text()='groups']")
    public WebElement groupFilter;

    @FindBy(xpath = "//span[@class='main-ui-control-field-label']")
    public List<WebElement> defaultFieldsNames;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset']")
    public WebElement resetButton;

    @FindBy(xpath = "//span[@class='main-ui-select-name']")
    public WebElement anyDateDefault;
}
