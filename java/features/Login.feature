Feature: Login functionality of Leaftaps Application

Scenario: Login with Positive Credentials
#Given Open Chrome browser
#And Load the url
Given Enter the username as 'Demosalesmanager'
And Ener the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed

Scenario: Login with Negative Credentials
Given Open Chrome browser
And Load the url
And Enter the username as 'Demo'
And Ener the password as 'crmsfa'
When Click on the Login button
But ErrorMessage should be displayed