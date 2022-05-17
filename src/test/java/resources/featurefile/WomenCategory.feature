Feature: Women Category page test

  As user I want to buy some  products on automation practice website page

  Background: user is on women category page


  @smoke @regression
  Scenario: verify User Should Navigate To WomenCategory Page Successfully
    Given  I am in women category page
    When I click on women tab
    Then I can successfully navigate on Women category page
    And  Verify "WOMEN" text is visible


  @sanity @regression
  Scenario Outline: verify User Should Add Product To The Cart Successfully
    Given  I am in women category page
    When I click on women tab
    Then I click on the product "<product>"
    And  I change quantity "<qty>"
    And  I select size "<size>"
    And  I select colour "<colour>"
    And  I click on add to cart button
    And  Verify the message Product successfully added to your shopping cart
    And  I click on xbutton and close the popup

    Examples:
      | product                                | qty | size | colour |
      | Blouse                                 | 2   | M    | White  |
      | Printed Dress                          | 3   | L    | Orange |
      | Printed Chiffon Dress                  | 4   | S    | Green  |
      | Printed Summer Dress with price $28.98 | 2   | M    | Blue   |
