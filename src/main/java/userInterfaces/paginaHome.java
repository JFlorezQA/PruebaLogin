package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class paginaHome {
    public static final Target ICONO_CARRITO = Target.the("Icono del carrito de compra").located(By.id("shopping_cart_container"));
}
