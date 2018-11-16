package test;

import math.Recta;
import modelos.Planeta;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectaTest {
    @Test
    public void verificarAlineacionRetornaTrue(){
        Planeta alpha = new Planeta("Alpha", 1, 500);
        Planeta beta = new Planeta("Beta", 2, 2000);
        Planeta gamma = new Planeta("Gamma", -5, 1000);
        assertEquals(Recta.verificarAlineacion(alpha, beta, gamma), true);
    }
}
