package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class AplicacionControladorIntegracionTest {
    @Test
    public void testMain(){
        Aplicacion a = new Aplicacion();
        Controlador cMockito = spy(new Controlador());
        a.setControlador(cMockito);

        a.main();
        verify(cMockito).list();


    }
}
