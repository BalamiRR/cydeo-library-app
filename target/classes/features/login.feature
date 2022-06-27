Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different

  Background: Assuming user on the login page
    Given user is on the login page

  @librarian @employee
  Scenario: Login as a librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard


  @student
  Scenario: Login as at student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

