package com.capgemini;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerroTest {
    Perro p = new Perro();

    @BeforeEach
    public void setup(){
        System.out.println("Before Each");
        this.p = new Perro();

    }

    @Test
    public void testConstructorSinParametros(){
        assertEquals("",this.p.raza);
    }

    @Test
    public void testConstructorConParametros(){
        Perro p = new Perro("Terrier");
        assertEquals("Terrier",p.raza);
    }

    @Test
    public void testGetterAndSetter(){
        this.p.setRaza("Terrier");
        assertEquals("Terrier",this.p.getRaza());
    }

        
}
