package com.webpages;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.WebElement;

import com.actions.ApplicationBooks;
import com.genericconfig.MainMethods;
import static org.junit.Assert.assertTrue;

public class CartPage {
	
	private WebDriver driver;
	By addToCartButton = By.xpath("//span[text()='Add to cart']");
    By cartIcon = By.cssSelector(".badge");
	public CartPage() {
		driver = ApplicationBooks.driver;
		
	}
	
	 public void addItemToCart() {
	        driver.findElement(addToCartButton).click();
	    }
	 
	    public int getCartItemCount() {
	        MainMethods.waitForElementClickable(driver, cartIcon, 30);
	        driver.findElement(cartIcon).click();
	        MainMethods.waitForElementClickable(driver, cartIcon, 60);
	        String cartItemCount = driver.findElement(By.xpath("//span[@class='badge']")).getText();
	        return Integer.parseInt(cartItemCount);
	    }
	    
	    public void moveToNewTab() throws InterruptedException {
			 Thread.sleep(30000);
			ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		        //switch to active tab
			 	Thread.sleep(3000);
		        driver.switchTo().window(wid.get(1));
		        System.out.println("Page title of active tab: " + driver.getTitle());
		}


	    
	}

