// we will get manualregresison testcases from manual team

feature
Scenario: Validate the login test cases with Valid username and password

Given user should be login page
When user enters Valid username "Tester1@gmail.com"
And User enters valid password "P23323"
Then clicks on submit button
  