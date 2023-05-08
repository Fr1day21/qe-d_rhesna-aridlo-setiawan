Feature: Login Fake Store API

  @FakeStoreAPI @Login @Positive
  Scenario: User login with correct username and password
    Given User call api "/auth/login" with method "POST" with payload below
      | username | password |
      | mor_2314 | 83r5^_   |
    Then User verify status code is 200
    Then User verify "token"

  @FakeStoreAPI @Login @Negative
  Scenario: User login with incorrect username and password
    Given User call api "/auth/login" with method "POST" with payload below
      | username | password |
      | mor_2314 | 83r3242345^_   |
    Then User verify status code is 401
    Then User verify "username or password is incorrect"