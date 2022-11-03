package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaTest {
    Sala sala;

    @BeforeEach
    public void setUp(){
        sala = new Sala();
    }

    @Test
    public void testConstructorSinParametros(){
        sala = new Sala();
        assertEquals("",sala.getDimensiones());
        assertEquals(false, sala.getAireAcondicionado());
    }

    @Test
    public void testConstructorConParametros(){
        sala = new Sala("10x10",true);
        assertEquals("10x10",sala.getDimensiones());
        assertEquals(true, sala.getAireAcondicionado());
    }

    @Test
    public void testGetterYSetter(){
        sala.setDimensiones("10x10");
        sala.setAireAcondicionado(true);
        assertEquals("10x10",sala.getDimensiones());
        assertEquals(true,sala.getAireAcondicionado());
    }

    @Test
    public void testToString(){
        assertEquals("Sala{" +
                "dimensiones='" + sala.getDimensiones() + '\'' +
                ", aireAcondicionado=" + sala.getAireAcondicionado() +
                '}', sala.toString());
    }

}
