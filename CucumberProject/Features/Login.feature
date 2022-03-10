Feature: login
Scenario: Successful login with valid credentials
Given User launch the Chrome browser
When User opens the URL "http://admin-demo.nopcommerce.com/login"
Then Enter username as "admin@yourstore.com" and password as "admin"
And Click on login
Then Page Title should be "Dashboard / nopCommerce administration"
When User click on Log out link 
Then Page title should be "Your store. Login"
And close Browser

Scenario Outline: Successful login with valid credentials
Given User launch the Chrome browser
When User opens the URL "http://admin-demo.nopcommerce.com/login"
Then Enter username as "<email>" and password as "<password>"
And Click on login
Then Page Title should be "Dashboard / nopCommerce administration"
When User click on Log out link 
Then Page title should be "Your store. Login"
And close Browser

Examples:
|email|password|
|admin@yourstore.com|admin|
|admin1@yourstore.com|admin123|