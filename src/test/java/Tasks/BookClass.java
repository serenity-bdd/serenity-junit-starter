package Tasks;

import Utils.SwitchFrame;
import Utils.SwitchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static starter.login.LoginForm.FRAME_2;
import static starter.login.LoginForm.FRAME_3;

public class BookClass implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginForm.PROGRAM_BUTTON, isClickable()),
                Click.on(LoginForm.PROGRAM_BUTTON),
                WaitUntil.the(LoginForm.SELECT_PROGRAM, isClickable()),
                Click.on(LoginForm.SELECT_PROGRAM),
                Click.on(LoginForm.BEGIN),
                WaitUntil.the(FRAME_2,isClickable()),
                SwitchFrame.switchToFrame(FRAME_2),
                WaitUntil.the(LoginForm.DROPDOWN_LIST,isClickable()),
                Click.on(LoginForm.DROPDOWN_LIST),
                WaitUntil.the(LoginForm.PENDINGS,isClickable()),
                Click.on(LoginForm.PENDINGS),
                WaitUntil.the(LoginForm.NUMBER_CLASS,isClickable()),
                Click.on(LoginForm.NUMBER_CLASS),
                WaitUntil.the(LoginForm.SCHEDULE_BUTTON,isClickable()),
                Click.on(LoginForm.SCHEDULE_BUTTON),
                Switch.toParentFrame(),
                WaitUntil.the(FRAME_3,isClickable()),
                SwitchFrame.switchToFrame(FRAME_3),
//                WaitUntil.the(LoginForm.DAY_LIST,isClickable()),
//                Click.on(LoginForm.DAY_LIST),
                WaitUntil.the(LoginForm.SELECT_DAY,isClickable()),
                Click.on(LoginForm.SELECT_DAY),
//                WaitUntil.the(LoginForm.HOUR,isClickable()),
                Click.on(LoginForm.HOUR),
                Click.on(LoginForm.ENTER_BUTTON)


//                WaitUntil.the(LoginForm.SCHEDULE_BUTTON, isClickable()),
//                Click.on(LoginForm.SCHEDULE_BUTTON)
        );

    }

    public static Performable bookClass(){
        return instrumented(BookClass.class);
    }
}
