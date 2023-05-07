package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoActionSepulsa {
    public static Performable fillUsername(String username){
        return Task.where("{0} fill username field" + username,
                Enter.theValue(username).into(SepulsaPage.USERNAME_FIELD));
    }

    public static Performable fillPassword(String password){
        return Task.where("{0} fill username field" + password,
                Enter.theValue(password).into(SepulsaPage.PASSWORD_FIELD));
    }

    public static Performable clickLoginButton(){
        return Task.where("{0} click login button",
                Click.on(SepulsaPage.LOGIN_BUTTON));
    }

    public static Performable clickPulsaButton(){
        return Task.where("{0} click pulsa button",
                Click.on(SepulsaPage.PULSA_BUTTON));
    }

    public static Performable fillNumber(String number){
        return Task.where("{0} fill number field" + number,
                Enter.theValue(number).into(SepulsaPage.FIELD_NUMBER));
    }

    public static Performable clickPulsa5000(){
        return Task.where("{0} click pulsa 5000",
                Click.on(SepulsaPage.PULSA_5000));
    }

    public static Performable clickDana(){
        return Task.where("{0} click dana ",
                Click.on(SepulsaPage.DANA_PAYMENT_METHOD));
    }

    public static Performable paymentButton(){
        return Task.where("{0} click payment button ",
                Click.on(SepulsaPage.PAYMENT_BUTTON));
    }

}
