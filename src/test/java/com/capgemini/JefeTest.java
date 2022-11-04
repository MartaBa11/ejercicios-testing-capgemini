package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit")
public class JefeTest {
    Jefe jefe = new Jefe();
    @BeforeEach
    public void setUp(){
        this.jefe = new Jefe();
    }

    @Test
    public void testConstructorSinParametros(){
        assertEquals("",jefe.getNombre());
        assertEquals(0,jefe.getDni());
        assertEquals(0,jefe.getTelf());
        assertEquals(0F, jefe.getSueldo());
        assertEquals("", jefe.getCargo());
        assertEquals("", jefe.getDepartamento());
        assertEquals(0, jefe.getPersonasCargo());
    }

    @Test
    public void testConstructorConParametros(){
        Jefe jefe = new Jefe("Marta", 3330, 220202, 16000F,"Testing","Software",10);
        assertEquals("Marta", jefe.getNombre());
        assertEquals(3330, jefe.getDni());
        assertEquals(220202, jefe.getTelf());
        assertEquals(16000F, jefe.getSueldo());
        assertEquals("Testing", jefe.getCargo());
        assertEquals("Software", jefe.getDepartamento());
        assertEquals(10, jefe.getPersonasCargo());
    }

    @Test
    public void testGetterYSetter(){
        jefe.setNombre("Marta");
        jefe.setDni(234);
        jefe.setTelf(3334);
        jefe.setSueldo(16000F);
        jefe.setCargo("Testing");
        jefe.setDepartamento("Software");
        jefe.setPersonasCargo(10);
        assertEquals("Marta", jefe.getNombre());
        assertEquals(234, jefe.getDni());
        assertEquals(3334, jefe.getTelf());
        assertEquals(16000F, jefe.getSueldo());
        assertEquals("Testing", jefe.getCargo());
        assertEquals("Software", jefe.getDepartamento());
        assertEquals(10, jefe.getPersonasCargo());

    }
}
