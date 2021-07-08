package com.scentbird.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sub12MonthPage {
    WebDriver localDriver;
    public Sub12MonthPage(WebDriver remoteDriver) {
        localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//*[@id='mainContent']/div[2]/div[1]/div[1]/div/div/button")
    @CacheLookup
    WebElement continue12MonthButton;

    @FindBy(xpath = "//*[@id='trapfocus_4']/div/div[2]/div[4]/div[2]/div/label[1]/div[1]")
    @CacheLookup
    WebElement maleRadioButton;

    @FindBy(xpath = "//*[@id='trapfocus_4']/div/div[2]/div[4]/div[2]/div/label[2]/div[1]")
    @CacheLookup
    WebElement femaleRadioButton;

    @FindBy(xpath = "//*[@id='trapfocus_4']/div/div[2]/div[5]/div[2]/div/label/div[1]")
    @CacheLookup
    WebElement sendRightNowButton;

    @FindBy(xpath = "//*[@id='trapfocus_4']/div/div[2]/div[5]/div[2]/div/div/label/div[1]")
    @CacheLookup
    WebElement chooseDateToSend;

    @FindBy(id = "simpleSelect_7")
    @CacheLookup
    WebElement monthDropDown;

    @FindBy(id = "simpleSelect_8")
    @CacheLookup
    WebElement dayDropDown;

    @FindBy(id = "simpleSelect_9")
    @CacheLookup
    WebElement yearDropDown;

    @FindBy(id = "input_5")
    @CacheLookup
    WebElement nameField;

    @FindBy(id = "input_6")
    @CacheLookup
    WebElement emailField;

    @FindBy(css = "textarea[class='_1B9eoh']")
    @CacheLookup
    WebElement messageBox;

    @FindBy(css = "button[class='sfTwnU mt-32 button _3znSnk _35mfS_ _1-7Zp4 _22bJHu']")
    @CacheLookup
    WebElement reviewOrderButton;

    @FindBy(css = "h1[class='mb-24 _3gDnfa _3KO5kB']")
    @CacheLookup
    WebElement LoginToAccount;

    public void clickContinue12Month() {
        continue12MonthButton.click();
    }

    public void

}
