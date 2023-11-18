#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Menu Management

Background: Setup a menu item
Given I have a menu item with name "Cucumber Sandwitch" and price 20
When I add that menu item
Then Menu Item with name "Cucumber Sandwitch" should be added

@SmokeTest
Scenario: Add a menu item
Given I have a menu item with name "Cucumber Salad" and price 20
When I add that menu item
Then Menu Item with name "Cucumber Salad" should be added

@RegularTest
Scenario: Add another menu item
Given I have a menu item with name "Veg Sandwitch" and price 20
When I add that menu item
Then Menu Item with name "Veg Sandwitch" should be added

@NightlyBuildTest @RegularTest
Scenario: Add onemore menu item
Given I have a menu item with name "Paneer Sandwitch" and price 20
When I add that menu item
Then Menu Item with name "Paneer Sandwitch" should be added
#Then I should see an error message with value "Duplicate Item"
