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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
  
  Given User is in the para bank login page
    When User enters "aassdd" username
    And User enters "aassdd" password
    And User clicks the login button
    And User should see the dashboard
    Then User click on Accounts Overview under Account Services
    When User click on "12345" Account number
    And User click the month "April" in Activity Period dropdown
    And User click the card type "All" in Type
    Then User Click on GO Button
    And User Click on any transaction
    Then User can view the Transaction details
    
    
    
   

  
