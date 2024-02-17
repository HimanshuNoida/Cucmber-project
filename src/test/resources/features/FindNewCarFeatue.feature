Feature: searching New Cars
  In order to search new cars
  As a User
  I have to navigate to carwal.com

  Scenario Outline: Finding new cars
    Given user navigates to carwale website
    When user moushover to newcars
    Then user clicks on FindnewCars
    And user clicks  on "<CarBrand>" car
    And user validates carTiltle as "<carTitle>" Cars

    Examples: 
      | CarBrand | carTitle    |
      | Toyota   | Toyota Carss |
      | Kia      | Kia Cars    |
      | Tata    | Tata Cars  |
      | BMW      | BMW Cars    |
