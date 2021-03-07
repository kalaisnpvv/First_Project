Feature: Application Login

Scenario: Login Home page
Given User is on Netbanking login page
When User logged in with valid username and password
Then Home page for User was populated
And Bank Account information was displayed
