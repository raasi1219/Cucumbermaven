Feature: To validate Login Application
1) Valid case
2) Invalid case

Background:
Given We should be in the Home page

@validcase
#Scenario: To Test Login with valid scenario

#When Enter the valid name "Admin"
#And Enter valid password "admin123"
#And Click on Login validButton 
#Then I should see username as "Welcome Paul"
#Scenario outline – to test multiple scenario / multiple data for one scenario outline

Scenario Outline: To Test Login with Different Data
When Enter the valid name "<user>"
And Enter valid password "<pwd>"
And Click on Login validButton 
Then I should see username as "<LoginName>"

Examples:
|user |pwd     |LoginName   |
|Admin|admin123|Welcome Paul|
|Admin|admin123|Welcome Paul|

@Invalidcase
Scenario: To Test Login with Invalid Scenario

When Enter the invalid name "raasi"
And Enter invalid Password "raasi"
And Click on Login invalidButton
Then I should see the invalid credential as "Invalid credentials"

