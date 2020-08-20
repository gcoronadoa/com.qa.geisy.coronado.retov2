package com.qa.geisy.coronado.retov2.tasks;

import com.qa.geisy.coronado.retov2.userinterface.PaginaTocumen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private PaginaTocumen paginaTocumen;

    public static Abrir paginaTocumen() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaTocumen));
    }
}
