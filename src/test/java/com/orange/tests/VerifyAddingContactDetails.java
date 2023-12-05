package com.orange.tests;

import base.BaseClass;
import com.orange.HomePage;
import com.orange.LoginPage;
import com.orange.PimPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyAddingContactDetails extends BaseClass {
    @BeforeTest
    public void setUp(){
        loadConfig();
        launchWeb();
    }
    @Test
    public void verifyAdminCanAddContactDetails(){
        LoginPage loginPageObj = new LoginPage();
        HomePage homePageObj = new HomePage();
        PimPage pimPageObj = new PimPage();

        loginPageObj.login("Admin","admin123");
        homePageObj.navigaeToPimPage();
        pimPageObj.searchByEmployeeName("Alice");
        pimPageObj.clickOnEditIcon();
        pimPageObj.clickOnContactDetails();

    }
}
