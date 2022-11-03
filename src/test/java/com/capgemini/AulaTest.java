package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AulaTest {
    Aula aula;
    @BeforeEach
    public void setUp(){
        aula = new Aula();
    }

    @Test
    public void testConstructorSinParametros(){
        assertEquals("",aula.getDimensiones());
        assertEquals(false,aula.getAireAcondicionado());
        assertEquals("",aula.getProfesorAsignado());
    }

    @Test
    public void testConstructorConParametros(){
        Aula aula = new Aula("10x10",true,"Antonio");
        assertEquals("10x10",aula.getDimensiones());
        assertEquals(true,aula.getAireAcondicionado());
        assertEquals("Antonio",aula.getProfesorAsignado());
    }

    @Test
    public void testGetterYSetter(){
        aula.setDimensiones("10x10");
        aula.setAireAcondicionado(true);
        aula.setProfesorAsignado("Antonio");
        assertEquals("10x10",aula.getDimensiones());
        assertEquals(true, aula.getAireAcondicionado());
        assertEquals("Antonio", aula.getProfesorAsignado());
    }

}
