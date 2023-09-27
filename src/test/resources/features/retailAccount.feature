Feature: Retail Account Page
  ​
Background: 
  Given User is on retail website homepage
  When User clicks on the Sign in link
  And User enter email 'oana_feldrihan@yahoo.com' and password 'Amazon1$'
  And User clicks on the login button
  And User should be logged in to the Account

@updateAccount
Scenario: Verify User can update Profile Information
  When User click on Account option
  And User update Name 'Oana Update' and Phone '1234567890'
  And User click on Update button
  Then a message should be displayed 'Personal Information Updated Successfully'

@regressionTest
Scenario: Verify User can add a payment method
	When User click on Account option
	And User click on Add a payment method link
	And User fill Debit or credit card information
		| cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
		| 1111222233334444 | Guardians  |              11 |           2024 |          561 |
	And User click on Add your card button
	Then a message should be displayed 'Payment Method added sucessfully'

@regressionTest
Scenario: Verify User can edit Debit or Credit card
	When User click on Account option
	And User click on debit or credit card ending in '4444'
  And User click on Edit option of card section
	And user edit information with below data
   |cardNumber					 |nameOnCard|expirationMonth|expirationYear|securityCode|
	 | 3333444455556666    | test    	|             12|          2025|         234|
	And user click on Update Your Card button
	Then a message should be displayed 'Payment Method updated Successfully'

@regressionTest
Scenario: Verify User can remove Debit or Credit card
  When User click on Account option
  And User click on debit or credit card ending in '6666'
  And User click on remove option of card section
  Then payment details should be removed

@regressionTest 
Scenario: Verify User can add an Address
	When User click on Account option
	And User click on Add address option
	And user fill new address form with below information
		| country 				| fullName 	| phoneNumber 		| streetAddress 	| apt | city  	| state 		| zipCode |
		|	United States		| Oana    	| 1234567890      | Ox Road       	| 201 | Fairfax | Virginia	| 20122  	|
	And User click Add Your Address button
	Then a message should be displayed 'Address Added Successfully'
	
@regressionTest
Scenario: Verify User can edit an Address added on account
	When User click on Account option
 	And User click on edit address option
 	And user fill new address form with below information
 		| country       | fullName| phoneNumber   | streetAddress     | apt       | city           | state     | zipCode |
 		| United States | Chris   | 0987654321    | Centreville Road  | 123       | Chantilly      | Virginia  | 20124   |   
  And User click update Your Address button
  Then a message should be displayed 'Address Updated Successfully'
	  
@regressionTest
Scenario: Verify User can remove Address from Account  
   When User click on Account option
   And User click on remove option of Address section
   Then Address details should be removed