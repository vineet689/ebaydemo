package com.webpages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {

    WebDriver driver;

    // Locators
    By firstItem = By.xpath("(//li[contains(@class, 's-item')])[1]");
    By addToCartButton = By.id("atcRedesignId_btn");

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click on the first item
    public void clickOnFirstItem() {
        WebElement firstItemElement = driver.findElement(firstItem);
        firstItemElement.click();
    }

    // Method to click "Add to Cart"
    public void addToCart() {
        WebElement addToCartButtonElement = driver.findElement(addToCartButton);
        addToCartButtonElement.click();
    }
}
