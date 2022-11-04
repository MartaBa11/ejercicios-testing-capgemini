package com.capgemini;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit")
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

    @ParameterizedTest
    @ValueSource(strings = {"Terrier","Pastor Aleman", "Bulldog", "Papaya"})
    public void testConstructorConParametros(String raza){
        Perro p = new Perro(raza);
        assertEquals(raza,p.raza,() -> "La raza " + raza + " es la correcta");
    }

    @Test
    public void testGetterAndSetter(){
        p.setRaza("Terrier");
        assertEquals("Terrier",p.getRaza());
    }

        
}
