package com.qa.myntra.com.qa.myntra;

import com.qa.myntra.pages.*;
import com.qa.myntra.testbase.testbase;
import junit.framework.Assert;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class productPageTest extends testbase {

    homePage hp;
    mensPage mp;
    mensShoesPage msp;
    productPage pp;
    shoppingBag sb;

    @BeforeMethod
    public void setup() throws FindFailed {
        initialisation();
        hp = new homePage();
        mp = new mensPage();
        msp = new mensShoesPage();
        pp = new productPage();
        hp.selectingMen();
        mp.selectingShoes();
        msp.selectingMenShoes();
    }

    @Test(priority = 1)
    public void testcase1() throws InterruptedException {
        pp.enteringPin();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void testcase2() {
        pp.selectingSize();
    }

    @Test(priority = 3)
    public void testcase3() {
      sb = pp.addingTocart();
      String title = driver.getTitle();
        Assert.assertEquals(title, "SHOPPING BAG");
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
