package starter.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

@DefaultUrl("https://www.sepulsa.com/signin")
public class SepulsaPage extends PageObject {
    public static Target USERNAME_FIELD = Target.the("username field").located(By.xpath("//input[@id=\"email\"]"));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.xpath("//input[@id=\"password\"]"));
    public static Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//button[@id=\"submit_login\"]"));
    public static Target PULSA_BUTTON = Target.the("pulsa button").located(By.xpath("//div[@id=\"Pulsa\"]"));
    public static Target PULSA_MENU = Target.the("pulsa menu").located(By.xpath("//h1[text()=\"Isi Pulsa\"]"));
    public static Target FIELD_NUMBER = Target.the("number filed").located(By.xpath("//input[@id=\"phone_number\"]"));
    public static Target PULSA_5000 = Target.the("pulsa 5rb button").located(By.xpath("//div[@id=\"Telkomsel Rp5.000\"]"));
    public static Target PAYMENT_BUTTON = Target.the("payment button").located(By.xpath("//button[@id=\"submit_payment\"]"));
    public static Target PAYMENT_MENU = Target.the("payment menu").located(By.xpath("//h1[text()=\"Pembayaran\"]"));
    public static Target DANA_PAYMENT_METHOD = Target.the("choose payment").located(By.xpath("//input[@id=\"checkbox DANA\"]"));
    public static Target NOTIFY_MORE_THEN_13_DIGIT = Target.the("notify more then 13 digit number").located(By.xpath("//p[text()=\"Nomor handphonenya kelebihan. Maksimal 13 digit ya.\"]"));
    public static Target NOTIFY_HAVE_CHOOSE_PAYMENT_METHOD = Target.the("notify choose payment").located(By.xpath("//p[@id=\"error_select_payment\"]"));


}

