package Utils;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SwitchPage implements Task {


    public static String getNewWindowHandle(Actor actor, String currentWindowHandle){
        for(String windowHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()){
            if(!windowHandle.equals(currentWindowHandle)){
//                System.out.println("+++++++++++++++++++++++ "+windowHandle);
                return windowHandle;
            }
        }
        return null;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String currentHandle = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.attemptsTo(
                Switch.toWindow(getNewWindowHandle(actor,currentHandle))

        );


    }
    public static Performable switchBetweenPages(){
        return instrumented(SwitchPage.class);
    }
}
