package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSuma(){
        Float Resultado = Calculadora.suma(4F, 2F);
        assertEquals(6F,Resultado);
    }

    @Test
    public void testResta(){
        Float Resultado = Calculadora.resta(4F, 2F);
        assertEquals(2F,Resultado);
    }

    @Test
    public void testDiv(){
        Float Resultado = Calculadora.div(4F, 2F);
        assertEquals(2F,Resultado);
    }

    @Test
    public void testMulti(){
        Float Resultado = Calculadora.multi(4F, 2F);
        assertEquals(8F,Resultado);
    }

    // Hacer mas test metiendo mas datos
}
