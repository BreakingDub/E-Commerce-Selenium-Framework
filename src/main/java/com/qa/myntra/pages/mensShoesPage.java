package com.qa.myntra.pages;

import com.qa.myntra.testbase.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mensShoesPage extends testbase {
    @FindBy(xpath = "//img[@title='HIGHLANDER Men White Solid Leather Sneakers']")
    WebElement pumaShoes;

    public mensShoesPage() {
        PageFactory.initElements(driver, this);
    }

    public productPage selectingMenShoes() {
        pumaShoes.click();
        return new productPage();
    }
}

