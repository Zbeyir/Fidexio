Feature: As a user, I should be able to log out.


  #TC12
  @wip12
  Scenario Outline: Verify that users can log out and ends up in login page
    Given User is navigate to fidexio home page
    And User enters valid "<userName>" to username field
    And user enters valid "<password>" to password field
    And User click on Login button
    When User click Log Out button
    #Then After logout User should see on the login page "Login | Best solution for startups"

    @posManager
    Examples:
      | userName                | password     |
      | posmanager90@info.com   | posmanager   |
      | salesmanager90@info.com | salesmanager |

