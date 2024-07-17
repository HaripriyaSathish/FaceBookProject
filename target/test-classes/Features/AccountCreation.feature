@Regression
Feature: To validate Account Creation Feature in Facebook
Scenario: To create Account with email in Fb application

#Given  To launch Browser
When   To launch url
And    To click create new account button


#One dimensional list data
And    To pass first name in FirstName field

    |Java|Selenium|Cucumber|
    
       
#Two dimensional list data
And    To pass last name in LastName field
            |Java@12|567889|Cucumber@23|
            |987655|sql9776|786467|
            |Framework45|45667|Maven@12|
And    To pass email in email or phone number
Then   To valiadate the credential in the chrome browser


Scenario:  To create Account with ephone number in Fb application
#Given  To launch chrome browser
When   To launch fb url in chrome
And    To click create new acc Button

#One dimensional Map data
And    To pass first name in First text box

     |Firstname      |Ashok|
     |Firstname Two  |Sathish|
     |Firstname Three|Arun|
     
# Two dimensional map data
And    To pass last name in surname text box
     |Lastname One |Lastname Two|Lastname Three|
     |S            |B           |K|
     |L            |E           |X|     
     
 Then  To validate the browser    
