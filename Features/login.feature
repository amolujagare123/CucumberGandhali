Feature: login tests scenaros

  #@Login
  #Scenario: to test the functionality of login button for valid input
  #  Given I am on login page
  #  When I enter correct username and password
  #  And I click on login button
  #  Then I should land up to home page

  Background:
    Given I opened browser
    And I maximized it


  @billing
  Scenario: to test the functionality of Billing login button for valid input
    Given I am on billing login page
    When I enter correct "amol" and "amolpass" on billing login page
    And I click on login button on billing login page
    Then I should land up to billing home page


  @billing
  Scenario: to test the functionality of Billing login button for valid input
    Given I am on billing login page
    When I enter correct "gandhali" and "gandhalipass" on billing login page
    And I click on login button on billing login page
    Then I should land up to billing home page

    @userdetails
    Scenario: check user details form
      Given I am on user details page
      When I enter below details
      | amol | amol@gmail.com | 898989 | pune |
      Then data is entered successfully


      @newsletter
    Scenario Outline: Newsletter subscription test
      Given I am on newsletter page
      When i enter subscriber with <name> , <email> , <phone>
      Then the subscriber is subscribed to the newsletter

      Examples:
      |name       | email              | phone   |
      |amol       | amol@gmail.com     | 112345  |
      |gandhali   | gandhali@gmail.com | 212345  |
      |rajesh     | rajesh@gmail.com   | 312345  |
      |vaishali   | vaishali@gmail.com | 412345  |
