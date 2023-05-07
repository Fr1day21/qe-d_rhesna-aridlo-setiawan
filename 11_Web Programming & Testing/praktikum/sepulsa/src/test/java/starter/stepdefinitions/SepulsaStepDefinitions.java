package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.*;
import starter.helpers.DoActionSepulsa;
import starter.helpers.NavigateToSepulsa;
import starter.helpers.SepulsaPage;

public class SepulsaStepDefinitions {

    Dotenv dotenv = Dotenv.load();

    @Given("{actor} on login page")
    public void userOnLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateToSepulsa.theSepulsaLoginPage());
    }

    @When("{actor} input valid email on field email {string}")
    public void userInputValidEmailOnFieldEmail(Actor actor, String email) {
        actor.attemptsTo(DoActionSepulsa.fillUsername(dotenv.get(email)));
    }

    @And("{actor} input valid password on field password {string}")
    public void userInputValidPasswordOnFieldPassword(Actor actor, String password) {
        actor.attemptsTo(DoActionSepulsa.fillPassword(dotenv.get(password)));
    }

    @And("{actor} click login button")
    public void userClickLoginButton(Actor actor) {
        actor.attemptsTo(DoActionSepulsa.clickLoginButton());
    }

    @Then("{actor} on home page")
    public void userOnHomePage(Actor actor) {

    }

    @Given("{actor} input invalid email on field email {string}")
    public void userInputInvalidEmailOnFieldEmail(Actor actor, String email) {
        actor.attemptsTo(DoActionSepulsa.fillUsername(dotenv.get(email)));
    }

    @And("{actor} input invalid password on field password {string}")
    public void userInputInvalidPasswordOnFieldPassword(Actor actor, String password) {
        actor.attemptsTo(DoActionSepulsa.fillPassword(dotenv.get(password)));
    }

    @Then("{actor} cant login")
    public void userCantLogin(Actor actor) {


    }

    @And("{actor} click pulsa button")
    public void userClickPulsaButton(Actor actor) {
        actor.attemptsTo(DoActionSepulsa.clickPulsaButton());
    }

    @And("{actor} on pulsa page see {string}")
    public void userOnPulsaPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SepulsaPage.PULSA_MENU).hasText(text));

    }

    @And("{actor} input phone number {string}")
    public void userInputPhoneNumber(Actor actor, String number) {
        actor.attemptsTo(DoActionSepulsa.fillNumber(number));
    }

    @And("{actor} choose option pulsa")
    public void userChooseOptionPulsa(Actor actor) {
        actor.attemptsTo(DoActionSepulsa.clickPulsa5000());
    }

    @Then("{actor} on payment page see {string}")
    public void userOnPaymentPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SepulsaPage.PAYMENT_MENU).hasText(text));
    }

    @Then("{actor} choose payment method")
    public void userChoosePaymentMethod(Actor actor) {
        actor.attemptsTo(DoActionSepulsa.clickDana());
    }

    @And("{actor} click payment button")
    public void userClickPaymentButton(Actor actor) {
        actor.attemptsTo(DoActionSepulsa.paymentButton());
    }

    @Then("{actor} see notify have to choose payment method {string}")
    public void userSeeNotifyHaveToChoosePaymentMethod(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SepulsaPage.NOTIFY_HAVE_CHOOSE_PAYMENT_METHOD).hasText(text));
    }

    @Then("{actor} see notify {string}")
    public void userSeeNotify(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SepulsaPage.NOTIFY_MORE_THEN_13_DIGIT).hasText(text));
    }
}
