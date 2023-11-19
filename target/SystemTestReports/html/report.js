$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/linkedinlearning/cucumbercourse/features/Menumanagement.feature");
formatter.feature({
  "name": "Menu Management",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Setup a menu item",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber Sandwitch\" and price 20",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Cucumber Sandwitch\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber Salad\" and price 20",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Cucumber Salad\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Setup a menu item",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber Sandwitch\" and price 20",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Cucumber Sandwitch\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add another menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegularTest"
    }
  ]
});
formatter.step({
  "name": "I have a menu item with name \"Veg Sandwitch\" and price 20",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Veg Sandwitch\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Setup a menu item",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber Sandwitch\" and price 20",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Cucumber Sandwitch\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add onemore menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NightlyBuildTest"
    },
    {
      "name": "@RegularTest"
    }
  ]
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber Sandwitch\" and price 20",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see an error message with value \"Duplicate Item\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.i_should_see_an_error_message_with_value(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003cDuplicate Item\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepdefinitions.MenuManagementSteps.i_should_see_an_error_message_with_value(MenuManagementSteps.java:54)\r\n\tat ✽.I should see an error message with value \"Duplicate Item\"(file:src/test/java/linkedinlearning/cucumbercourse/features/Menumanagement.feature:44)\r\n",
  "status": "failed"
});
});