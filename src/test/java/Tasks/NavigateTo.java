package Tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.login.EnglishPage;

public class NavigateTo {
    public static Performable theLoginEnglishPage() {
        return Task.where("{0} opens the login english page",
                Open.browserOn().the(EnglishPage.class));
    }
}
