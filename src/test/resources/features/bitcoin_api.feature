#Author: vineet689@gmail.com
Feature: Bitcoin get method functionality
   
     @apiscenario  @task
  Scenario: Verify Bitcoin Price Information for USD, GBP, and EUR
    Given I send a GET request to "https://api.coindesk.com/v1/bpi/currentprice.json"
    Then The response should contain 3 BPIs: USD, GBP, EUR
    And The GBP description should be "British Pound Sterling"