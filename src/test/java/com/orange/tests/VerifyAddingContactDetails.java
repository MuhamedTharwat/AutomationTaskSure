package com.orange.tests;

import base.BaseClass;
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
        Log
    }
}
