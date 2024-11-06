Feature: Is it Fizz, Buzz or FizzBuzz? Divisibility checker

  Scenario Outline: number is divisible by 3, 5, both or neither

    Given number <number>
    When I check the divisibility
    Then I should be told <message>

    Examples:
      | number | message    |
      | 1      | "None"     |
      | 2      | "None"     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 6      | "Fizz"     |
      | 10     | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 60     | "FizzBuzz" |

