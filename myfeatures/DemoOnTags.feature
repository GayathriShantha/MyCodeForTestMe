Feature: Understanding of Tags
@Smoke @Sanity
Scenario: Login validation on Flipkart
Given Application is launched
Then able to login
@Regression
Scenario: User accessto items in the portal
Given user searching the product with code
Then user able to add it to cart
@Smoke
Scenario: user access to remove product from cart
Given user able to see the items count on cart
Then user decides to remove an item
 @Sanity
Scenario: user wanted to track the order
Given user has active order 
Then user verifies the status of the order


