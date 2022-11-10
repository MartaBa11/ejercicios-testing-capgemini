package com.capgemini.selenium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaginaPrincipalTest extends PaginaPrincipalPactometro{
    //Aquí hacemos directamente los tests
    @Test
    public void testEstadoInicial(){
        //Poner directamente los asserts sin tener que especificar nada más
        assertEquals("0", numSies.getText());
        assertEquals("0", numNoes.getText());
        assertEquals("0", numAbst.getText());

    }

    @Test
    public void testBotonPulsadoBotonDeshabilitado() {
        // When pulso en el boton del PP
        botonPP.click();
        // Then compruebo que el botón está deshabilitado
        assertEquals("true", botonPP.getAttribute("disabled"));
        assertTrue(!botonPP.isEnabled());
        // When asigno los diputados a los noes
        noes.click();
        // Then el boton debe desaparecer
        assertEquals("display: none;", botonPP.getAttribute("style"));
        assertTrue(!botonPP.isDisplayed());
        // And comprobamos que el numero de noes es 89
        assertEquals("89", numNoes.getText());
    }
}
