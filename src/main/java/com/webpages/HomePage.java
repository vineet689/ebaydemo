package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    By searchBox = By.id("gh-ac");
    By searchButton = By.xpath("//*[text()='Search']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultsPage searchForItem(String item) {
        driver.findElement(searchBox).sendKeys(item);
        driver.findElement(searchButton).click();
        return new SearchResultsPage(driver);
    }
}
