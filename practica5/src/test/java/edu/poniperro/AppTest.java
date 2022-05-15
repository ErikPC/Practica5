package edu.poniperro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    Calculadora calculadora = new Calculadora();

    @Test
    public void firstTest() {
        assertTrue(true);
    }

    @Test
    public void testSuma() {
        assertEquals(10, calculadora.sumar(5.0, 5.0), 0);
    }

    @Test
    public void testResta() {
        assertEquals(0, calculadora.restar(5.0, 5.0), 0);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(25, calculadora.multiplicar(5.0, 5.0), 0);
    }

    @Test
    public void testDividir() {
        assertEquals(1, calculadora.dividir(5.0, 5.0), 0);
    }

    @Test
    public void testSumaNegativa() {
        assertEquals(0, calculadora.sumar(-5.0, 5.0), 0);
    }

    @Test
    public void testRestaNegativa() {
        assertEquals(-5, calculadora.restar(0.0, 5.0), 0);
    }

    @Test
    public void testMultiplicarNegativa() {
        assertEquals(-25, calculadora.multiplicar(5.0, -5.0), 0);
    }

    @Test
    public void testDividirNegativo() {
        assertEquals(-1, calculadora.dividir(5.0, -5.0), 0);
    }

    @Test
    public void testDividirZero() {
        assertEquals(Double.POSITIVE_INFINITY, calculadora.dividir(5.0, 0.0), 0);

    }
}
