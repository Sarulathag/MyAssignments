Feature: DuplicateLead Functionality of Leaftaps Application

Scenario Outline: DuplicateLead with multiple data
#Given Open Chrome browser
#And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed
When Click on crmsfaLink
And Click Leads Button
And Click FindLeads Link
And Click Phone Link
Given Enter the phonenumbers as <phonenumber>
When Click FindLeads Button
And Click the FirstRecord
And Click the DuplicateLead Button
When Click on CreateLead Button
Then ViewDuplicateLeadPage should be displayed 
#And Close the browser

Examples:
|phonenumber|
|99|
|91|