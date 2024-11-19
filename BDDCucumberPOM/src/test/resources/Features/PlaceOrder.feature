Feature: Place order

Background: User Login
Given user is on login page
When user enters "Standard_user" and "secret_sauce"
Then User should be on homepage


Scenario: Additem to cart
Given user is on homepage
When user add item to cart
Then item mustbe added



Scenario: Checkout order
Given user is on cart page
When userdo checkout
Then User should naviagate to checkout page