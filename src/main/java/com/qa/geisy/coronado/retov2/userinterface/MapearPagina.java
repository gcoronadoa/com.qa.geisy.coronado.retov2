package com.qa.geisy.coronado.retov2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapearPagina extends PaginaTocumen{

    public static final Target SERVICIOS =  Target.the("Click en botón Servicios").
            located(By.xpath("//*[@id='menutop']/ul/li[3]/a"));
    public static final Target INF_VIAJES =  Target.the("Click en enlace Información de Viajeros").
            located(By.xpath("//*[@id='menutop']/ul/li[3]/ul/li[1]/a"));
    public static final Target OBJ_EXTRAVIADOS =  Target.the("pantalla de objetos extraviados").
            located(By.xpath("//*[@id='menutop']/ul/li[3]/ul/li[1]/ul/li[8]"));
    public static final Target PDF_OBJ =  Target.the("PDF de objetos extraviados").
            located(By.xpath("//*[@id='content']/div[1]/div/p[5]/a[1]/img"));

}




