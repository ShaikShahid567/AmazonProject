#Author: shaik shahid

Feature: Adding items to Cart and verifying subtotal

Scenario: Adding items to Cart and verifying subtotal
  Given Open Amazon.com
  When In the Search field type "Gaming Monitor"
  Then Press Enter
  Then Select the 1st item in the List
  Then Add the item to cart by clicking on Add to Cart
  Then Open Cart from the top-left
  Then Verify that the price is identical to the product page
  Then Verify that the sub total is identical to the product page
  
   # Examples:
    #| item       |  
    #| Monitor    |             
    #| Laptop     | 