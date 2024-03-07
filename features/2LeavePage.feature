Feature: Leave Page

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
Scenario: Search Leave
		When I fill out the Serach Leave form with valid data
		And Click on Search button
		Then I should see the leave records
@login111
Scenario Outline: Entering valid From date and To date
   
    When I Enter a From date of "<from_date>" and To date of "<to_date>" from the date picker
    Then I should see the enterd date range

    Examples:
      | from_date  | to_date    |
      | 2022-01-01 | 2022-01-31 |
      | 2022-02-01 | 2022-02-28 |
      | 2022-03-01 | 2022-03-31 |
       
@login22
Scenario: Entering invalid From date and To date
    When I Enter invalid input From date of "ifrom_date" and To date of "ito_date" from the date picker
    Then I should see an error message

    
      | ifrom_date | ito_date   |      expectedErrorMessage                    |
      | 2022-25-02 ||Required           |   
      ||2022-25-02|Required|         
      | 2024/10/01 | 2024/29/02 | Should be a valid date in yyyy-dd-mm format  |              
      | 20-01-2024 | 20-02-2024 | Should be a valid date in yyyy-dd-mm format  |                
                                              
@login11
Scenario: Show Leave with Status is not Selected
	
		When I not select any leave status 	
		Then I should get an error  message.     
		
#Scenario: Leave type is not selected
#		When I not select any leave types
#		And click on search button
#		Then i should get leave records.
      
      
      
      
      