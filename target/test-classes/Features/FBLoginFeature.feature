Feature: To validate the Login Functionality in the Facebook application
@Smoke @Sanity
Scenario: To validate Login Functionality by passing invalid values

#Given  To launch the browser and max window
When   To launch the Facebook application
And    To pass the invalid email in email field
And    To pass the invalid password in password field
And    To click a login button
Then   To check whether it should navigate to the error page or homepage



@Sanity @Regression
Scenario Outline:To validate positive and negative combination testcases

#Given To launch browser and maximize
When  To launch url of the application
When  To pass positive and negative "<emaildata>" data to email field
When  To pass positive and negative "<passworddata>" to password field
And   To click login button
Then  To close the browser

Examples:
 
          |emaildata|passworddata|
          |java|java123|
         

