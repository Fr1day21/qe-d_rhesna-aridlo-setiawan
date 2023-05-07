package starter.helper;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class SauceDemoPage extends PageObject{
    public static Target USERNAME_FIELD = Target.the("username field").located(By.xpath("//input[@id=\"user-name\"]"));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.xpath("//input[@data-test=\"password\"]"));
    public static Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//input[@id=\"login-button\"]"));
    public static Target NOTIFY_CANT_LOGIN = Target.the("notify cant login").located(By.xpath("//h3[text()=\"Epic sadface: Username and password do not match any user in this service\"]"));
    public static Target LANDING_PAGE = Target.the("landing page").located(By.xpath("//span[text()=\"Products\"]"));
    public static Target ADD_TO_CART_BUTTON = Target.the("add to cart").located(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    public static Target SHOOPING_CART = Target.the("cart icon").located(By.xpath("//div[@id=\"shopping_cart_container\"]"));
    public static Target PRODUCT = Target.the("product name").located(By.xpath("//div[@class=\"inventory_item_name\"]"));
    public static Target CHECKOUT_BUTTON = Target.the("checkout button").located(By.xpath("//button[@data-test=\"checkout\"]"));
    public static Target FILL_FIRST_NAME = Target.the("fill first name").located(By.xpath("//input[@data-test=\"firstName\"]"));
    public static Target FILL_LAST_NAME = Target.the("fill last name").located(By.xpath("//input[@data-test=\"lastName\"]"));
    public static Target POSTAL_CODE = Target.the("fill postal code").located(By.xpath("//input[@data-test=\"postalCode\"]"));
    public static Target CONTINUE_BUTTON = Target.the("continue button").located(By.xpath("//input[@data-test=\"continue\"]"));
    public static Target OVERVIEW = Target.the("overview").located(By.xpath("//span[@class=\"title\"]"));
    public static Target FINISH_BUTTON = Target.the("finish button").located(By.xpath("//button[@data-test=\"finish\"]"));
    public static Target COMPLETE_NOTIFY = Target.the("complete notify").located(By.xpath("//h2[@class=\"complete-header\"]"));
    public static Target FAIL_TO_ORDER = Target.the("can't proses notify").located(By.xpath("//h3[text()=\"Error: First Name is required\"]"));
}
