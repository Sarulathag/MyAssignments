Feature: MergeLead Functionality of Leaftaps Application

Scenario Outline: MergeLead with multiple data
#Given Open Chrome browser
#And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed
When Click on crmsfaLink
And Click Leads Button
And Click MergeLeads Link
And Click From LeadImage Link
Given Enter the FromFirstName as <firstname>
And Click To LeadImage Link
Given Enter the toFirstName as <toname>
And Click the Merge Button and Handle the alert
When Click FindLeads Link
Given Enter the mergeLeadID 
When Click FindLeads Button
Then Verify MergeLead page 

Examples:
|firstname|toname|
|hari|babu|
|babu|hari|