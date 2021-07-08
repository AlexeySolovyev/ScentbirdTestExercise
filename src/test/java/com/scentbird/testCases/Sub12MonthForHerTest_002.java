package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub12MonthPage;
import org.testng.annotations.Test;

public class Sub12MonthForHerTest_002 extends BaseClass{
    @Test
    public void Sub12MonthForHerTest() {
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
