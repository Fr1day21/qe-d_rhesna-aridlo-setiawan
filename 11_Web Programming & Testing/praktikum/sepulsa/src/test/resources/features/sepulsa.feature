Feature: Sepulsa

  @Login @Positive @ValidEmailAndPassword
  Scenario: Login using valid email and password
    Given User on login page
    When User input valid email on field email "VALID_EMAIL"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page

  @Login @Negative @InvalidEmailAndPassword
  Scenario: Login using invalid email and password
    Given User input invalid email on field email "INVALID_EMAIL"
    And User input invalid password on field password "INVALID_PASSWORD"
    And User click login button
    Then User cant login

  @Login @Negative @ValidEmailAndInvalidPassword
  Scenario: Login using valid email and invalid password
    When User input valid email on field email "VALID_EMAIL"
    And User input invalid password on field password "INVALID_PASSWORD"
    And User click login button
    Then User cant login

  @Login @Negative @InValidEmailAndValidPassword
  Scenario: Login using invalid email and valid password
    When User input valid email on field email "INVALID_EMAIL"
    And User input invalid password on field password "VALID_PASSWORD"
    And User click login button
    Then User cant login

  @Product @Positive
  Scenario: Choose product pulsa
    Given User on login page
    When User input valid email on field email "VALID_EMAIL"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page
    And User click pulsa button
    And User on pulsa page see "Isi Pulsa"
    And User input phone number "085156636940"
    And User choose option pulsa
    Then User on payment page see "Pembayaran"

  @Product @Negative
  Scenario: Input number more then 13 digit
    Given User on login page
    When User input valid email on field email "VALID_EMAIL"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page
    And User click pulsa button
    And User on pulsa page see "Isi Pulsa"
    And User input phone number "08515663694089"
    Then User see notify "Nomor handphonenya kelebihan. Maksimal 13 digit ya."

  @Payment @Positive
  Scenario: Choose method payment
    Given User on login page
    When User input valid email on field email "VALID_EMAIL"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page
    And User click pulsa button
    And User on pulsa page see "Isi Pulsa"
    And User input phone number "085156636940"
    And User choose option pulsa
    And User on payment page see "Pembayaran"
    Then User choose payment method

  @Payment @Negative
  Scenario: Not choose method payment
    Given User on login page
    When User input valid email on field email "VALID_EMAIL"
    And User input valid password on field password "VALID_PASSWORD"
    And User click login button
    Then User on home page
    And User click pulsa button
    And User on pulsa page see "Isi Pulsa"
    And User input phone number "085156636940"
    And User choose option pulsa
    And User on payment page see "Pembayaran"
    And User click payment button
    Then User see notify have to choose payment method "Kamu belum memilih metode pembayaran"