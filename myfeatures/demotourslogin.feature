Feature: My validations on Mercury Tours
Scenario: Login validations by registered User
Given User has launched the application
Then User enters the valid credentials
And User clicks on submit button
Then User verifies the login status

Scenario: Guest User registration in Mercury Tours
Given User launched the app of mercury tours
Then User clicks on SignUp link
When User enters the valid data in the form
And User clicks on submit button available
Then User verifies the registration status
