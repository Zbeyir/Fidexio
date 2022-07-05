Feature: User land on the ‘reset password’ page after clicking on the "Reset password" link

  @wip9 #TC09
  Scenario Outline: Login page verification as PosManager
    Given User is on fidexio home page
    When user click reset password button
    Then user should go to the Reset password link
