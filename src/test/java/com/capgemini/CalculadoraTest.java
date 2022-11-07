package com.capgemini;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    //@Test
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvFileSource(resources = "/calculadora.csv", numLinesToSkip = 1)
    public void testSuma(Float a, Float b, Float c){
        Float resultado = Calculadora.suma(a, b);
        assertEquals(c,resultado);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/resta.csv", numLinesToSkip = 1)
    public void testResta(Float a, Float b, Float expetedResult){
        Float resultado = Calculadora.resta(a, b);
        assertEquals(expetedResult,resultado);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/div.csv", numLinesToSkip = 1)
    public void testDiv(Float a, Float b, Float expectedResult){
        Float resultado = Calculadora.div(a, b);
        assertEquals(expectedResult,resultado);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/multi.csv", numLinesToSkip = 1)
    public void testMulti(Float a, Float b, Float expectedResult){
        Float resultado = Calculadora.multi(a, b);
        assertEquals(expectedResult,resultado);
    }

    // Hacer mas test metiendo mas datos
}
