@tag
Feature: Test Login
Scenario: Test login with valid condition
Given Login application should be present
When Enter Name "Admin"
And Enter Pwd "admin123"
And click login btn
Then I should see the name as "Welcome Paul"
