package com.scentbird.testCases;

import com.scentbird.pageObjects.Sub12MonthPage;
import org.testng.annotations.Test;

public class Sub12MonthTest_001 extends BaseClass{

    @Test
    public void Sub12MonthTest() {
        driver.get(baseURL);
        Sub12MonthPage subscriptionPage = new Sub12MonthPage(driver);


    }

}
