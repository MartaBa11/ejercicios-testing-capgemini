package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {
    Empleado empleado;
    @BeforeEach
    public void setUp(){
        empleado = new Empleado();
    }

    @Test
    public void testConstructorSinParametros(){
        assertEquals("", empleado.getNombre());
        assertEquals(0,empleado.getDni());
        assertEquals(0,empleado.getTelf());
        assertEquals(0F, empleado.getSueldo());
        assertEquals("", empleado.getCargo());
    }

    @Test
    public void testConstructorConParametros(){
        Empleado empleado = new Empleado("Marta", 3330, 220202, 16000F,"Testing");
        assertEquals("Marta", empleado.getNombre());
        assertEquals(3330, empleado.getDni());
        assertEquals(220202, empleado.getTelf());
        assertEquals(16000F, empleado.getSueldo());
        assertEquals("Testing", empleado.getCargo());
    }

    @Test
    public void testGetterYSetter(){
        empleado.setNombre("Marta");
        empleado.setDni(234);
        empleado.setTelf(3334);
        empleado.setSueldo(16000F);
        empleado.setCargo("Testing");
        assertEquals("Marta", empleado.getNombre());
        assertEquals(234, empleado.getDni());
        assertEquals(3334, empleado.getTelf());
        assertEquals(16000F, empleado.getSueldo());
        assertEquals("Testing", empleado.getCargo());
    }
}
