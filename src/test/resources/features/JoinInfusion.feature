Feature: Join Infusion
  Scenario:  Validate total results for given Location
    Given I open infusion website
    When I expand the main menu
    And I click Join
    And I click Explore Careers
    And I expand the location combo
    When I select "Krakow"
    Then the list must contain 5 results
    And I select "Krakow"
    When I select "Warsaw"
    Then the list must contain at least 1 results
    And I select "Warsaw"
    And I select "Raleigh"
    When I click the position "Software QA Analyst"
    Then the qualification "Experience creating and implementing testing framework for web applications such as Selenium" should exist
