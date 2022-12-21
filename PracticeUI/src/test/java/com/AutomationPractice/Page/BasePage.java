package com.AutomationPractice.Page;

import io.cucumber.java.AfterAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BasePage {

    WebDriver driver;

    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("src/test/resources/AdBlock.crx"));
        driver = new ChromeDriver(chromeOptions);
    }


    public void quitDriver(){
        driver.quit();
    }

    public void waitDriver(int time) throws InterruptedException {
        Thread.sleep(time);
    }

}
