Feature: Users can log in with valid credentials
  (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

  @wip1 #TC01
  Scenario Outline: Login page verification as PosManager
    Given User is on fidexio home page
    #And user should see "Lütfen bu alanI doldurun."
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
  Scenario Outline: Login page verification as SalesManager
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