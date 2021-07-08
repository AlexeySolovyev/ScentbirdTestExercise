package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub6MonthPage;
import org.testng.annotations.Test;

// 6m, for him, choose a later date to send, without message options

public class Sub6MonthTest_015 extends BaseClass {

    @Test
    public void Sub6MonthTest() {
        driver.get(baseURL);
        Sub6MonthPage subscriptionPage = new Sub6MonthPage(driver);

        subscriptionPage.clickContinue6MonthSub();
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
