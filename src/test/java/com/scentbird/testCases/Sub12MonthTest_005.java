package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub12MonthPage;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// 12m, for him, send it right now, without personal message options

public class Sub12MonthTest_005 extends BaseClass{

    @Test
    public void sub12MonthTest() throws IOException {

        driver.get(baseURL);
        Sub12MonthPage subscriptionPage = new Sub12MonthPage(driver);

        subscriptionPage.clickContinue12MonthSub();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        subscriptionPage.checkPromoTitle();
        subscriptionPage.clickForHimRadioButton();
        subscriptionPage.clickSendItRightNowRadioButton();
        subscriptionPage.typeName();
        subscriptionPage.checkName();
        subscriptionPage.typeEmail();
        subscriptionPage.checkEmail();
        subscriptionPage.clickReviewOrderButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        subscriptionPage.checkLoginPage();
    }
}
