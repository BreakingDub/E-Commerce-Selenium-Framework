package com.qa.myntra.pages;

import com.qa.myntra.testbase.testbase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class mensPage extends testbase {


    public mensPage(){
        PageFactory.initElements(driver, this);
    }
    public mensShoesPage selectingShoes() throws FindFailed {
        ((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
        Screen s = new Screen();
        Pattern jeans = new Pattern("Puma.PNG");
        s.click();
        return new mensShoesPage();
    }


    }
