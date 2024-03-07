Background:
Given User is on LoginPage
When User enter valid username and password
And click on Login button
Then User is redirected to Homepage of OrangeHRM
Given I am on the dashboard page
Given user is on Timesheet page




Scenario: User want to puch out and puch in.
Given user is on the Attandence page
When user enter time and note
And click on OUT button
And user enter IN time and enter IN note
And Click on IN button