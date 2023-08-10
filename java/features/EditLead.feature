Feature: EditLead Functionality of Leaftaps Application

Scenario Outline: EditLead with multiple data
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
And Click the Edit Button
And Update the CompanyName as <companyname>
When Click on Update Button
Then ViewLeadPage should be displayed as <companyname>
#And Close the browser

Examples:
|phonenumber|companyname|
|99|TCS|
|91|CTS|