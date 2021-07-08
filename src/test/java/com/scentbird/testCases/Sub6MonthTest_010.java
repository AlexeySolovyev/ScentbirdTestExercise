package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub6MonthPage;
import org.testng.annotations.Test;

// 6m, for him, send it right now, send personal message options

public class Sub6MonthTest_010 extends BaseClass {

    @Test
    public void Sub6MonthTest() {
        driver.get(baseURL);
        Sub6MonthPage subscriptionPage = new Sub6MonthPage(driver);

        subscriptionPage.clickContinue6MonthSub();
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
