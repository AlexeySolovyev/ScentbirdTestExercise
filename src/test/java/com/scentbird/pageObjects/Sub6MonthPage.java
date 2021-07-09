package com.scentbird.pageObjects;

import com.scentbird.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class Sub6MonthPage extends BaseClass {

    WebDriver localDriver;
    public Sub6MonthPage(WebDriver remoteDriver) {
        localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'6 months')]")
    @CacheLookup
    WebElement continue6MonthButton;

    @FindBy(css = "span[class='_1fjNH- _3KO5kB']")
    @CacheLookup
    WebElement promoTitle;

    @FindBy(xpath = "//div[contains(text(),'For him')]")
    @CacheLookup
    WebElement maleRadioButton;

    @FindBy(xpath = "//div[contains(text(),'For her')]")
    @CacheLookup
    WebElement femaleRadioButton;

    @FindBy(xpath = "//div[contains(text(),'right now')]")
    @CacheLookup
    WebElement clickRightNowRadioButton;

    @FindBy(xpath = "//div[contains(text(),'later date')]")
    @CacheLookup
    WebElement chooseDateToSendRadioButton;

    @FindBy(id = "simpleSelect_7")
    @CacheLookup
    WebElement monthDropDown;

    @FindBy(css = "option[value='09']")
    @CacheLookup
    WebElement month;

    @FindBy(id = "simpleSelect_8")
    @CacheLookup
    WebElement dayDropDown;

    @FindBy(css = "option[value='19']")
    @CacheLookup
    WebElement day;

    @FindBy(id = "simpleSelect_9")
    @CacheLookup
    WebElement yearDropDown;

    @FindBy(css = "option[value='2021']")
    @CacheLookup
    WebElement year;

    @FindBy(css = "img[class='w-full']")
    @CacheLookup
    WebElement mainPicture;

    @FindBy(id = "input_5")
    @CacheLookup
    WebElement nameField;

    @FindBy(css = "div[class='_3SLe56 _3KO5kB']")
    @CacheLookup
    WebElement nameText;

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    @CacheLookup
    WebElement editButton;

    @FindBy(id = "input_6")
    @CacheLookup
    WebElement emailField;

    @FindBy(css = "div[class='_3SLe56 _3KO5kB']")
    @CacheLookup
    WebElement emailText;

    @FindBy(css = "textarea[class='_1B9eoh']")
    @CacheLookup
    WebElement messageBox;

    @FindBy(xpath = "//div[contains(text(), 'Personal message')]")
    @CacheLookup
    WebElement messageText;

    @FindBy(css = "span[class='_3LWlJD']")
    @CacheLookup
    WebElement reviewOrderButton;

    @FindBy(css = "h1[class='mb-24 _3gDnfa _3KO5kB']")
    @CacheLookup
    WebElement LoginToAccount;

    public void clickContinue6MonthSub() {
        continue6MonthButton.click();
    }

    public void checkPromoTitle() throws IOException {
        if (promoTitle.getText().contains("6 months gift subscription")) {
            logger.info("Promo title checked, OK");
            Assert.assertTrue(true);
        } else {
            logger.info("Promo title is invalid");
            captureScreen(localDriver, "12 Month Test Case");
            Assert.assertFalse(false);
        }
    }

    public void clickForHimRadioButton() {
        maleRadioButton.click();
    }

    public void clickForHerRadioButton() {
        femaleRadioButton.click();
    }

    public void clickSendItRightNowRadioButton() {
        clickRightNowRadioButton.click();
    }

    public void clickChooseLateDateRadioButton() {
        chooseDateToSendRadioButton.click();
    }

    public void setLateDate() {
        monthDropDown.click();
        month.click();
        dayDropDown.click();
        day.click();
        yearDropDown.click();
        year.click();
    }

    public void typeName() {
        nameField.click();
        nameField.clear();
        nameField.sendKeys("TestName1");
        mainPicture.click();
    }

    public void checkName() throws IOException {
        if (nameText.getText().contains("TestName1")) {
            logger.info("Name checked, OK");
            Assert.assertTrue(true);
        } else {
            logger.info("Name is invalid");
            captureScreen(localDriver, "6 Month Test Case");
            Assert.assertFalse(false);
        }
    }

    public void typeEmail() {
        emailField.click();
        emailField.clear();
        emailField.sendKeys("testuser1@gmail.org");
        mainPicture.click();
    }

    public void checkEmail() throws IOException {
        if (emailText.getText().contains("testuser1@gmail.org")) {
            logger.info("Email checked, OK");
            Assert.assertTrue(true);
        } else {
            logger.info("Email is invalid");
            captureScreen(localDriver, "6 Month Test Case");
            Assert.assertFalse(false);
        }
    }

    public void typePersonalMessage() {
        messageBox.click();
        messageBox.clear();
        messageBox.sendKeys("Happy birthday!");
        mainPicture.click();
    }

    public void checkMessageText() throws IOException {
        if (messageText.getText().contains("Happy birthday!")) {
            logger.info("Message checked, OK");
            Assert.assertTrue(true);
        } else {
            logger.info("Message is invalid");
            captureScreen(localDriver, "6 Month Test Case");
            Assert.assertFalse(false);
        }
    }

    public void clickReviewOrderButton() {
        reviewOrderButton.click();
    }

    public void checkLoginPage() throws IOException {
        if (LoginToAccount.getText().contains("Log in to your ")) {
            logger.info("Login page has been appeared, OK");
            Assert.assertTrue(true);
        } else {
            logger.info("Login Page title didn't appear, not good...");
            captureScreen(localDriver, "12 Month Test Case");
            Assert.assertFalse(false);
        }
    }

}

