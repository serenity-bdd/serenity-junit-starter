package Utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;



public class SwitchFrame implements Task  {
    private final By locatorFrame;

    public SwitchFrame(By locatorFrame){
        this.locatorFrame = locatorFrame;
    }
    public WebElement SwitchDoubleTap(By locator_frame, Actor actor){
        WebElement frame= BrowseTheWeb.as(actor).find(locator_frame);
        return frame;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Switch.toFrame(SwitchDoubleTap(locatorFrame, actor))

        );


    }

    public static Performable switchToFrame(By locatorFrame) {
        return instrumented(SwitchFrame.class,locatorFrame);
    }
}


