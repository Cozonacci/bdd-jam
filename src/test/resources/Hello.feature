Feature: Greeting the community

  Scenario: Every user should be able to greet the community
    Given 'John' is a new community user
    When he says 'Hey everyone' to the community
    Then community replies with 'Welcome aboard, John'