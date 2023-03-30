package com.ctissolutions.pages;

import com.ctissolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class erdal_CTS10_240_page {




    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement send_btn;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement sendMessageTextArea;

    @FindBy(id = "blog-submit-button-save")
    public WebElement send_msg_btn;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement add_Mention_btn;

    @FindBy(xpath = "//*[@class='bx-finder-box-item-t7-name'][.='hr1@cybertekschool.com']")
    public WebElement add_Mention_hr1User;

    @FindBy(xpath = "//a[@class='feed-add-post-destination-new'][contains(text(),'hr1@cybertekschool.com')]")
    public WebElement check_Mention_hr1User;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement link_btn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement link_URL_box;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement link_Text_box;

    @FindBy(id = "undefined")
    public WebElement link_Save_btn;

    @FindBy(linkText = "test2")
    public WebElement link_check;

    @FindBy(xpath = "//*[@id=\"bx-admin-prefix\"]/span[3]/span[2]")
    public WebElement link_remove;

    @FindBy(xpath = "//*[@title='Insert video']")
    public WebElement insert_Video_btn;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement video_Source_box;

    @FindBy(id = "undefined")
    public WebElement video_Save_btn;

    @FindBy(xpath = "//*[@class='bxhtmled-video-error']")
    public WebElement video_Error_check;

    @FindBy(xpath = "//img[contains(@title,'Video')]")
    public WebElement video_Added_check;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-size")
    public WebElement video_loaded_check;

    @FindBy(xpath = "//*[@id='post-tags-container-blogPostForm']//span[@class='feed-add-post-del-but']")
    public WebElement remove_link_btn;

    @FindBy(xpath = "//*[@style=\"z-index: 3005; position: absolute; display: block; top: 317px; left: 484px; height: auto; width: auto;\"]/span[3]/span[2][.='Delete video']")
    public WebElement delete_video_btn;
    //*[@style="z-index: 3005; position: absolute; display: block; top: 317px; left: 484px; height: auto; width: auto;"]/span[3]/span[2][.='Delete video']

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement add_tag_btn;

    @FindBy(id = "TAGS_blogPostForm67abSn")
    public WebElement add_tag_area;

    @FindBy(xpath = "//*/div[@class='popup-window-buttons'][.='Add']")
    public WebElement add_btn;

    @FindBy(xpath = "//a[.='test']")
    public WebElement add_Tag_check;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageField;















    public erdal_CTS10_240_page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }



}
