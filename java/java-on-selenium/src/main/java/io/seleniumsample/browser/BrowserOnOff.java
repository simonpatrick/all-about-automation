package io.seleniumsample.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by patrick on 15/11/6.
 */
public class BrowserOnOff {

    private WebDriver driver;

    public BrowserOnOff(WebDriver driver) {
        this.driver = driver;
    }

    public void startChrome(){
        driver= new ChromeDriver();
    }

    public void startFirefox(){
        driver= new FirefoxDriver();
    }

    public void close(){
        this.driver.close();
    }

    public void quit(){
        this.driver.quit();
    }

}
