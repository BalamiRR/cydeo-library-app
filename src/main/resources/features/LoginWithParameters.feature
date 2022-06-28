Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the login page

  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian1@library" and "rs4BNN9G"
    Then dashboard should be displayed
    And there should be 98 'users'

