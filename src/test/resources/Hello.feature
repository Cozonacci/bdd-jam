Feature: Say Hello

  Scenario: Every user should be able to say hello to the community
    Given my name is John
    And I am a new community user
    When I say "Hello" to the community
    Then community replies with greetings