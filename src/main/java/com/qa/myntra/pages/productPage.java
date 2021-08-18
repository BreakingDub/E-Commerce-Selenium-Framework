package com.qa.myntra.pages;

import com.qa.myntra.testbase.testbase;
import com.qa.myntra.utilities.util;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class productPage extends testbase {

    @FindBy(xpath = "//input[@placeholder='Enter a PIN code']")
    WebElement enterPin;

    @FindBy(xpath = "//button[normalize-space()='CHECK']")
    WebElement checkbtn;

    @FindBy(xpath = "//button[@class='size-buttons-show-size-chart']")
    WebElement sizeChart;

    @FindBy(id = "47410520")
    WebElement sizeselector;

    @FindBy(xpath = "//strong[normalize-space()='Rs. 1474']")
    WebElement productPrize;

    @FindBy(xpath = "//div[contains(@class,'sizeChartWeb-size-chart-cta')]//div[contains(@class,'pdp-add-to-bag pdp-button pdp-flex pdp-center')][normalize-space()='ADD TO BAG']")
    WebElement addToCart;

    @FindBy(xpath = "//a[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center sizeChartWeb-sc-addToBag']")
    WebElement GotoBag;

    @FindBy(xpath = "//body/div[@id='mountRoot']/div/div[@class='application-base']/div/main[@class='pdp-pdp-container']/div[@class='pdp-details common-clearfix']/div[@class='pdp-description-container']/div[3]/div[1]/div[1]")
    WebElement addtobag;

    @FindBy(xpath = "//h1[normalize-space()='Red Tape']")
    WebElement label;

    public productPage(){
        PageFactory.initElements(driver, this);
    }
    public void enteringPin() throws InterruptedException {
        util.windowhandler();
      enterPin.sendKeys("173211");
      util.actions(checkbtn);
    }
    public void selectingSize() {
        util.windowhandler();
        sizeChart.click();
        util.actions(sizeselector);
    }
    public shoppingBag addingTocart() {
        util.windowhandler();
        selectingSize();
        addToCart.click();
        GotoBag.click();
        return new  shoppingBag();
    }

}
