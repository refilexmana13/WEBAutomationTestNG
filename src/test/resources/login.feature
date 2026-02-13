Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid username "standard_user"
    And I enter password "secret_sauce"
    And I click the login button
    Then I should be redirected to the dashboard

  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter valid username "standard_user"
    And I enter password "invalid"
    And I click the login button
    Then I should see an alert message "Epic sadface: Username and password do not match any user in this service"
