Feature: Timesheet

Background:
Given User is on LoginPage
When User enter valid username and password
And click on Login button
Then User is redirected to Homepage of OrangeHRM
Given I am on the dashboard page
Given user is on Timesheet page

@login11
Scenario: User wants to see timesheet of the employee

When user enter  employee name
And click on view 
Then user should see the timesheet records of employee
@login11
Scenario: User want to see project reports
Given user is on Reports page
When User enter Project name and project data range 
And click on view button
Then user should see the projects reports

@login11
Scenario: User want to see employee reports
Given user is on the Reports page
When User enter Employee name and Project name and project data range 
And click on  the view button
Then user should see the employee reports
@login11
Scenario: User want to edit customer records from project info
Given user is on project info page
When user click on edit icon in found records
And edit customer name and description
And click on save
Then user should see the successful message



