Feature: DeleteLead Functionality of Leaftaps Application

Scenario Outline: DeleteLead with multiple data
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
And Click the Delete Button
And Click FindLeads Link
Given Enter the LeadID 
When Click FindLeads Button
Then Verify DeleteLead page
#And Close the browser

Examples:
|phoneNumber|
|99|