Feature: As a user, I should be able to log in so that I can land on homepage.
  (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

  @wip1 #TC01
  Scenario Outline: Login page verification with VALID data as PosManager
    Given User is on fidexio home page
    And User should see on the login page"Login | Best solution for startups"
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should on the home #Inbox page "Congratulations, your inbox is empty"

    Examples:
      | userName              | password   |
      | posmanager90@info.com | posmanager |
      | posmanager19@info.com | posmanager |
      | posmanager49@info.com | posmanager |
      | posmanager59@info.com | posmanager |


  @wip2 #TC02
  Scenario Outline: Login page verification with VALID data as SalesManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should on the home #Inbox page "Congratulations, your inbox is empty"

    Examples:
      | userName                | password     |
      | salesmanager90@info.com | salesmanager |
      | salesmanager19@info.com | salesmanager |
      | salesmanager49@info.com | salesmanager |
      | salesmanager61@info.com | salesmanager |

  @wip3 #TC03
  Scenario Outline: Login page verification with INVALID data as PosManager
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
  Scenario Outline: Login page verification with INVALID data as SalesManager
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


  @wip5 #TC05
  Scenario Outline: Login page verification with WITHOUT PASSWORD as PosManager
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
  Scenario Outline: Login page verification with WITHOUT USER NAME as PosManager
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
  Scenario Outline: Login page verification with WITHOUT PASSWORD as SalesManager
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
  Scenario Outline: Login page verification with WITHOUT USER NAME as SalesManager
    Given User is on fidexio home page
    And user enters "<userName>" to username field
    When user enters "<password>" to password field
    And user click on Login button
    Then user should see on the login page "Lütfen bu alanı doldurun." if the username is empty

    Examples:
      | userName | password     |
      |          | salesManager |
      |          | salesManager |


  @wip9 #TC09
  Scenario: User land on the ‘reset password’ page after clicking on the "Reset password" link
    Given User is on fidexio home page
    When user click reset password button
    Then user should go to the Reset password link


  @wip10 #TC10
  Scenario Outline: Login page verification as PosManager,
  User should see the password in bullet signs by default
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




