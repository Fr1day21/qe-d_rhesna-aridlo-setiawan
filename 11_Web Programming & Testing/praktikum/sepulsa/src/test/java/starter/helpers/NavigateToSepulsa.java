package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToSepulsa {

    public static Performable theSepulsaLoginPage(){
        return Task.where("{0} open sepulsa home page",
                Open.browserOn().the(SepulsaPage.class));
    }
}
