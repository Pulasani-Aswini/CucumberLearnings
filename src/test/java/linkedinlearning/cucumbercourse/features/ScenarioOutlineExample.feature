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

Feature: Final Bill Calculation

@ScenarioOutlineExample
Scenario Outline: Customer Bill Amount Calculation
Given I have a Customer
And user enters intial bill amount as <IntialBillAmount>
And Sales Tax Rate is <TaxRate> Percent
Then final bill amount calculate is <CalculatedBillAmount>
Examples:
|IntialBillAmount|TaxRate|CalculatedBillAmount|
|100             |10     |110|
|200             |8      |216|
|100             |1.55   |101.55|

 
