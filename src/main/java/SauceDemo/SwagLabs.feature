Feature: SwagLabs
  @Regression @Smoke
  Scenario: User able to open url
    Given user should open url

  @Smoke @Regression
  Scenario: User login
    When user able to login

  @Sanity
  Scenario: user buy product
    Given user choose a product
    When user give the details
    Then User should overview order
  @Regression
  Scenario: user logout
    When User back to homepage
    Then User can logout
  @Smoke
  Scenario: close browser
    Given User able to close the browser
