Feature: Sharing stories with community

  Community thrives when everyone shares their experiences

  Scenario Outline: Sharing stories

    Given '<member>' is an existing community member
    When '<member>' shares a new story in '<section>' section saying '<message>'
    Then the story is added to '<section>' section

    Examples:
      | member | section | message                   |
      | John   | food    | I love eating thai        |
      | Adelle | reading | I enjoy reading old books |