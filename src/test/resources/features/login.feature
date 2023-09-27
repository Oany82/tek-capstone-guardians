Feature: Sign in  

Background: 
	Given User is on retail website homepage
	When User clicks on the Sign in link

@regressionTest
Scenario: Verify user can sign in into Retail Application
	And User enter email 'oana_feldrihan@yahoo.com' and password 'Amazon1$'
	And User clicks on the login button
	Then User should be logged in to the Account

@addAccount
Scenario: Verify user can create an account into retail website
	And User clicks on the create new account link
	And User fills the signUp information with below data
	  | name 			 | email                    | password | confirmPassword |
	  | Test Three | test5@test.com 					| Amazon1$ | Amazon1$        |
	And User clicks on the signUp button
	Then User should be logged into the account page