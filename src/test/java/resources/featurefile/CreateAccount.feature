@ceatepage
Feature: Create account page test

  As user I want to create an account on automation practice website page

  Background: User is on Sign in page


  @regression
  Scenario: verify That User Should Create Account Successfully
    Given  I am on Sign in page
    When I click on Sign in Link
    And   I enter email "jklmfgdgd34544@gmail.com"
    And  I click on create an account button
    And  I enter first name "gfghh"
    And  I enter last name "svvfv"
    And  I enter other password "jklmno123467"
    And  I enter address in address field "21gfghgh "
    And  I enter city in city field "london"
    And  I select State from dropdown "Hawaii"
    And  I enter Zip code "95344"
    And  I select country from dropdown "United States"
    And  I enter Home phone number "6788900"
    And  I enter Future Reference Address "My address"
    And  I click on register button
    Then I should be able to register successfully
    And  Verify "MY ACCOUNT" message is displayed
