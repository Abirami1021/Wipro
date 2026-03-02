Feature: Login using List

Scenario: Login with multiple users
Given I open the browser
When I open the SauceDemo website
And I enter usernames and passwords using list
  | standard_user | secret_sauce |
  | locked_out_user | secret_sauce |
Then I close the browser