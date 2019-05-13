Feature: My feature file

Scenario: Verify that GET request return status code 200
Given I have server by url "http://www.google.com"
When I send GET request on endpoint "/search" and parameters "q=Main%20Academy"
Then I get response status code 200


  Scenario: Verify that GET request body not null
    Given I have server by url "https://reqres.in"
    When I send GET request on endpoint "/api/users" and parameters "page=2"
    Then I get response status bode not null


  Scenario: Verify that GET request return status code 201
    Given I have server by url "https://reqres.in"
    When I send GET request on endpoint "/api/users" and requestBody "{\"name\": \"morpheus\",\"job\": \"leader\"}"
    Then I get response status code 201

  Scenario: Verify that GET request return status code 201
    Given I have server by url "https://reqres.in"
    When I send GET request on endpoint "/api/users" and parameters "page=2"
    Then I get fom body and JSONBPath "$.data.[0].first_name" list of names
    |EVA|
