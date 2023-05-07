Feature: Sauce Demo

  @Login @Positive @ValidUsernameAndPassword
  Scenario: Login using valid username and password
    Given User on login page sauce demo
    When User input valid username on field username "VALID_USERNAME"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page sauce demo see "Products"

  @Login @Negative @InvalidUsernameAndPassword
  Scenario: Login using invalid username and password
    Given User on login page sauce demo
    When User input invalid username on field username "INVALID_USERNAME"
    And User input invalid password on field password "INVALID_PASSWORD"
    And User click login button
    Then User can't login see "Epic sadface: Username and password do not match any user in this service"

  @Login @Negative @InvalidUsernameAndValidPassword
  Scenario: Login using invalid username and valid password
    Given User on login page sauce demo
    When User input invalid username on field username "INVALID_USERNAME"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User can't login see "Epic sadface: Username and password do not match any user in this service"

  @Login @Negative @ValidUsernameAndInvalidPassword
  Scenario: Login using valid username and invalid password
    Given User on login page sauce demo
    When User input valid username on field username "VALID_USERNAME"
    And User input invalid password on field password "INVALID_PASSWORD"
    And User click login button
    Then User can't login see "Epic sadface: Username and password do not match any user in this service"

  @Product @Positive
  Scenario: Choose and see product
    Given User on login page sauce demo
    When User input valid username on field username "VALID_USERNAME"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page sauce demo see "Products"
    And User choose the product then click add to cart button
    And User click icon cart on top right page
    Then User see the product choosen "Sauce Labs Backpack"

  @Payment @Positive
  Scenario: Payment the product
    Given User on login page sauce demo
    When User input valid username on field username "VALID_USERNAME"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page sauce demo see "Products"
    And User choose the product then click add to cart button
    And User click icon cart on top right page
    Then User see the product choosen "Sauce Labs Backpack"
    And User click checkout button
    And User input first name "John"
    And User input last name "Doe"
    And User input postal code "Indonesia"
    And User click continue
    And User click finish
    Then User see order complate notify "Thank you for your order!"

  @Payment @Negative
  Scenario: Not input name and address for payment
    Given User on login page sauce demo
    When User input valid username on field username "VALID_USERNAME"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page sauce demo see "Products"
    And User choose the product then click add to cart button
    And User click icon cart on top right page
    Then User see the product choosen "Sauce Labs Backpack"
    And User click checkout button
    And User click continue
    Then User see order can't proses notify "Error: First Name is required"