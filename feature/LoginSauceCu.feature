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
Feature: Login
  I want to use this template for my feature file

  @tag1
  Scenario: User login with Valid login and password credentials for sauce demo website
    Given User enters in to sauce demo website "https://www.saucedemo.com/"
    And User enters "standard_user"  sauce userid
    And User enters "secret_sauce" sauce password
    When User clicks on Login button
    Then User should get the swab labs page title "Swag Labs"
    And User check the menu button option
    And Close Browser

  Scenario Outline: Verify the Login using Data Driven
    Given User enters in to sauce demo website "https://www.saucedemo.com/"
    And User enters "<user ID>"  sauce userid
    And User enters "<pass word>" sauce password
    When User clicks on Login button
    Then User should get the swab labs page title "Swag Labs"
    And User check the menu button option
    And Close Browser
    
    Examples:
      | user ID      | pass word    |
      | error_user   | secret_sauce |
      | secret_sauce | secret_sauce |
      | visual_user | secret_sauce |
      | djcfkaflkd   | secret_sauce |

      
      