package com.capgemini;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit")
public class AulaTest {

    Aula aula = new Aula();
    @BeforeEach
    public void setUp(){
        aula = new Aula();
    }

    @Test
    @DisplayName("Todo tiene que estar vacío")
    public void testConstructorSinParametros(){
        assertEquals("",aula.getDimensiones());
        assertEquals(false,aula.getAireAcondicionado());
        assertEquals("",aula.getProfesorAsignado());
    }

    @ParameterizedTest
    @CsvSource({ "10X10, true, Antonio",
            "20x20, false, Jesus",
            "30x25, true, Maricarmen"})
    @DisplayName("dimensiones:10x10, aireAcondicionado:true, profesorAsignado:Antonio")
    public void testConstructorConParametros(String dim, Boolean aire, String nombre){
        Aula aula = new Aula(dim,aire,nombre);
        assertEquals(dim,aula.getDimensiones());
        assertEquals(aire,aula.getAireAcondicionado());
        assertEquals(nombre,aula.getProfesorAsignado());
    }

    @Test
    @DisplayName("Testeando los getter y setter")
    public void testGetterYSetter(){
        aula.setDimensiones("10x10");
        aula.setAireAcondicionado(true);
        aula.setProfesorAsignado("Antonio");
        assertEquals("10x10",aula.getDimensiones());
        assertEquals(true, aula.getAireAcondicionado());
        assertEquals("Antonio", aula.getProfesorAsignado());
    }

}
