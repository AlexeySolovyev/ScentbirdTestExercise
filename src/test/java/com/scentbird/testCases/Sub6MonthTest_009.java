package com.scentbird.testCases;


import com.scentbird.pageObjects.Sub6MonthPage;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

// 6m, for him, send it right now, send personal message options

public class Sub6MonthTest_009 extends BaseClass{

    @Test
    public void sub6MonthTest() throws IOException {

        driver.get(baseURL);
        Sub6MonthPage subscriptionPage = new Sub6MonthPage(driver);

        subscriptionPage.clickContinue6MonthSub();
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
