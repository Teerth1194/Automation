Feature: Home page Scenario

  Scenario:Home Page with three Sliders only
    Given open the browser and Enter the URL
    And Click on Shop Menu
    When Now click on Home menu button
    Then Test whether the Home page has Three Sliders only

  Scenario: Home page with three Arrivals only
    Then Test whether the Home page has Three Arrivals only

  Scenario: Images in arrival should navigate
    Given user is on the homepage
    When user clicks on arrival image
    Then verify user navigates to the book store page
    And verify if add to basket button is displayed

  Scenario:Home page - Arrivals-Images-Description
    Given user clicks on product description button
    Then verify product description is displayed

  Scenario: Home Page - Arrivals image review
    When user clicks on review button
    Then verify review of book is displayed

  Scenario: Home Page - Arrival image add to basket
    When user clicks on add to basket button
    Then verify user able to add book to basket

#  Scenario: Home page - Arrivals-Add to Basket with more books
#    When
