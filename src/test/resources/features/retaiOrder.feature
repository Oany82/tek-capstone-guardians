Feature: Retail Order Page

Background: Login and Verify User can place an order with shipping address and payment method on file
  Given User is on retail website homepage
  When User clicks on the Sign in link
  And User enter email 'oana_feldrihan@yahoo.com' and password 'Amazon1$'
  And User clicks on the login button
  And User should be logged in to the Account
  And User change the category to 'Electronics'
  And User search for an item 'Apex Legends'
  And User click on Search icon
  And User click on item 'Apex Legends - 1,000 Apex Coins'
  And User select quantity '5'
  And User click add to Cart button
  Then the cart icon quantity should change to '5'
  And User click on Cart option
  And User click on Proceed to Checkout button
  And User click on Place Your Order
  Then a message should be displayed 'Order Placed, Thanks'

@regressionTest
Scenario: Verify User can add an item to cart and then delete it
	And User change the category to 'Smart Home'
  And User search for an item 'Kasa Outdoor Smart Plug'
  And User click on Search icon
  And User click on item 'Kasa Outdoor Smart Plug'
  And User select quantity '2'
  And User click add to Cart button
  Then the cart icon quantity should change to '2'
  And User click on Cart option
  And User click on Delete button
  Then a message should be displayed 'Your Shopping Cart is Empty'

@regressionTest
Scenario: Verify User can cancel the order
  And User click on Orders section
  And User click on Cancel The Order button
  And User select the cancelation Reason 'Bought wrong item'
  And User click on Cancel Order button
  Then a message should be displayed 'Your Order Has Been Cancelled'

@regressionTest
Scenario: Verify User can return the order
	And User click on Orders section
	And User click on Return Items button
	And User select the Return Reason 'Item damaged'
	And User select the drop off service 'FedEx'  
	And User click on Return Order button
	Then a message should be displayed 'Return was successfull'

@regressionTest
Scenario: Verify User can write a review on order placed
	And User click on Orders section
	And User click on Review button
	And User write review headline 'headline value' and written text 'review text'
	And User click Add your Review button
	Then a message should be displayed 'Your review was added successfully'