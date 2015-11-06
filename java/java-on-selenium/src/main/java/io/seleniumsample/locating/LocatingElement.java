package io.seleniumsample.locating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by patrick on 15/11/6.
 */
public class LocatingElement {

    public WebElement findById(WebDriver driver, String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement findByCssSelector(WebDriver driver, String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public WebElement findByClass(WebDriver driver, String cssName) {
        return driver.findElement(By.className(cssName));
    }

    public WebElement findByXpath(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findByTagName(WebDriver driver, String tagName) {

        return driver.findElement(By.tagName(tagName));
    }

    public WebElement findByLinkText(WebDriver driver, String identity) {

        return driver.findElement(By.linkText(identity));
    }


    public void findByCssSelectorSamples(WebDriver driver){
        driver.findElement(By.cssSelector("#id1 #id2 li"));
        driver.findElement(By.cssSelector(".id2 .id1 li"));
        driver.findElements(By.cssSelector("#id1>li"));
    }


}
