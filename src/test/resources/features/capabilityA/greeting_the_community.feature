Feature: Greeting the community

  As a new community user
  I want to be able to greet the community
  So that I could start a friendly relationship

  Scenario: Every user should be able to greet the community
    Given 'John' is a new community user
    When he says 'Hey everyone' to the community
    Then community replies with 'Welcome aboard, John'