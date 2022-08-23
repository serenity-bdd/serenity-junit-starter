package Tasks;

import Utils.SwitchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class DoLogin implements Task {

    private final String username;
    private final String password;

    public DoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password){
        return instrumented(DoLogin.class, username, password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
//        String defaultHandle = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.attemptsTo(
//                Switch.toActiveElement(),
                WaitUntil.the(LoginForm.LOGIN_FIELD, isClickable()),
                Click.on(LoginForm.LOGIN_FIELD),
                SwitchPage.switchBetweenPages(),
                WaitUntil.the(LoginForm.USERNAME_FIELD,isClickable()),
                Enter.theValue(username).into(LoginForm.USERNAME_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.ENTER_BUTTON)
        );
    }
}