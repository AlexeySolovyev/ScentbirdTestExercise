package com.scentbird.pageObjects;

import com.scentbird.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Sub12MonthPage extends BaseClass {
    WebDriver localDriver;
    public Sub12MonthPage(WebDriver remoteDriver) {
        localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'12')]")
    @CacheLookup
    WebElement continue12MonthButton;

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
    WebElement sendRightNowRadioButton;

    @FindBy(xpath = "//div[contains(text(),'later date')]")
    @CacheLookup
    WebElement chooseDateToSendRadioButton;

    @FindBy(id = "simpleSelect_7")
    @CacheLookup
    WebElement monthDropDown;

    @FindBy(id = "simpleSelect_8")
    @CacheLookup
    WebElement dayDropDown;

    @FindBy(id = "simpleSelect_9")
    @CacheLookup
    WebElement yearDropDown;

    @FindBy(css = "img[class='w-full']")
    @CacheLookup
    WebElement mainPicture;

    @FindBy(id = "input_5")
    @CacheLookup
    WebElement nameField;

    @FindBy(css = "div[class=\"_3SLe56 _3KO5kB\"]")
    @CacheLookup
    WebElement nameText;

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    @CacheLookup
    WebElement editButton;

    @FindBy(id = "input_6")
    @CacheLookup
    WebElement emailField;

    @FindBy(css = "div[class=\"_3SLe56 _3KO5kB\"]")
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

    public void clickContinue12MonthSub() {
        continue12MonthButton.click();
    }

    public void checkPromoTitle() {
        if (promoTitle.getText().contains("12 months gift subscription")) {
            Assert.assertTrue(true);
        } else {
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
        sendRightNowRadioButton.click();
    }

    public void typeName() {
        nameField.click();
        nameField.clear();
        nameField.sendKeys("TestName1");
        mainPicture.click();

    }

    public void checkName() {
        if (nameText.getText().contains("TestName1")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
    }

    public void typeEmail() {
        emailField.click();
        emailField.clear();
        emailField.sendKeys("testuser1@gmail.org");
        mainPicture.click();
    }

    public void checkEmail() {
        if (emailText.getText().contains("testuser1@gmail.org")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
    }

    public void typePersonalMessage() {
        messageBox.click();
        messageBox.clear();
        messageBox.sendKeys("Happy birthday!");
        mainPicture.click();
    }

    public void checkMessageText() {
        if (messageText.getText().contains("Happy birthday!")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
    }

    public void clickReviewOrderButton() {
        reviewOrderButton.click();
    }

    public void checkLoginPage() {
        if (LoginToAccount.getText().contains("Log in to your ")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
    }
}
