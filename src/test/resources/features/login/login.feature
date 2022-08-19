Feature: Login into the english page

  Scenario: Successful login
    Given Julian has an active english account
    When he books their class for the next day
    Then he should have schedule his class correctly