package com.qa.myntra.pages;

import com.qa.myntra.testbase.testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class homePage extends testbase {

    @FindBy(xpath = "//span[normalize-space()='Profile']")
    WebElement profile;

    @FindBy(xpath = "//a[@class='desktop-main' and contains(text(),'Men')]")
    WebElement menIcon;

    @FindBy(className = "desktop-searchBar")
    WebElement searchField;


    public homePage() {
        PageFactory.initElements(driver, this);
    }

    public loginSignUpPage LoginSignup() {
        Actions act = new Actions(driver);
        act.moveToElement(profile).build().perform();
        driver.findElement(By.xpath("//a[normalize-space()='login / Signup']")).click();
        return new loginSignUpPage();
    }

    public void brokenImageLinks() throws InterruptedException, IOException {
        for (int i = 0; i < 6500; i = i + 400) {
            ((JavascriptExecutor) driver).executeScript("scroll(0, " + i + ")");
            Thread.sleep(3000);
        }
        List<WebElement> listy = driver.findElements(By.tagName("img"));
        for (int j = 0; j < listy.size(); j++) {
            String allimages = listy.get(j).getAttribute("src");

            URL url = new URL(allimages);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(allimages + "---------->" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage());
            } else {
                System.err.println(allimages + "---------->" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage());
            }
            httpURLConnection.disconnect();
        }
    }

    public mensPage selectingMen() {
        menIcon.click();
        return new mensPage();

    }

    public menSlidersPage searchingItems() {
        searchField.sendKeys("mens");
            List<WebElement> list = driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']//ul[@class='desktop-group']//li[@class='desktop-suggestion null']"));
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getText().equals("Men Sliders")) {
                    list.get(i).click();
                }
            }
        return new menSlidersPage();
    }


}


