package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub12MonthPage;
import org.testng.annotations.Test;

// for her, choose a later date to send options

public class Sub12MonthTest_004 extends BaseClass {

    @Test
    public void Sub12MothTest() {
            driver.get(baseURL);
            Sub12MonthPage subscriptionPage = new Sub12MonthPage(driver);

            subscriptionPage.clickContinue12MonthSub();
            subscriptionPage.checkPromoTitle();
            subscriptionPage.clickForHerRadioButton();
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

