package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub3MonthPage;
import org.testng.annotations.Test;

public class Sub3MonthTest_018  extends BaseClass {

    @Test
    public void sub3MonthTest() {
        driver.get(baseURL);
        Sub3MonthPage subscriptionPage = new Sub3MonthPage(driver);

        subscriptionPage.clickContinue3MonthSub();
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
