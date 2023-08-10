Feature: CreateLead Functionality of Leaftaps Application

Scenario Outline: CreateLead with multiple data
#Given Open Chrome browser
#And Load the url
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed
When Click on crmsfaLink
And Click Leads Button
And Click CreateLead Link
Given Enter the Companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
And Enter the phonenumber as <phonenumber>
When Click on CreateLead Button
Then ViewLeadsPage should be displayed as <companyname>
#And Close the browser

Examples:
|companyname|firstname|lastname|phonenumber|
|TCS|Sarulatha|G|99|
|CTS|Tharun|B|99|
|Wipro|Bacon|G|99|
|Infosys|Siva|G|99|
|Capegemini|Kavitha|R|99|