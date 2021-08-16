package com.qa.myntra.com.qa.myntra;

import com.qa.myntra.pages.homePage;
import com.qa.myntra.pages.mensPage;
import com.qa.myntra.pages.mensShoesPage;
import com.qa.myntra.pages.productPage;
import com.qa.myntra.testbase.testbase;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mensShoesPageTest extends testbase {
    homePage hp;
    mensPage mp;
    mensShoesPage msp;
    productPage pp;

    @BeforeMethod
    public void setup() throws FindFailed {
        initialisation();
        hp = new homePage();
        mp = new mensPage();
        msp = new mensShoesPage();
        hp.selectingMen();
        mp.selectingShoes();

    }
    @Test
    public void testcase1() throws InterruptedException {
       pp = msp.selectingMenShoes();
        Thread.sleep(3000);
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
