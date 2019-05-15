Feature: My feature file

  Scenario: Verify that GET request return status code 200
    Given I have server by url "http://www.google.com"
    When I send GET request on endpoint "/search" and parameters "q=Main%20Academy"
    Then I get response status code 200


  Scenario: Verify that GET request body not null
    Given I have server by url "https://reqres.in"
    When I send GET request on endpoint "/api/users" and parameters "page=2"
    Then I get response status body not null


  Scenario: Verify that GET request return listUsers
    Given I have server by url "https://reqres.in"
    When I send GET request on endpoint "/api/users" and requestBody "{\"name\": \"morpheus\",\"job\": \"leader\"}"
    Then I get response status code 200

  Scenario: Verify that GET request return status code 201
    Given I have server by url "https://reqres.in"
    When I send GET request on endpoint "/api/users" and parameters "page=2"
    Then I get from body and JSONBPath "$.data..first_name" list of names
      | Eve     |
      | Charles |
      | Tracey  |
