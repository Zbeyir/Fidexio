Feature: "Please fill out this field." message should be displayed
  if the password or username is empty

  @wip5 #TC05
  Scenario Outline: Login page verification as PosManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should see on the login page "Lütfen bu alanı doldurun." if the password is empty

    Examples:
      | userName              | password |
      | posmanager90@info.com |          |
      | posmanager49@info.com |          |

  @wip6 #TC06
  Scenario Outline: Login page verification as PosManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should see on the login page "Lütfen bu alanı doldurun." if the username is empty

    Examples:
      | userName | password   |
      |          | posmanager |
      |          | posmanager |

  @wip7 #TC07
  Scenario Outline: Login page verification as SalesManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should see on the login page "Lütfen bu alanı doldurun." if the password is empty

    Examples:
      | userName                | password |
      | salesmanager90@info.com |          |
      | salesmanager49@info.com |          |

  @wip8 #TC08
  Scenario Outline: Login page verification as SalesManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should see on the login page "Lütfen bu alanı doldurun." if the username is empty

    Examples:
      | userName | password     |
      |          | salesManager |
      |          | salesManager |
