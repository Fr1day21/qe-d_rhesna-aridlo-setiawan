package starter.helper;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToSauceDemo {
    public static Performable theSauceDemoPage(){
        return Task.where("{0} open sauce demo login page",
                Open.browserOn().the(SauceDemoPage.class));
    }
}
