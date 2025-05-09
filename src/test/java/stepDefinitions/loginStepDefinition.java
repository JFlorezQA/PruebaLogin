package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import questions.validarInicioSesionExito;
import tasks.iniciarSesion;
import userInterfaces.interfazLogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class loginStepDefinition {

    @Before
    public void setup(){
     setTheStage(new OnlineCast());
    }

    @Given("Que ingreso a la pagina web www.saucedemo.com")
    public void queIngresoALaPaginaWebWwwSaucedemoCom() {
        theActorCalled("PO").wasAbleTo(Open.url("https://www.saucedemo.com/v1/index.html"));
    }

    @When("Se diligencia las credenciales usuario {string} y password {string}")
    public void seDiligenciaLasCredencialesUsuarioYPassword(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo((iniciarSesion.paginaWeb(usuario,password)));
    }
    @Then("Se logeo correctamente a la pagina web")
    public void seLogeoCorrectamenteALaPaginaWeb() {
    theActorInTheSpotlight().should(seeThat(validarInicioSesionExito.prueba(),equalTo(true)));
    }

    @Then("Se logeo no exitoso a la pagina web")
    public void seLogeoNoExitosoALaPaginaWeb() {
        theActorInTheSpotlight().should(seeThat(validarInicioSesionExito.prueba(),equalTo(false)));
    }
}
