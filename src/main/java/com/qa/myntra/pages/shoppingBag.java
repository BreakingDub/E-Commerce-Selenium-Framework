package com.qa.myntra.pages;

import com.qa.myntra.testbase.testbase;
import com.qa.myntra.utilities.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingBag extends testbase {

    @FindBy(xpath = "//div[@class='addressStrip-base-changeBtn addressStrip-base-changeBtnDesktop']")
    WebElement enterPinCode;

    @FindBy(xpath = "//div[@class='itemComponents-base-quantity']//*[local-name()='svg']")
    WebElement quantity;

    @FindBy(xpath = "//div[contains(text(),'3')]")
    WebElement selectquantity;

    @FindBy(xpath = "//div[contains(@class,'button-base-button dialogs-base-doneButton')]")
    WebElement selectdone;

    @FindBy(xpath = "//button[normalize-space()='Remove']")
    WebElement remove;

    @FindBy(xpath = "//button[normalize-space()='APPLY']")
    WebElement couponApply;

    @FindBy(xpath = "//input[@id='coupon-input-field']")
    WebElement couponCodeField;

    @FindBy(xpath = "//div[@class='couponsForm-base-applyButton couponsForm-base-enabled']")
    WebElement checkCoupon;

    @FindBy(xpath = "//button[@id='applyCoupon']")
    WebElement applyBtn;

    @FindBy(xpath = "//div[contains(text(),'Place Order')]")
    WebElement placeOrder;

    public shoppingBag(){
        PageFactory.initElements(driver, this);
    }

    public void enteringPin(CharSequence pin){
        enterPinCode.click();
        driver.findElement(By.xpath("//input[@id='pincode']")).sendKeys(pin);
        driver.findElement(By.xpath("//div[@class='checkDelivery-base-checkBtn checkDelivery-base-valid']")).click();
    }
    public void selectquantity(){
        quantity.click();
        selectquantity.click();
        selectdone.click();
    }
    public void coupon(String coupon){
        couponApply.click();
        couponCodeField.sendKeys(coupon);
        checkCoupon.click();
        applyBtn.click();

    }
    public void removeItem(){
        remove.click();
        driver.findElement(By.xpath("//button[contains(@class,'inlinebuttonV2-base-actionButton itemComponents-base-move itemComponents-base-inlineButton')]")).click();
    }
    public void placingOrder(){
        placeOrder.click();
    }
}
