package com.qa.geisy.coronado.retov2.stepdefinitions;

import com.qa.geisy.coronado.retov2.tasks.Abrir;
import com.qa.geisy.coronado.retov2.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public class ObejtoExtraviadoStepDefintions {

        static Actor Geisy = Actor.named("Geisy");


        @Managed(uniqueSession = true)
        public WebDriver Browser_T;

        @Before
        public void annaCanBrowseTheWeb() {
            Geisy.can(BrowseTheWeb.with(Browser_T));
        }


        @Dado("^Que ingreso a la pagina de Tocumen\\.$")
        public void queIngresoALaPaginaDeTocumen()  {
            Geisy.wasAbleTo(Abrir.paginaTocumen());


        }



        @Cuando("^Ingreso a el menú Servicos en información de viajero, selecciono pdf de objetos extraviados\\.$")
        public void ingresoAElMenúServicosEnInformaciónDeViajeroSeleccionoPdfDeObjetosExtraviados() {
            Geisy.attemptsTo(Ingresar.serviciosObjetos());


        }



        @Entonces("^Verifico que el PDF sea el correcto\\.$")
        public void verificoQueElPDFSeaElCorrecto()  throws InterruptedException {
            ArrayList<String> tabs = new ArrayList<String> (Browser_T.getWindowHandles());
            Browser_T.switchTo().window(tabs.get(1));
            Thread.sleep(7000);



        }

    }


