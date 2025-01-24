package com.actions;


import static org.junit.Assert.assertEquals;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericconfig.EnvConfig;
import com.webpages.CartPage;
import com.webpages.HomePage;
import com.webpages.SearchResultsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {
	private WebDriver driver;
	private CartPage addToCartPage;
	HomePage homePage;
    SearchResultsPage searchResultsPage;
	CartPage cartPage;
	ApplicationBooks hooks;
	
	public AddToCartSteps(CartPage cartPage) {
		driver = ApplicationBooks.driver;
		this.cartPage= cartPage;
	}
	
	  @Given("Open browser")
	    public void open_browser() {
	        driver.manage().window().maximize();
	    }
	  
	    @Given("Navigate to ebay.com")
	    public void navigate_to_ebay_com() {
	        driver.get(EnvConfig.appUrl);
	    }

	    
	    @When("Search for {string}")
	    public void search_for_book(String searchTerm) {
	        homePage = new HomePage(driver);
	        searchResultsPage = homePage.searchForItem(searchTerm);
	    }
	    
	    @When("Click on the first book in the list")
	    public void click_on_the_first_book() {
	        searchResultsPage.clickOnFirstItem();
	    }
	    

	    @When("In the item listing page, click on 'Add to cart'")
	    public void click_on_add_to_cart() throws InterruptedException {
	    	cartPage.moveToNewTab();
	        cartPage.addItemToCart();
	    }

	    @Then("Verify the cart has been updated and displays the number of items")
	    public void verify_cart_updated() {
	        int cartCount = cartPage.getCartItemCount();
	        assertEquals(1, cartCount);
	    }
	  
}
