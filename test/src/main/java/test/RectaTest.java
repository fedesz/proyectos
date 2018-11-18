package test;

import math.Recta;
import modelos.Planeta;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RectaTest {
    @Test
    public void verificarAlineacionRetornaTrue(){
        Planeta alpha = new Planeta("Alpha", 1, 500);
        Planeta beta = new Planeta("Beta", 2, 2000);
        Planeta gamma = new Planeta("Gamma", -5, 1000);
        assertTrue(Recta.verificarAlineacion(alpha, beta, gamma));
    }

    @Test
    public void verificarAlineacionVerticalRetornaTrue(){
        Planeta alpha = new Planeta("Alpha", 1, 500);
        Planeta beta = new Planeta("Beta", 2, 2000);
        Planeta gamma = new Planeta("Gamma", -5, 1000);
        assertTrue(Recta.verificarAlineacionVertical(alpha, beta, gamma));
    }

    @Test
    public void verificarAlineacionHorizontalRetornaTrue(){
        Planeta alpha = new Planeta("Alpha", 1, 500);
        Planeta beta = new Planeta("Beta", 2, 2000);
        Planeta gamma = new Planeta("Gamma", -5, 1000);
        assertTrue(Recta.verificarAlineacionHorizontal(alpha, beta, gamma));
    }
}
