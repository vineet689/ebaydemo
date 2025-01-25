$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ShopingCartScenarios.feature");
formatter.feature({
  "name": "Checkout functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify item can be added to Cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@checkoute2eflow"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@addtocartscenario"
    },
    {
      "name": "@task"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCartSteps.open_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to ebay.com",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.navigate_to_ebay_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"book\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.search_for_book(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the first book in the list",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.click_on_the_first_book()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In the item listing page, click on \u0027Add to cart\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the cart has been updated and displays the number of items",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.verify_cart_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});