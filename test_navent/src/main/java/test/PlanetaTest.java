package test;

import models.Planeta;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlanetaTest {
    @Test
    public void desplazarPlanetaCorrectamenteEnX() {
        Planeta alpha = new Planeta("Alpha", 1.0, 500.0);
        alpha.desplazarse(1);
        assertEquals(1000, alpha.getPosicionX(), 0.01);
    }
    @Test
    public void desplazarPlanetaCorrectamenteEnY() {
        Planeta alpha = new Planeta("Alpha", 1.0, 500.0);
        alpha.desplazarse(1);
        assertEquals(10, alpha.getPosicionY(), 0.01);
    }
}
