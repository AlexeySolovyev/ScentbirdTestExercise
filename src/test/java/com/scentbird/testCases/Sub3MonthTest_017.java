package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub3MonthPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

// 3m, for him, send it right now, send personal message options

public class Sub3MonthTest_017 extends BaseClass {

    @Test
    public void sub3MonthTest() throws IOException {
        driver.get(baseURL);
        Sub3MonthPage subscriptionPage = new Sub3MonthPage(driver);

        subscriptionPage.clickContinue3MonthSub();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        subscriptionPage.checkPromoTitle();
        subscriptionPage.clickForHimRadioButton();
        subscriptionPage.clickSendItRightNowRadioButton();
        subscriptionPage.typeName();
        subscriptionPage.checkName();
        subscriptionPage.typeEmail();
        subscriptionPage.checkEmail();
        subscriptionPage.typePersonalMessage();
        subscriptionPage.checkMessageText();
        subscriptionPage.clickReviewOrderButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        subscriptionPage.checkLoginPage();
    }
}
