package Tasks;

import Utils.SwitchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BookClass implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginForm.PROGRAM_BUTTON, isClickable()),
                Click.on(LoginForm.PROGRAM_BUTTON),
                WaitUntil.the(LoginForm.SELECT_PROGRAM, isClickable()),
                Click.on(LoginForm.SELECT_PROGRAM),
                Click.on(LoginForm.BEGIN),
                SwitchPage.switchBetweenPages()
//                Click.on(LoginForm.BACK)
        );

    }

    public static Performable bookClass(){
        return instrumented(BookClass.class);
    }
}
