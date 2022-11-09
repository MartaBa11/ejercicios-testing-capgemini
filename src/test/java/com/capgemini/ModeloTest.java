package com.capgemini;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ModeloTest {

    @Test
    public void testConstructor(){
        Modelo m = new Modelo();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Patatas");
        lista.add("Tomates");

        assertNotNull(m.list());
        assertEquals(2,m.list().size());
        assertEquals(lista,m.list());

    }
}
