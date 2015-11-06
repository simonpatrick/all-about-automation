package io.seleniumsample.browser;

import io.seleniumsample.WebDriverTrainer;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

/**
 * Created by patrick on 15/11/6.
 */
public class BrowserOperation extends WebDriverTrainer{

    public void maxBrowser(){
        super.driver.manage().window().maximize();
    }

    public Point getPosition(){
        return super.driver.manage().window().getPosition();
    }

    public Dimension getSize(){
        return super.driver.manage().window().getSize();
    }
}
