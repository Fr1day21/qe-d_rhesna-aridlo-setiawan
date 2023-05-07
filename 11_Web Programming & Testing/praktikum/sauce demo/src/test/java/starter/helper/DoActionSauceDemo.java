package starter.helper;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class DoActionSauceDemo {
    public static Performable fillUsername(String username){
        return Task.where("{0} fill username field" + username,
                Enter.theValue(username).into(SauceDemoPage.USERNAME_FIELD));
    }

    public static Performable fillPassword(String password){
        return Task.where("{0} fill username field" + password,
                Enter.theValue(password).into(SauceDemoPage.PASSWORD_FIELD));
    }

    public static Performable loginButtton(){
        return Task.where("{0} fill username field" ,
                Click.on(SauceDemoPage.LOGIN_BUTTON));
    }

    public static Performable addToCart(){
        return Task.where("{0} add to cart" ,
                Click.on(SauceDemoPage.ADD_TO_CART_BUTTON));
    }

    public static Performable shoopingCart(){
        return Task.where("{0} cart icon" ,
                Click.on(SauceDemoPage.SHOOPING_CART));
    }
    public static Performable checkoutButton(){
        return Task.where("{0} chechout button" ,
                Click.on(SauceDemoPage.CHECKOUT_BUTTON));
    }

    public static Performable fillFirstName(String firstname){
        return Task.where("{0} fill firstname field" + firstname,
                Enter.theValue(firstname).into(SauceDemoPage.FILL_FIRST_NAME));
    }
    public static Performable fillLastName(String lastname) {
        return Task.where("{0} fill lastname field" + lastname,
                Enter.theValue(lastname).into(SauceDemoPage.FILL_LAST_NAME));
    }

    public static Performable postalCode(String postalcode) {
        return Task.where("{0} fill postal code field" + postalcode,
                Enter.theValue(postalcode).into(SauceDemoPage.POSTAL_CODE));
    }

    public static Performable continueButton(){
        return Task.where("{0} continue button" ,
                Click.on(SauceDemoPage.CONTINUE_BUTTON));
    }

    public static Performable finishButton(){
        return Task.where("{0} finish button" ,
                Click.on(SauceDemoPage.FINISH_BUTTON));
    }

}
