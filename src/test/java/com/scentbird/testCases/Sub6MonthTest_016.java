package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub6MonthPage;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// 6m, for her, choose a later date to send, without message options

public class Sub6MonthTest_016 extends BaseClass {

    @Test
    public void sub6MontTest() throws IOException {

        driver.get(baseURL);
        Sub6MonthPage subscriptionPage = new Sub6MonthPage(driver);

        subscriptionPage.clickContinue6MonthSub();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        subscriptionPage.checkPromoTitle();
        subscriptionPage.clickForHerRadioButton();
        subscriptionPage.clickChooseLateDateRadioButton();
        subscriptionPage.setLateDate();
        subscriptionPage.typeName();
        subscriptionPage.checkName();
        subscriptionPage.typeEmail();
        subscriptionPage.checkEmail();
        subscriptionPage.clickReviewOrderButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        subscriptionPage.checkLoginPage();
    }
}
