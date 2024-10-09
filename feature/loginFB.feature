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
Feature: Verify the valid login userid and password for para bank
  I want to use this template for my feature file

  @tag1
  Scenario: User login with valid credentials
  
    Given User is in the para bank login page
    When User enters "aassdd" username
    And User enters "aassdd" password
    And User clicks the login button
    And User should see the dashboard
    When User click on Accounts Overview under Account Services
    And User click "12345" account number
    And User click Activity period "month" in dropdown
    And User click Type "all" in dropdown
    Then User click on GO button
    When 	User check the third transactions 
  
    Given User is in the para bank login page
    When User enters "aassdd" username
    And User enters "aassdd" password
    And User clicks the login button
    Then User should see the dashboard

