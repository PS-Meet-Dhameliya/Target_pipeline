Feature: Leave List

Background:
Given User is on LoginPage
When User enter valid username and password
And click on Login button
Then User is redirected to Homepage of OrangeHRM
Given I am on the dashboard page
When I click on the Leave tab
And I click on the My Leave option
Then I should see the My Leave List page
@login11
Scenario: Search leave list records
    When I fill out the Leave list form with valid data
		And Click on Search button
		Then I should see the leave list records
		
@login11
Scenario: Search leave list records with out enter name
		When I fill out the Leave list form and not entering EmployeeName
		And I hit  on Search button
		Then I should see the leave list records with out enter name