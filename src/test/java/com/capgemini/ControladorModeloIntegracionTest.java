package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class ControladorModeloIntegracionTest {
    @Test
    public void list(){
        Controlador c = new Controlador();
        Modelo m = spy(new Modelo());
        c.setModelo(m);
        c.list();
        verify(m).list();
    }
}
