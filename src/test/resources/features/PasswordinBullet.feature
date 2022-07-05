Feature: User should see the password in bullet signs by default

  @wip10 #TC10
  Scenario Outline: Login page verification as PosManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    Then User should see the password in bullet signs by default


    Examples:
      | userName              | password   |
      | posmanager90@info.com | posmanager |
      | posmanager19@info.com | posmanager |
      | posmanager49@info.com | posmanager |
      | posmanager59@info.com | posmanager |


  @wip11 #TC11
  Scenario Outline: Login page verification as SalesManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    Then User should see the password in bullet signs by default
    Examples:
      | userName                | password     |
      | salesmanager90@info.com | salesmanager |
      | salesmanager19@info.com | salesmanager |
      | salesmanager49@info.com | salesmanager |
      | salesmanager61@info.com | salesmanager |
