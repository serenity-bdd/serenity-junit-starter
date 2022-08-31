package starter.login;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginForm {

    public static By LOGIN_FIELD = By.xpath("//a[@href='https://schoolpack.smart.edu.co/idiomas/alumnos.aspx' and @target]");
    public static By USERNAME_FIELD = By.id("vUSUCOD");
    public static By PASSWORD_FIELD = By.id("vPASS");
    public static By ENTER_BUTTON = By.id("BUTTON1");

    public static By PROGRAM_BUTTON = By.xpath("//img[@src='Resources/PROGRAMACION.png']");

    public static By SELECT_PROGRAM = By.xpath("//span[@id='span_W0030TMPDESART_0001']");
    public static By BEGIN = By.xpath("//input[@id='W0030BUTTON1']");
    public static By BACK = By.xpath("//input[@id='BUTTON3']");
    public static By FRAME_2= By.id("gxp0_ifrm");
    public static By DROPDOWN_LIST = By.xpath("//select[@name='vTPEAPROBO']");

    public static By PENDINGS = By.xpath("//option[@value='2']");
    public static By NUMBER_CLASS = By.id("span_vPRONOMPRO_0002");
    public static By SCHEDULE_BUTTON = By.xpath("//input[@value='Asignar' ]");
//    public static By DAY_LIST = By.xpath("//select[@name='vDIA']");
    public static By SELECT_DAY = By.xpath("//*[@name='vDIA']//child::option[2]");

    public static By FRAME_3= By.id("gxp1_ifrm");

    public static By HOUR = By.xpath("//td[@data-colindex='2']//child::span[@id='span_W0030TMPCODART_0001']");

    public static By CONFIRMATION_TEXT = By.xpath("//div[@class='gx-warning-message']");

    public static By CLOSE = By.xpath("//span[@id='gxp1_cls']");
}
