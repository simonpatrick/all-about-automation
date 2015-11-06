package io.seleniumsample.actionable;

import io.seleniumsample.WebDriverTrainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by patrick on 15/11/6.
 */
public class WebElementActions extends WebDriverTrainer {

    public void defaultActions(){
        this.driver.findElement(By.cssSelector("#id")).click();
    }

    public void compositeActionBuilder(){
        WebElement source = driver.findElement(By.cssSelector(".source"));
        WebElement target= driver.findElement(By.cssSelector(".target"));
        new Actions(driver).dragAndDrop(source,target).build().perform();
    }


}
