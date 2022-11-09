package com.capgemini;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AplicacionTest {

   @Test
    public void testConstructorSinParametros(){
       Aplicacion a = new Aplicacion();
       assertNotNull(a.getControlador());

    }

    @Test
    public void testSetterControlador(){
        Controlador c = new Controlador();
        Aplicacion a = new Aplicacion();
        a.setControlador(c);

        assertNotNull(a.getControlador());
        assertEquals(c,a.getControlador());
    }

}
