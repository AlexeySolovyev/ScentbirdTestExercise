package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub3MonthPage;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

// 3m, for him, choose a later date to send, send personal message options

public class Sub3MonthTest_019 extends BaseClass {

    @Test
    public void sub3MonthTest() throws IOException {
        driver.get(baseURL);
        Sub3MonthPage subscriptionPage = new Sub3MonthPage(driver);

        subscriptionPage.clickContinue3MonthSub();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        subscriptionPage.checkPromoTitle();
        subscriptionPage.clickForHimRadioButton();
        subscriptionPage.clickChooseLateDateRadioButton();
        subscriptionPage.setLateDate();
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
