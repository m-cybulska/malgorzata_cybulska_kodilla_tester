Feature: Cash Operations

  Scenario Outline: Operations in wallet

    Given I have deposited $<deposit> in my wallet
    When I request $<money>
    Then $<withdrawal> should be dispensed

    Examples:
      | deposit | money | withdrawal |
      | 300     | 310   | 0 |
      | 600     | 600   | 600 |
      | 400     | 390   | 390 |
      | 450     | 500   | 0   |


