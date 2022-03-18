Feature: Payment Gateway functional test


  Scenario: Verify that the user can order a product
    Given The user wants to see payment gateway website
    When The user wants to buy elephant toy
    Then The user wants to enter payment information as
   |CNumber|1212121212121212|
   |EMonth |03              |
   |EYear  |2023            |
   |CVV    |896             |
   Then The user wants to pay now
   And The user wants to verify message as "Payment successfull!"




