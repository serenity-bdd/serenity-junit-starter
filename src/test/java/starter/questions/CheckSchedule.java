package starter.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import starter.login.LoginForm;

import static starter.login.LoginForm.CONFIRMATION_TEXT;


public class CheckSchedule implements Question<Boolean>{



    @Override
    public Boolean answeredBy(Actor actor) {
        if(BrowseTheWeb.as(actor).find(CONFIRMATION_TEXT).isDisplayed()){
            Click.on(LoginForm.CLOSE);
            return true;
        }
        else {

            return false;
        }
    }

    public static CheckSchedule booked(){
        return new CheckSchedule();
    }
}
