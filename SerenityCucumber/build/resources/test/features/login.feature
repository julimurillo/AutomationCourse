Feature: Login in training site
I as a user with privileges
want can login in my application
for acces to my main page

Scenario: Login Succesful
Given That I am in the login page
When I type the data
|user|pass|
|test|secret|
Then I enter the application
