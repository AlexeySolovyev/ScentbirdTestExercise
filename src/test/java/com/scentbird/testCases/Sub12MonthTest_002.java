package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub12MonthPage;
import org.testng.annotations.Test;

import java.io.IOException;

// 12m, for her, send it right now, send personal message options

public class Sub12MonthTest_002 extends BaseClass{

    @Test
    public void sub12MonthTest() throws IOException {
        driver.get(baseURL);
        Sub12MonthPage subscriptionPage = new Sub12MonthPage(driver);

        subscriptionPage.clickContinue12MonthSub();
        subscriptionPage.checkPromoTitle();
        subscriptionPage.clickForHerRadioButton();
        subscriptionPage.clickSendItRightNowRadioButton();
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
