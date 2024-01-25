Feature: Title of your feature
  I want to use this template for my feature file
 
Background:
	Given OrangeHRM website is launched in browser

  @loginErrorChecking
  Scenario Outline: login to application
    Given user enters the username <username>
    And user enters the wrong password <wrongpassword>
    Then user clicks submit button
    Given user verifies the error message.
    Examples:
    |username|wrongpassword|
    |Admin	 |admin1       |
    
    @loginChecking
  Scenario Outline: login and check the dashboard
    Given user enters the username <username>
    And user enters the correct password <password>
    Then user clicks submit button
    Given user verifies whether dashboard page opened.
    Examples:
    |username|password|
    |Admin	 |admin123|