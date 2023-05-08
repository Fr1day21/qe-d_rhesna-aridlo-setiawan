Feature: Products Fake Store API

  @FakeStoreAPI @Products @Positive @GetAllProduct
  Scenario: User get all Product
    Given User call api "/carts" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getAllProducts.json"

  @FakeStoreAPI @Products @Positive @GetProductById
  Scenario: User get Product by id
    Given User call api "/products/1" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getSingleProduct.json"

  @FakeStoreAPI @Products @Positive @GetProductByLimit
  Scenario: User get Product by limit
    Given User call api "/products?limit=5" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getLimitProduct.json"

  @FakeStoreAPI @Products @Positive @GetProductBySort
  Scenario: User get Product by sort
    Given User call api "/products?sort=desc" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getLimitProduct.json"

  @FakeStoreAPI @Products @Categories @Positive @GetAllCategories
  Scenario: User get all Categories
    Given User call api "/products/categories" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getAllCategories.json"

  @FakeStoreAPI @Products @Categories @Positive @GetSpecificCategory
  Scenario: User get Specific Category
    Given User call api "/products/category/jewelery" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getSpecificCategory.json"

  @FakeStoreAPI @Products @Positive @AddNewProduct
  Scenario: User add new Product
    Given User call api "/products" with method "POST" with payload below
      | title        | price | description     | image                 | category   |
      | test product | 13.5  | lorem ipsum set | https://i.pravatar.cc | electronic |
    Then User verify status code is 200
    Then User verify response is match with json schema "addNewProduct.json"

  @FakeStoreAPI @Products @Positive @EditProduct
  Scenario: User edit Product
    Given User call api "/products/7" with method "PUT" with payload below
      | title        | price | description     | image                 | category   |
      | test product | 13.5  | lorem ipsum set | https://i.pravatar.cc | electronic |
    Then User verify status code is 200
    Then User verify response is match with json schema "editProduct.json"

  @FakeStoreAPI @Products @Positive @DeleteProduct
  Scenario: User delete Product
    Given User call api "/products/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "getSingleProduct.json"

