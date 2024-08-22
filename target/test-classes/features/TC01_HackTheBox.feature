Feature: User Creation
@HackTheBox
Scenario: User Creation
    Given user navigates to hackthebox home page
    When user clicks For Individuals button
    Then user clicks Join for free button
    And user enter valid e mail address then sign up button
    And user enter valid password then click continue button
    And user enter valid username
    And user enter valid fullname
    And user select country
    And user enter valid date of birth
    And user click user agreement and the privacy notice check box
    And user clicks create account button
    And verify pending e mail verification alert
    And user open verification email and verify e mail address link
    And verify user account created
