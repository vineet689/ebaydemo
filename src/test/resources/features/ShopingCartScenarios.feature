#Author: vineet689@gmail.com
Feature: Checkout functionality


  @tag1 @checkoute2eflow @sanity
     @addtocartscenario  @task
  Scenario: Verify item can be added to Cart
    Given Open browser
    And Navigate to ebay.com
    When Search for "book"
    And Click on the first book in the list
    And In the item listing page, click on 'Add to cart'
    Then Verify the cart has been updated and displays the number of items
    
  	

    