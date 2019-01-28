package test;

import math.Recta;
import modelos.Planeta;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RectaTest {
    @Test
    public void verificarAlineacionRetornaTrue(){
        Planeta alpha = new Planeta("Alpha", 1.0, 500.0);
        Planeta beta = new Planeta("Beta", 2.0, 2000.0);
        Planeta gamma = new Planeta("Gamma", -5.0, 1000.0);
        assertTrue(Recta.verificarAlineacion(alpha, beta, gamma));
    }

    @Test
    public void verificarAlineacionVerticalRetornaTrue(){
        Planeta alpha = new Planeta("Alpha", 1.0, 500.0);
        Planeta beta = new Planeta("Beta", 2.0, 2000.0);
        Planeta gamma = new Planeta("Gamma", -5.0, 1000.0);
        assertTrue(Recta.verificarAlineacionVertical(alpha, beta, gamma));
    }

    @Test
    public void verificarAlineacionHorizontalRetornaTrue(){
        Planeta alpha = new Planeta("Alpha", 1.0, 500.0);
        Planeta beta = new Planeta("Beta", 2.0, 2000.0);
        Planeta gamma = new Planeta("Gamma", -5.0, 1000.0);
        assertTrue(Recta.verificarAlineacionHorizontal(alpha, beta, gamma));
    }
}
