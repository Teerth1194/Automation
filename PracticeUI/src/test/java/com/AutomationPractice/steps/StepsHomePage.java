package com.AutomationPractice.steps;

import com.AutomationPractice.Page.HomePage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsHomePage {

    static WebDriver driver;
    static HomePage homepage = new HomePage(driver);
    Scenario scenario;

    @Before
    public void setup(Scenario scenario){
        this.scenario = scenario;
    }
    @AfterAll
    public static void quitDriver(){
        homepage.quitDriver();
    }
    @Given("open the browser and Enter the URL")
    public void openTheBrowserAndEnterTheURL() throws InterruptedException {
        homepage.openURL();
    }

    @Given("Click on Shop Menu")
    public void click_on_shop_menu() throws InterruptedException {
        homepage.waitDriver(3000);
        homepage.clickOnShopMenu();
    }
    @When("Now click on Home menu button")
    public void now_click_on_home_menu_button() throws InterruptedException {
        homepage.waitDriver(2000);
        homepage.clickOnHomeMenu();
    }

    @Then("Test whether the Home page has Three Sliders only")
    public void test_whether_the_home_page_has_three_sliders_only() throws InterruptedException {
        homepage.waitDriver(5000);
//        Assert.assertEquals(3,homepage.verifySliderscount());
    }

//    @AfterAll
//    public static void closeTheDriver(){
//        homepage.quitDriver();
//    }


    @Then("Test whether the Home page has Three Arrivals only")
    public void testWhetherTheHomePageHasThreeArrivalsOnly() {
        homepage.verifyArrivalCount();
    }

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        homepage.verifyUserIsOnHomePage();
    }
    @When("user clicks on arrival image")
    public void user_clicks_on_arrival_image() {
        homepage.clickOnNewArrival();
    }

    @Then("verify user navigates to the book store page")
    public void verify_user_navigates_to_the_book_store_page() {
        homepage.verifyUserOnBookStorePage();
    }
    @Then("verify user able to add book to basket")
    public void verify_user_able_to_add_book_to_basket() {
        homepage.verifyIfBookAddedToBasket();
    }

    @Given("user clicks on product description button")
    public void userClicksOnProductDescriptionButton() {
        homepage.clickOnBookDesc();
    }

    @Then("verify product description is displayed")
    public void verifyProductDescriptionIsDisplayed() {
        homepage.verifyProductDescIdDisplayed();
    }

    @When("user clicks on review button")
    public void userClicksOnReviewButton() {
        homepage.clickOnReviewBtn();
    }

    @Then("verify review of book is displayed")
    public void verifyReviewOfBookIsDisplayed() {
        homepage.verifyReviewOfBook();
    }

    @And("verify if add to basket button is displayed")
    public void verifyIfAddToBasketButtonIsDisplayed() {
        homepage.verifyIfAddtobasketButtonDisplayed();
    }

    @When("user clicks on add to basket button")
    public void userClicksOnAddToBasketButton() {
        homepage.AddToBasketButton();
    }
}
