package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userInterfaces.paginaHome.*;

public class validarInicioSesionExito implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ICONO_CARRITO.resolveFor(actor).isVisible();
    }

    public static validarInicioSesionExito prueba(){
        return new validarInicioSesionExito();
    }
}
