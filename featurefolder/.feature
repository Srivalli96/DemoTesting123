Feature: Customer registration process

Background:
Given webdriver is initialized and application is opened
 
Scenario: customer signup with the application
Given customer is at the registration page 
When customer provides "Lalitha" and "Password123"
Then customer registration is successful


Scenario: customer signup with the application
Given customer is at the registration page 
When customer provides "Prarabdha11" and "12345"
Then customer registration is successful

Scenario Outline:customer signup with the application
Given customer is at the registration page 
When customer provides "<username>" and "<password>"
Then customer registration is successful

Examples:
|username|password|
|Prarabdha16|Password123456|
|Prarabdha15|password12345|