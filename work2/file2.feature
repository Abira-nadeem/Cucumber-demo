Feature: login test
  Scenario Outline: checking test login data
    Given open browser
    When enter url
    Then enter the username "<Username>" and password "<Password>"
    And verify login is a success


    Examples:

   | Username | Password |
   | Admin    | admin123 |
   | cdmin    | admin223 |
   | bdmin    | jdmin123 |