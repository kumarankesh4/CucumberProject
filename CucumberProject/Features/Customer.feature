Feature: Customer
Scenario : Add new customer
Given User launch the browser
When User opens the "http://admin-demo.nopcommerce.com/login" URL
And user enter email as "admin@yourstore.com" and password as "admin"
And click on login
Then user can view the dashboard
When user clicks on the customer menu
And click on customer menu item
And click on add new button
Then User can view Add new customer page
When user enters customer info
And click on save button
Then user can see the confirmation message "The new customer has been added successfully."
And close the browser



