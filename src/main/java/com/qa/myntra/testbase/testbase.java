package com.qa.myntra.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class testbase {

    public static WebDriver driver;
    public static Properties prop;

    public testbase() {
        try {
            prop = new Properties();
            FileInputStream fp = new FileInputStream("C:\\Users\\ptw\\Desktop\\FrameworkMyntra\\src\\main\\java\\com\\qa\\myntra\\config\\config.properties");
            prop.load(fp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        public void initialisation(){
            String browser = prop.getProperty("browser");
            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equals("ff")) {
                System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
                driver = new FirefoxDriver();
            }

            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));

        }
    }
