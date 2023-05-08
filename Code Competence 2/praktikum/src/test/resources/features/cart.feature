Feature: Cart Fake Store API

  @FakeStoreAPI @Cart @Positive @GetAllCart
  Scenario: User get all cart
    Given User call api "/carts" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getAllCart.json"

  @FakeStoreAPI @Cart @Positive @GetCartById
  Scenario: User get cart by id
    Given User call api "/carts/5" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getSingleCart.json"

  @FakeStoreAPI @Cart @Positive @GetCartByLimit
  Scenario: User get cart by limit
    Given User call api "/carts?limit=5" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getAllCart.json"

  @FakeStoreAPI @Cart @Positive @GetCartBySort
  Scenario: User get cart by sort
    Given User call api "/carts?sort=desc" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getAllCart.json"

  @FakeStoreAPI @Cart @Positive @GetCartDateRange
  Scenario: User get cart date range
    Given User call api "/carts?startdate=2019-12-10&enddate=2020-10-10" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getCartDateRange.json"

  @FakeStoreAPI @Cart @Positive @GetUserCart
  Scenario: User get all user cart
    Given User call api "/carts?2019-12-10/user/2" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getUserCart.json"

  @FakeStoreAPI @Cart @Positive @AddNewCart
  Scenario: User add new cart
    Given User call api "/carts" with method "POST" with payload below
      | userId | date       | products                                            |
      | 5      | 2020-02-03 | [{productId:5,quantity:1},{productId:1,quantity:5}] |
    Then User verify status code is 200
    Then User verify response is match with json schema "addNewCart.json"

  @FakeStoreAPI @Cart @Positive @EditCart
  Scenario: User edit cart
    Given User call api "/carts/7" with method "PUT" with payload below
      | userId | date       | products                   |
      | 3      | 2019-12-10 | [{productId:1,quantity:3}] |
    Then User verify status code is 200
    Then User verify response is match with json schema "addNewCart.json"

  @FakeStoreAPI @Cart @Positive @DeleteCart
  Scenario: User delete cart
    Given User call api "/carts/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "deleteCart.json"