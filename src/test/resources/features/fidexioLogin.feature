Feature: Users can log in with valid credentials
  (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

  @wip
  Scenario Outline: Login page verification as PosManager
    Given User is on fidexio home page
    And user should see "Lütfen bu alanI doldurun."
    When user enters "<userName>" to username field
    And user enters "<password>" to password field
    And user click on Login button

    Examples:
      | userName              | password   |
      | posmanager90@info.com | posmanager |