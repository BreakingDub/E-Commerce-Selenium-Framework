package com.qa.myntra.com.qa.myntra;

import com.qa.myntra.pages.homePage;
import com.qa.myntra.pages.mensPage;
import com.qa.myntra.pages.mensShoesPage;
import com.qa.myntra.testbase.testbase;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mensPageTest extends testbase {

    homePage hp;
    mensPage mp;
    mensShoesPage msp;


    @BeforeMethod
    public void setup(){
        initialisation();
        hp = new homePage();
        mp = new mensPage();
        hp.selectingMen();
    }

    @Test
    public void testcase1() throws InterruptedException, FindFailed {
     msp = mp.selectingShoes();
      Thread.sleep(5000);
    }



    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
