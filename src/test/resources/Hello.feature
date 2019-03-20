Feature: Greeting the community

  Scenario: Every user should be able to say hello to the community
    Given John is a new community user
    When I say "Hello" to the community
    Then community replies with greetings