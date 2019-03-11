Feature: Buy Books
  I as user with privileges
  I want to buy books
  to learn how to develop

  Scenario: Buy Books Successful
    Given I am in the buy books section
    When I type the quantity for every book
    Then I validate the grand total