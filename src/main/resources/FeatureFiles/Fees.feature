Feature: Fees Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Fees
    And User create Fee "<name>" and "<code>" and "<intCode>" and "<priority>"
    Then Success message should be displayed

    Examples:
      | name           | code    | intCode   | priority |
      | KorayTestFee10 | 5345458 | paypal    | 3546857  |
      | KorayTestFee20 | 1568536 | applePay  | 4288632  |
      | KorayTestFee30 | 6574285 | googlePay | 7426354  |


  Scenario Outline: Edit Fees
    And User edit Fee "<existingFeeName>" and change it to "<newFeeName>"
    Then Success message should be displayed

    Examples:
      | existingFeeName      | newFeeName            |
      | KorayTestFee10       | UpdatedKorayTestFee10 |
      | KorayTestFee20       | UpdatedKorayTestFee20 |
      | KorayTestFee30       | UpdatedKorayTestFee30 |


  Scenario Outline: Delete Fees
    And User delete Fee "<FeeName>"
    Then Success message should be displayed

    Examples:
      | FeeName               |
      | UpdatedKorayTestFee10 |
      | UpdatedKorayTestFee20 |
      | UpdatedKorayTestFee30 |