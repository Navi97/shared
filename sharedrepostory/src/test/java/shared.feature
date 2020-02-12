Feature: firstprgm

Scenario: Add two numbers
 Given I enter 50 in the calculater
 And I press add
 And I have entered 50 in the calculater
 When I press equal symbol
 Then The result should be 100 on the screen