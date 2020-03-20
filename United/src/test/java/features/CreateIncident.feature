Feature: Create a new Incident

Scenario Outline: Create a new Incident with Mandatory Fields
Given Enter username as <userName>
And Enter password as <password>
When Click the Login 

Examples:
|userName|password|
|DemoSalesManager|crmsfa|

