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
Feature: Create a new Techlist by using Practice Form
  
  @tag1
  Scenario: Verify and update the details in the Techlist practice form
    Given User get in to Techlist practice form "https://www.techlistic.com/p/selenium-practice-form.html" 
    And User Enter First name  as "multi" and Last name as "universe"
    And Select Gender "Male" and Year of experience 5
    When User enter the date as "05-08-2024"
    And User select profession "Manual Tester" and Familiar Automation tool "QTP"
    And User select continent and Selenium Commands 
    Then User Click on submit button
    And Close the webpage

  