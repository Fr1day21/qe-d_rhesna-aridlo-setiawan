Feature: User Fake Store API

  @FakeStoreAPI @User @Positive @GetAllUser
  Scenario: User get all users
    Given User call api "/users" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getAllUser.json"

  @FakeStoreAPI @User @Positive @GetUserById
  Scenario: User get user by id
    Given User call api "/users/1" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getSingleUser.json"

  @FakeStoreAPI @User @Positive @GetUserByLimit
  Scenario: User get user by limit
    Given User call api "/users?limit=5" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getAllUser.json"

  @FakeStoreAPI @User @Positive @GetUserBySort
  Scenario: User get user by sort
    Given User call api "/users?sort=desc" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getAllUser.json"

  @FakeStoreAPI @User @Positive @AddNewUser
  Scenario: User add new user
    Given User call api "/users" with method "POST" with payload below
      | email          | username | password | name                          | address                                                                                                       | phone |
      | John@gmail.com | johnd    | m38rmF$  | {firstname:John, lastname:Doe} | {city:kilcoole, street:7835 new road, number:3, zipcode:12926-3874, geolocation:{lat:-37.3159, long:81.1496}} |  1-570-236-7033     |
    Then User verify status code is 200

  @FakeStoreAPI @User @Positive @EditUser
  Scenario: User edit user
    Given User call api "/users/7" with method "PUT" with payload below
      | email          | username | password | name                          | address                                                                                                       | phone |
      | John@gmail.com | johnd    | m38rmF$  | {firstname:John, lastname:Doe | {city:kilcoole, street:7835 new road, number:3, zipcode:12926-3874, geolocation:{lat:-37.3159, long:81.1496}} |  1-570-236-7033     |
    Then User verify status code is 200
    Then User verify response is match with json schema "editUser.json"

  @FakeStoreAPI @User @Positive @DeleteUser
  Scenario: User delete user
    Given User call api "/users/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "getSingleUser.json"

  @FakeStoreAPI @User @Negative @WrongPath
  Scenario: User get all users using wrong path
    Given User call api "/user" with method "GET"
    Then User verify status code is 404
    Then User verify "user id should be provided"