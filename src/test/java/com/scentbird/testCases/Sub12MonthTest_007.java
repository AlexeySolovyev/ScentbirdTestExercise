package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub12MonthPage;
import org.testng.annotations.Test;

// 12m, for him, choose a later date to send, without message options

public class Sub12MonthTest_007 extends BaseClass {

    @Test
    public void Sub12MonthTest() {
        driver.get(baseURL);
        Sub12MonthPage subscriptionPage = new Sub12MonthPage(driver);

        subscriptionPage.clickContinue12MonthSub();
        subscriptionPage.checkPromoTitle();
        subscriptionPage.clickForHimRadioButton();
        subscriptionPage.clickChooseLateDateRadioButton();
        subscriptionPage.setLateDate();
        subscriptionPage.typeName();
        subscriptionPage.checkName();
        subscriptionPage.typeEmail();
        subscriptionPage.checkEmail();
        subscriptionPage.clickReviewOrderButton();
        subscriptionPage.checkLoginPage();
    }
}
