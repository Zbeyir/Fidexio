Feature: As a user, I should be able to log out.


  #TC12
  @wip12
  Scenario Outline: Verify that users can log out and ends up in login page
    Given User is navigate to fidexio home page
    And User enters valid "<userName>" to username field
    And user enters valid "<password>" to password field
    And User click on Login button
    When User click Log Out button
    Then After logout User should see on the login page "Login | Best solution for startups"


    Examples:
      | userName                | password     |
      | posmanager90@info.com   | posmanager   |
      | salesmanager90@info.com | salesmanager |

    #TC13
  @wip13
  Scenario Outline: The user can not go to the home page again by clicking the step
  back button after successfully logged out.
    Given User is navigate to fidexio home page
    And User enters valid "<userName>" to username field
    And user enters valid "<password>" to password field
    And User click on Login button
    When User click Log Out button
    Then After logout User should see on the login page "Login | Best solution for startups"
    And User clicks the back button
    Then User should see on the page "Your Odoo session expired. Please refresh the current web page."

    Examples:
      | userName                | password     |
      | posmanager90@info.com   | posmanager   |
      | salesmanager90@info.com | salesmanager |

