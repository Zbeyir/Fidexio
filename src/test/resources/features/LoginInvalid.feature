Feature: "Wrong login/password" should be displayed for invalid
  (valid username-invalid password and invalid username-valid password) credentials

  @wip3 #TC03
  Scenario Outline: Login page verification as PosManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should see on the login page "Wrong login/password"

    Examples:
      | userName               | password    |
      | posmanager90@info.com  | posmanagere |
      | posmanager169@info.com | Posmanager  |
      | posmanagerE49@info.com | Posmanager  |
      | posmanager259@info.com | posmanager  |


  @wip4 #TC04
  Scenario Outline: Login page verification as SalesManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should see on the login page "Wrong login/password"

    Examples:
      | userName                 | password      |
      | salesmanager290@info.com | salesmanager  |
      | salesmanagerr90@info.com | salesmanager  |
      | salesmanager90@info.com  | Salesmanager  |
      | salesmanager90@info.com  | salesmanagere |