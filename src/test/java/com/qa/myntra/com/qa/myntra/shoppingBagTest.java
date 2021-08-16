package com.qa.myntra.com.qa.myntra;

import com.qa.myntra.pages.*;
import com.qa.myntra.testbase.testbase;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class shoppingBagTest extends testbase {
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
        sb = new shoppingBag();
        hp.selectingMen();
        mp.selectingShoes();
        msp.selectingMenShoes();
        pp.addingTocart();

    }

    @Test
    public void testcase1(){
        sb.enteringPin("173211");
    }

    @Test
    public void testcase2(){
        sb.selectquantity();
    }

    @Test
    public void testcase3(){
        sb.coupon("WEL100");
    }

    @Test
    public void testcase4(){
        sb.removeItem();
    }
    @Test
    public void testcase5(){
        sb.placingOrder();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
