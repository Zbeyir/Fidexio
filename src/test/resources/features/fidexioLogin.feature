Feature: Users can log in with valid credentials
  (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

  @wip
  Scenario: Login page verification as PosManager
    Given User is on fidexio home page
    And user should see nnnn
    When user enters "<userName>" to username field
    And user enters "<password>" to password field
    Then user click on Login button
