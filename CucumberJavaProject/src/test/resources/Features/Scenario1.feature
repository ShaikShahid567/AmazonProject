#Author: shaik shahid

Feature: Adding items to Cart and verifying subtotal
@Scenario1
Scenario: Adding items to Cart and verifying subtotal
  Given Open Amazon.com
  When In the Search field type "Gaming Monitor"
  Then Press Enter
  Then Select the 1st item in the List
  Then Add the item to cart by clicking on Add to Cart
  Then Open Cart from the top-left
  Then Verify that the price is identical to the product page
  Then Verify that the sub total is identical to the product page
  
  
  @Scenario2
 Scenario: Adding items to Cart and verifying subtotal
  Given Open Amazon.com
  When In the Search field type "Gaming Laptop"
  Then Press Enter
  Then Select the 1st item in the List
  Then Add the item to cart by clicking on Add to Cart
  Then Open Cart from the top-left
  Then Verify that the price is identical to the product page
  Then Verify that the sub total is identical to the product page
  
  @Scenario3
 Scenario: Adding items to Cart and verifying subtotal
  Given Launch Amazon.com
  When InSearch field type "HeadPhones"
  Then PressEnter
  Then Select 1st item in the List
  Then Add item to cart by clicking on Add to Cart
  # Then Verify item total price is correct
  And In the Search textbox type "Keyboards"
  Then Press Enterkey
  Then Select the first item in the List
  Then Add the firstitem to cart by clicking on Add to Cart
  Then Open Cart from the top-left
  Then Verify each item total price is correct
  Then Verify that the sub total is calculated correctly