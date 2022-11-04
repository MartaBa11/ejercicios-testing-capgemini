package com.capgemini;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    //@Test
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvFileSource(resources = "/calculadora.csv", numLinesToSkip = 1)
    public void testSuma(Float a, Float b, Float c){
        Float resultado = Calculadora.suma(a, b);
        assertEquals(c,resultado);
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
