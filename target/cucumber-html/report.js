$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Product.feature");
formatter.feature({
  "name": "Product should be added to the cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Update the product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ProductFeature"
    }
  ]
});
formatter.step({
  "name": "I am in Product page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Add to cart for one item \"\u003cProduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "navigate to Mycart",
  "keyword": "And "
});
formatter.step({
  "name": "again remove the same item",
  "keyword": "And "
});
formatter.step({
  "name": "I can view the final selected product",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Product"
      ]
    },
    {
      "cells": [
        "Sauce Labs Backpack"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the swaglab application",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductSteps.i_open_the_swaglab_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProductSteps.i_enter_username_something_and_password_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update the product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ProductFeature"
    }
  ]
});
formatter.step({
  "name": "I am in Product page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductSteps.i_am_in_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add to cart for one item \"Sauce Labs Backpack\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProductSteps.i_click_on_add_to_cart_for_one_item_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Mycart",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSteps.navigate_to_mycart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "again remove the same item",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSteps.again_remove_the_same_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can view the final selected product",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSteps.i_can_view_the_final_selected_product()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});