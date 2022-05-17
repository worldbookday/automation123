Feature: signPage test
  As a user I want to sign in on automation practice website page

  Background: User is in home page

   @regression
  Scenario: User Should Navigate To SignIn Page SuccessFully
    Given I am in home page
    When  I click on Sign in Link
    Then  I should be navigated to signIn page successfully
    And  Verify that "AUTHENTICATION" message is displayed

  @smoke @regression
  Scenario Outline: verify The ErrorMessage With InValid Credentials
    Given I am in home page
    When  I click on Sign in Link
    And   I enter username "<username>"
    And   I enter password "<password>"
    And   I click on sign in Button
    Then   Check error message is displayed "<errormessage>"
    Examples:

      | username       | password | errormessage               |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

  @regression
  Scenario: verify that user should Login successFully With valid credentials
    Given I am in home page
    When  I click on Sign in Link
    And   I enter username "mnbvf1236789@gmail.com"
    And   I enter password "asd12346"
    And   I click on sign in Button
    Then  Verify that sing out link should be displayed

  @smoke @regression
  Scenario: Verify that user should logout successFully
    Given I am in home page
    When  I click on Sign in Link
    And    I enter username "mnbvf1236789@gmail.com"
    And   I enter password "asd12346"
    And    I click on sign in Button
    And   I click on sign Out link
    Then  I am able to log out successfully
    And   Verify that sing in link should be displayed

