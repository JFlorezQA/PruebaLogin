package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/v1/index.html")
public class interfazLogin extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("campo de usuario").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("campo password").located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("Boton login").located(By.xpath("//input[@class='btn_action']"));

}