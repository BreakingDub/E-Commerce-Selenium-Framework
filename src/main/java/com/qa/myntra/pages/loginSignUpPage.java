package com.qa.myntra.pages;

import com.qa.myntra.testbase.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginSignUpPage extends testbase {

    @FindBy(xpath = "//input[@type='tel']")
    WebElement numField;

    @FindBy(xpath = "//div[@class='submitBottomOption']")
    WebElement conBtn;

    public loginSignUpPage(){
        PageFactory.initElements(driver, this);
    }

    public void enternNum(){
        numField.sendKeys("8892218929");
        conBtn.click();
    }

}

