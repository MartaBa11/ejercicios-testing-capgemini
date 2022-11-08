package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTest {

    @Test
    public void testConstructor(){
        Procesador procesador = new Procesador();
        Proceso proceso = new Proceso();
        assertNull(procesador.getComando());
        assertNotNull(procesador.getProceso());  //para verificar otras clases
        assertEquals(null, procesador.getProceso().getNombre());
    }

    @Test
    public void testConstructorParametros(){
        Proceso proceso = new Proceso("Sumar");
        Procesador procesador = new Procesador("Operaciones aritméticas",proceso);

        assertNotNull(procesador.getComando());
        assertEquals("Operaciones aritméticas", procesador.getComando());

        assertNotNull(procesador.getProceso());
        assertEquals(proceso, procesador.getProceso());
    }

    @Test
    public void testSetterComando(){
        Procesador procesador = new Procesador();
        procesador.setComando("Operaciones aritméticas");
        assertEquals("Operaciones aritméticas", procesador.getComando());
    }

    @Test
    public void testSetterProceso(){
        Procesador procesador = new Procesador();
        Proceso proceso = new Proceso("Sumar");
        procesador.setProceso(proceso);
        assertEquals(proceso, procesador.getProceso());
    }

}
