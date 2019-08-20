Feature: My validations on testme for demo 
Scenario Outline: Login validation for multiple users in testme app
Given testme is launched by user
When user clicks on SignIn link in login page
Then user provides the valid username "<uname>"
And user provides the valid password "<pswrd>"
Then user clicks for the submission of the data
And verifies the login status for the account

Examples:
		|uname|pswrd|
	|Lalitha|Password123|
	|Admin|Password456|
