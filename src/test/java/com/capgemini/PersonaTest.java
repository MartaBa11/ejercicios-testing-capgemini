package com.capgemini;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit")
public class PersonaTest {
    Persona persona = new Persona();
    @BeforeEach
    public void setUp(){
        persona = new Persona();
    }

    @Test
    public void testConstructorSinParametros(){
        assertEquals("", persona.getNombre());
        assertEquals(0,persona.getDni());
        assertEquals(0,persona.getTelf());
    }

    @Test
    public void testConstructorConParametros(){
        Persona persona = new Persona("Marta", 3330, 220202);
        assertEquals("Marta", persona.getNombre());
        assertEquals(3330, persona.getDni());
        assertEquals(220202, persona.getTelf());
    }

    @Test
    public void testGetterYSetter(){
        persona.setNombre("Marta");
        persona.setDni(234);
        persona.setTelf(3334);
        assertEquals("Marta", persona.getNombre());
        assertEquals(234, persona.getDni());
        assertEquals(3334, persona.getTelf());
    }

}
