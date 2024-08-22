Feature: Spotify
@spotify
Scenario: User Creation
    Given user navigates to spotify home page
    And user clicks sign up button
    And user click the e mail field then click next button
    And user enter valid e mail adress
    And user enter valid password then click next button
    And user enter valid name
    And user enter valid date of birth
    And user enter gender then click next button
    When user click term and conditions check box then user click sign up button
    Then verify new profile created
