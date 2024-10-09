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
@tag
Feature: BillPay option
  I want to use this template for my feature file

  @tag1
  Scenario: Trying to Pay Bill for new Payee
    Given User is in the para bank login page
    When User enters "aassdd" username
    And User enters "aassdd" password
    And User clicks the login button
    And User should see the dashboard
    When User click on Bill Pay under Account Services
    And User can view the page to enter payee details
    Then User enter Bill payment Service details
    And User Clicks Send Payment button
    Then User can view confirmation message Bill Payment was successfull
 ##    Examples: 
    ##   | name  | value | status  |
     ##  | name1 |     5 | success |
      ## | name2 |     7 | Fail    |
##
