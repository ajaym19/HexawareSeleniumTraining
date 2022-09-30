Feature: Facebook Login Test
  As a registered user on Facebook portal
  Once I try to login using correct credentials
  I shoould be allowed to login successfully and Home Page should be displayed

  #  Scenario: Validate FB Login Functionality
  #    Given user is on login page
  #   When user enters username
  #  And user enters password
  # And user clicks on Login Button
  #Then user should be logged in successfully
  # Scenario: Validate FB Login Functionality
  #   Given user is on login page
  #  When user enters username as "admin"
  # And user enters password as "admin123"
  #And user clicks on Login Button
  #   Then user should be logged in successfully
  
  Scenario Outline: Validate FB Login Functionality with different set of data
    Given user is on login page
    When user enters username as "<username>" and password as "<password>"
    And user clicks on Login Button
    Then user should be logged in successfully
    Examples:
    	|username|password|
			|Ajay	|Ajay123	|
			|Admin|Admin123	|
			|HR		|HR123		|
			|Finance|Finance123|
