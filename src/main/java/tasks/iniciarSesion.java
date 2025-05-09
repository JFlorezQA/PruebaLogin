package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userInterfaces.interfazLogin.*;

public class iniciarSesion implements Task {

    public String usuario;
    public String password;

    public iniciarSesion(String usuario, String password){
        this.usuario=usuario;
        this.password=password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(INPUT_USERNAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN));
    }

    public static iniciarSesion paginaWeb(String usuario, String password){
        return Tasks.instrumented(iniciarSesion.class,usuario,password);
    }
}
