Feature: HTB Sign-In and Verification
@SignIn
  Scenario: User signs in to HTB and verifies account
    Given user navigates to the HTB home page
    When user clicks on the login button
    Then user clicks on the HTB Labs
    And user enters a valid email address,username,password
    And user clicks the sign-in button
    And verify the user is signed in successfully