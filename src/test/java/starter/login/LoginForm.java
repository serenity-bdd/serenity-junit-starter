package starter.login;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {

    public static By LOGIN_FIELD = By.xpath("//a[@href='https://schoolpack.smart.edu.co/idiomas/alumnos.aspx' and @target]");
    public static By USERNAME_FIELD = By.id("vUSUCOD");
    public static By PASSWORD_FIELD = By.id("vPASS");
    public static By ENTER_BUTTON = By.id("BUTTON1");

    public static By PROGRAM_BUTTON = By.xpath("//img[@src='Resources/PROGRAMACION.png']");

    public static By SELECT_PROGRAM = By.xpath("//span[@id='span_W0030TMPDESART_0001']");
    public static By BEGIN = By.xpath("//input[@id='W0030BUTTON1']");
    public static By BACK = By.xpath("//input[@id='BUTTON3']");


}
