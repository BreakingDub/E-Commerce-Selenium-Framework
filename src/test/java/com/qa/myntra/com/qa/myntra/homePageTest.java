package com.qa.myntra.com.qa.myntra;

import com.qa.myntra.pages.homePage;
import com.qa.myntra.pages.menSlidersPage;
import com.qa.myntra.pages.mensPage;
import com.qa.myntra.testbase.testbase;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class homePageTest extends testbase {

    menSlidersPage msp;
    homePage hp;
    mensPage mp;

    @BeforeMethod
    public void setup(){
        initialisation();
        hp = new homePage();
    }

    @Test
    public void testcase1() throws IOException, InterruptedException {
        hp.brokenImageLinks();
    }

    @Test
    public void testcase2(){
       mp = hp.selectingMen();
       String titleName = driver.getTitle();
       Assert.assertEquals(titleName, "Men Shopping Online - Shop for Mens Clothing & Accessories in India | Myntra");
    }
    @Test(expectedExceptions = StaleElementReferenceException.class)
    public void testcase3() {
        msp = hp.searchingItems();
        String titleName = driver.getTitle();
        Assert.assertEquals(titleName, "Men Sliders - Buy Men Sliders online in India");
    }

    @AfterMethod
    public void tearDownb(){
        driver.quit();
    }

}
