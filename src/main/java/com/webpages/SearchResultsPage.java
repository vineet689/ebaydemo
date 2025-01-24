package com.webpages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    WebDriver driver;

    By firstItem = By.cssSelector("ul li:first-child img");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnFirstItem() {
        driver.findElement(firstItem).click();
    }
}
