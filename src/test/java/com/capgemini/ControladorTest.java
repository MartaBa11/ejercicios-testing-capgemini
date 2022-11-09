package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ControladorTest {
    @Test
    public void testConstructor(){
        Controlador c = new Controlador();
        assertNotNull(c.getModelo());
    }

    @Test
    public void testSetter(){
        Controlador c = new Controlador();
        Modelo m = new Modelo();
        c.setModelo(m);
        assertNotNull(c.getModelo());
        assertEquals(m,c.getModelo());
    }
}
