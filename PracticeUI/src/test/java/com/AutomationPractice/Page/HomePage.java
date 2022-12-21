package com.AutomationPractice.Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class HomePage extends BasePage{

    String url = "http://practice.automationtesting.in";
    WebDriverWait wait;

    By shop_menu_link = By.xpath("//*[@id=\"menu-item-40\"]/a");

    By home_menu_link = By.xpath("(//a[@href=\"https://practice.automationtesting.in\"])[2]");

    By sliders_list = By.xpath("//div[@data-slide-duration='0']");

    By new_arrivals = By.xpath("//a[@class='woocommerce-LoopProduct-link']");
    By New_arrival = By.xpath("(//a[@class='woocommerce-LoopProduct-link'])[1]");
    By product_desc_title = By.xpath("//div[@id='tab-description']/h2");
    By product_desc = By.xpath("//div[@id='tab-description']/p");
    By btn_add_to_basket = By.xpath("//button[@type='submit']");

    By msg_basket_success = By.xpath("//*[@id=\"content\"]/nav");
    By btn_book_desc = By.xpath("//*[@class='description_tab active']");
    By btn_review_book = By.xpath("//a[@href=\"#tab-reviews\"]");
    By desc_review_book = By.xpath("//*[@id=\"comments\"]/h2");
    By link_basket_item = By.xpath("//a[@href='https://practice.automationtesting.in/basket/']");
    By btn_update_basket = By.xpath("//input[@name='update_cart']");
    By btn_apply_coupon = By.xpath("//input[@name='apply_coupon']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openURL() throws InterruptedException {
        setupDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Set<String> windowhandles = driver.getWindowHandles();
        Object mainWIndow = Arrays.stream(windowhandles.toArray()).toList().get(0);
        driver.switchTo().window(mainWIndow.toString());

    }

    public void clickOnShopMenu() throws InterruptedException {

        driver.findElement(shop_menu_link).click();
    }

    public void clickOnHomeMenu(){
        driver.findElement(home_menu_link).click();
    }

    public int verifySliderscount(){
        return driver.findElements(sliders_list).size();

    }

    public void verifyArrivalCount(){
        List<WebElement> arrivalElements =  driver.findElements(new_arrivals);
        Assert.assertEquals(3, arrivalElements.size());
    }

    public void verifyUserIsOnHomePage(){
        Assert.assertEquals("https://practice.automationtesting.in/", driver.getCurrentUrl());
        if(driver.getCurrentUrl().equals(url)){
            System.out.println("Enjoy");
        }else {
            driver.navigate().to(url);
        }
    }

    public void clickOnNewArrival(){
        driver.findElement(New_arrival).click();
    }
    public void verifyUserOnBookStorePage(){
        Assert.assertEquals("Book store page", "Product Description", driver.findElement(product_desc_title).getText());
    }
    public void AddToBasketButton(){
        driver.findElement(btn_add_to_basket).click();
    }

    public void clickOnBookDesc() {
        driver.findElement(btn_book_desc).click();
        Assert.assertTrue(driver.findElement(product_desc_title).isDisplayed());
    }
    public void verifyProductDescIdDisplayed(){
        Assert.assertTrue(driver.findElement(product_desc).isDisplayed());
    }
    public void clickOnReviewBtn(){
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(btn_review_book));
        driver.findElement(btn_review_book).click();
    }
    public void verifyReviewOfBook(){
        Assert.assertTrue(driver.findElement(desc_review_book).isDisplayed());
    }
    public void verifyIfAddtobasketButtonDisplayed(){
        Assert.assertTrue(driver.findElement(btn_add_to_basket).isDisplayed());
    }
    public void verifyIfBookAddedToBasket(){
        driver.findElement(link_basket_item).click();
        Assert.assertTrue(driver.findElement(btn_apply_coupon).isDisplayed());
        Assert.assertTrue(driver.findElement(btn_update_basket).isDisplayed());
    }

}
