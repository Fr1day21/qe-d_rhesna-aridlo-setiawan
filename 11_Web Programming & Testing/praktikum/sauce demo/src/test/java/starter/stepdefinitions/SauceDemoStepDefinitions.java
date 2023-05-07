package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helper.DoActionSauceDemo;
import starter.helper.NavigateToSauceDemo;
import starter.helper.SauceDemoPage;

public class SauceDemoStepDefinitions {

    Dotenv dotenv = Dotenv.load();

    @Given("{actor} on login page sauce demo")
    public void userOnLoginPageSauceDemo(Actor actor) {
        actor.wasAbleTo(NavigateToSauceDemo.theSauceDemoPage());
    }

    @When("{actor} input valid username on field username {string}")
    public void userInputValidEmailOnFieldEmail(Actor actor, String username) {
        actor.attemptsTo(DoActionSauceDemo.fillUsername(dotenv.get(username)));
    }

    @And("{actor} input valid password on field password {string}")
    public void userInputValidPasswordOnFieldPassword(Actor actor, String password) {
        actor.attemptsTo(DoActionSauceDemo.fillPassword(dotenv.get(password)));
    }

    @And("{actor} click login button")
    public void userClickLoginButton(Actor actor) {
        actor.attemptsTo(DoActionSauceDemo.loginButtton());
    }

    @Then("{actor} on home page sauce demo see {string}")
    public void userOnHomePageSauceDemo(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.LANDING_PAGE).hasText(text));
    }

    @When("{actor} input invalid username on field username {string}")
    public void userInputInvalidUsernameOnFieldUsername(Actor actor, String username) {
        actor.attemptsTo(DoActionSauceDemo.fillUsername(dotenv.get(username)));
    }

    @And("{actor} input invalid password on field password {string}")
    public void userInputInvalidPasswordOnFieldPassword(Actor actor, String password) {
        actor.attemptsTo(DoActionSauceDemo.fillPassword(dotenv.get(password)));
    }

    @Then("{actor} can't login see {string}")
    public void userCanTLoginSee(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.NOTIFY_CANT_LOGIN).hasText(text));
    }

    @And("{actor} choose the product then click add to cart button")
    public void userChooseTheProductThenClickAddToCartButton(Actor actor) {
        actor.attemptsTo(DoActionSauceDemo.addToCart());
    }

    @And("{actor} click icon cart on top right page")
    public void userClickIconCartOnTopRightPage(Actor actor) {
        actor.attemptsTo(DoActionSauceDemo.shoopingCart());
    }

    @Then("{actor} see the product choosen {string}")
    public void userSeeTheProductChoosen(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.PRODUCT).hasText(text));
    }

    @And("{actor} click checkout button")
    public void userClickCheckoutButton(Actor actor) {
        actor.attemptsTo(DoActionSauceDemo.checkoutButton());
    }

    @And("{actor} input first name {string}")
    public void userInputFirstName(Actor actor, String text) {
        actor.attemptsTo(DoActionSauceDemo.fillFirstName(text));
    }

    @And("{actor} input last name {string}")
    public void userInputLastName(Actor actor, String text) {
        actor.attemptsTo(DoActionSauceDemo.fillLastName(text));
    }

    @And("{actor} input postal code {string}")
    public void userInputPostalCode(Actor actor, String text) {
        actor.attemptsTo(DoActionSauceDemo.postalCode(text));
    }

    @And("{actor} click continue")
    public void userClickContinue(Actor actor) {
        actor.attemptsTo(DoActionSauceDemo.continueButton());
    }

    @And("{actor} click finish")
    public void userClickFinish(Actor actor) {
        actor.attemptsTo(DoActionSauceDemo.finishButton());
    }

    @Then("{actor} see order complate notify {string}")
    public void userSeeOrderComplateNotify(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.COMPLETE_NOTIFY).hasText(text));
    }

    @Then("{actor} see order can't proses notify {string}")
    public void userSeeOrderCanTProsesNotify(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.FAIL_TO_ORDER).hasText(text));
    }
}
