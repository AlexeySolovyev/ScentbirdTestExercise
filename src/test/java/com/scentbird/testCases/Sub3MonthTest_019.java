package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub3MonthPage;
import org.testng.annotations.Test;

// 3m, for him, choose a later date to send, send personal message options

public class Sub3MonthTest_019 extends BaseClass {

    @Test
    public void sub3MonthTest() {
        driver.get(baseURL);
        Sub3MonthPage subscriptionPage = new Sub3MonthPage(driver);

        subscriptionPage.clickContinue3MonthSub();
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
        subscriptionPage.checkLoginPage();

    }
}
