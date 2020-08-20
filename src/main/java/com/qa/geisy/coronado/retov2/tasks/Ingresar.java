package com.qa.geisy.coronado.retov2.tasks;

import com.qa.geisy.coronado.retov2.userinterface.MapearPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ingresar implements Task {
    public static Ingresar serviciosObjetos() {

        return Tasks.instrumented(Ingresar.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MapearPagina.SERVICIOS));
        actor.attemptsTo(Click.on(MapearPagina.INF_VIAJES));
        actor.attemptsTo(Click.on(MapearPagina.OBJ_EXTRAVIADOS));
        actor.attemptsTo(Click.on(MapearPagina.PDF_OBJ));

    }
}