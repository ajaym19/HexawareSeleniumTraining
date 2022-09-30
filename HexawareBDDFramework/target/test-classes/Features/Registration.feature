Feature: Registration on Orange HRM Application
	As an admin
	I should have the access and rights
	To register multiple users with different email id into my application
	
	Scenario: Validate User Registration
	
	Given user is already logged in and is on User Registration Page
	When user enters the firstname as "abc"
	When user enters the password as "pass1"
	When user enters the email as "test@gmail.com"
	When user selects gender as "Male"
	When user selects dept as "HR"
	When user clicks on Add button
	Then a new user should be registered 