package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

public class pruebasIntegracionProcesador {

    @Test
    public void testLlamaProceso(){
        //creamos el objeto procesador
        Procesador procesador = new Procesador();
        Proceso procesoMockeado;
        procesoMockeado = spy(new Proceso());
        procesador.setProceso(procesoMockeado);
        //Procesador procesador = new Procesador("",procesoMockeado) También lo podría haber hecho así

        String nombreProceso = "Suma";
        when(procesoMockeado.getNombre()).thenReturn(nombreProceso);
        procesador.llamaProceso();
        verify(procesoMockeado).getNombre();
        assertEquals("Suma-i",procesador.getComando());
    }
}
