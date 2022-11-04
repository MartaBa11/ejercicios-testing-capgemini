package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit")
public class CurritoTest {
    Currito currito = new Currito();
    @BeforeEach
    public void setUp(){
        currito = new Currito();
    }

    @Test
    public void testConstructorSinParametros(){
        assertEquals("", currito.getNombre());
        assertEquals(0,currito.getDni());
        assertEquals(0,currito.getTelf());
        assertEquals(0F, currito.getSueldo());
        assertEquals("", currito.getCargo());
        assertEquals("", currito.getPuestoTrabajo());
    }

    @Test
    public void testConstructorConParametros(){
        Currito currito = new Currito("Marta", 3330, 220202, 16000F,"Testing","Oficina");
        assertEquals("Marta", currito.getNombre());
        assertEquals(3330, currito.getDni());
        assertEquals(220202, currito.getTelf());
        assertEquals(16000F, currito.getSueldo());
        assertEquals("Testing", currito.getCargo());
        assertEquals("Oficina", currito.getPuestoTrabajo());
    }

    @Test
    public void testGetterYSetter(){
        currito.setNombre("Marta");
        currito.setDni(234);
        currito.setTelf(3334);
        currito.setSueldo(16000F);
        currito.setCargo("Testing");
        currito.setPuestoTrabajo("Oficina");
        assertEquals("Marta", currito.getNombre());
        assertEquals(234, currito.getDni());
        assertEquals(3334, currito.getTelf());
        assertEquals(16000F, currito.getSueldo());
        assertEquals("Testing", currito.getCargo());
        assertEquals("Oficina", currito.getPuestoTrabajo());
    }
}
