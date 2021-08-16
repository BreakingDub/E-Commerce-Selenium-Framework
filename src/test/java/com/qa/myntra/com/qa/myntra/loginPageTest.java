package com.qa.myntra.com.qa.myntra;

import com.qa.myntra.pages.homePage;
import com.qa.myntra.pages.loginSignUpPage;
import com.qa.myntra.pages.menSlidersPage;
import com.qa.myntra.testbase.testbase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginPageTest extends testbase {

    loginSignUpPage lsp;
    homePage hp;


    @BeforeMethod
    public void setup(){
        initialisation();
        lsp = new loginSignUpPage();
        hp = new homePage();
        hp.LoginSignup();

    }

    @Test
    public void testcase1() throws InterruptedException {
        lsp.enternNum();
        Thread.sleep(10000);

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
