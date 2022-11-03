package com.capgemini;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerroTest {
    public Perro p = new Perro();

    @BeforeEach
    public void setup(){
        System.out.println("Before Each");
        p = new Perro();

    }

    @Test
    public void testConstructorSinParametros(){
        assertEquals("",p.raza);
    }

    @Test
    public void testConstructorConParametros(){
        Perro p = new Perro("Terrier");
        assertEquals("Terrier",p.raza);
    }

    @Test
    public void testGetterAndSetter(){
        p.setRaza("Terrier");
        assertEquals("Terrier",p.getRaza());
    }

        
}
