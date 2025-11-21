
Feature: FB login  feature
We need validate the login test cases

@reg
Scenario: Validate the login test cases with Valid username and password

Given user should be login page
When user enters Valid username "Tester1@gmail.com"
And User enters valid password "P23323"
Then clicks on submit button
@smoke
Scenario Outline: Validate the login functionality with valid username and password
    Given user should be login page
    When  user enters valid Mutipleusernames"<username>"
    And user enters valid Mutiplepasswords"<password>"
    Then clicks on submit button
  
    Examples: 
      | username  | password |
      | Manday@gmail.com | P23543|
      | Mahesh@gmai.com|P6Test@233|


 