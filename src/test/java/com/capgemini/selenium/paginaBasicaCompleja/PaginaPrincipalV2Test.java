package com.capgemini.selenium.paginaBasicaCompleja;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaginaPrincipalV2Test extends PaginaBasica{
    PaginaPrincipalPactometroV2 paginaPrincipalPactometroV2;

    @BeforeEach
    @Override
    public void setUp(){
        super.setUp();  //lo que hacemos es llamar siempre al setUp() de la clase padre
        //Esto se hace para poder llamar y configurar los parámetros

        //Aquí es donde cambiamos para poder seleccionar los diferentes elementos
        paginaPrincipalPactometroV2 = new PaginaPrincipalPactometroV2(getDriver());
    }

    @Test
    public void testEstadoInicial(){
        assertEquals("0", paginaPrincipalPactometroV2.numSies.getText());
        assertEquals("0", paginaPrincipalPactometroV2.numNoes.getText());
        assertEquals("0", paginaPrincipalPactometroV2.numAbst.getText());
    }
    @Test
    public void testBotonPulsadoBotonDeshabilitado(){
        // When pulso en el boton del PP
        paginaPrincipalPactometroV2.botonPP.click();
        // Then compruebo que el botón está deshabilitado
        assertEquals("true", paginaPrincipalPactometroV2.botonPP.getAttribute("disabled"));
        assertTrue(!paginaPrincipalPactometroV2.botonPP.isEnabled());
        // When asigno los diputados a los noes
        paginaPrincipalPactometroV2.noes.click();
        // Then el boton debe desaparecer
        assertEquals("display: none;", paginaPrincipalPactometroV2.botonPP.getAttribute("style"));
        assertTrue(!paginaPrincipalPactometroV2.botonPP.isDisplayed());
        // And comprobamos que el numero de noes es 89
        assertEquals("89", paginaPrincipalPactometroV2.numNoes.getText());
    }
}