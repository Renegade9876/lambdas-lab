package com.javanme.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Pruebas para los ejercicios de nivel básico
 * Created by aalopez on 18/08/15.
 */
public class BasicoTest {
    private Basico ejercicios = new Basico();

    @Test
    public void ejercicio1() {
        List<String> listado = Arrays.asList(
                "Cali", "es", "cali", "lo", "demás", "es", "loma");
        List<String> resultado = ejercicios.ejercicio1(listado);
        assertEquals(Arrays.asList(
                "CALI", "ES", "CALI", "LO", "DEMÁS", "ES", "LOMA"), resultado);
    }

    @Test
    public void ejercicio2() {
        List<String> listado = Arrays.asList(
                "A la una", "De eso tan bueno no dan tanto", "Hoy no fío mañana sí", "A las dos", "Más vale pájaro en mano que cien volando", "Entre menos sepa mejor vivo", "La vejez al que no lo mata lo desfigura", "y", "A las tres", "La plata se va y el burro queda");
        List<String> resultado = ejercicios.ejercicio2(listado);
        assertEquals(Arrays.asList(
                "De eso tan bueno no dan tanto", "Hoy no fío mañana sí", "Más vale pájaro en mano que cien volando", "Entre menos sepa mejor vivo", "La vejez al que no lo mata lo desfigura", "La plata se va y el burro queda"), resultado);
    }

    @Test
    public void ejercicio3() {
        List<String> listado = Arrays.asList(
                "Aprende", "a", "usar", "lambdas", "y Streams", "de", "Java 8");
        String resultado = ejercicios.ejercicio3(listado);
        assertEquals("usar-lambdas-y Streams", resultado);
    }
}
