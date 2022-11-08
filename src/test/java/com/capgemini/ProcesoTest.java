package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProcesoTest {
    @Test
    public void testConstructorSinParametros(){
        Proceso proceso = new Proceso();
        assertNull(proceso.getNombre());
        //assertNotNull(proceso.getNombre) Si lo hubiera inicializado a cadena vacía
    }

    @Test
    public void testConstructorParametros(){
        Proceso proceso = new Proceso("Sumar");
        assertEquals("Sumar", proceso.getNombre());
    }

    @Test
    public void testSetterNombre(){
        Proceso proceso = new Proceso();
        proceso.setNombre("Sumar");
        assertEquals("Sumar", proceso.getNombre());
    }
}
