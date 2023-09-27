Feature: Retail Home Page

Background: 
	Given User is on retail website homepage
  When User clicks on the Sign in link
  And User enter email 'oana_feldrihan@yahoo.com' and password 'Amazon1$'
  And User clicks on the login button
  And User should be logged in to the Account

@regressionTest
Scenario: Verify Shop by Department sidebar
	When User click an All section
	Then below options are present in Shop by Department sidebar
		| Electronics | Computers | Smart Home | Sports | Automative |

@regressionTest
Scenario Outline: Verify department sidebar options
	When User click on All section
	And User on <department>
	Then below options are present in department
	| <optionOne> | <optionTwo> |

	Examples:
		|department                  |optionOne                                    |optionTwo                   |
		|'Electronics'               | TV & Video                                  | Video Games                |
		|'Computers'                 | Accessories                                 | Networking                 |
		|'Smart Home'                | Smart Home Lightning                        | Plugs and Outlets          |
		|'Sports'                    | Athletic Clothing                           | Exercise & Fitness         |
		|'Automotive'                | Automative Parts & Accessories              | MotorCycle & Powersports   |