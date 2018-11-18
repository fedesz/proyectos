package test;

import modelos.Planeta;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlanetaTest {
    @Test
    public void desplazarPlanetaCorrectamenteEnX() {
        Planeta alpha = new Planeta("Alpha", 1, 500);
        alpha.desplazarse(1);
        Long numeroEsperadoRedondeado = Math.round(770.1511529340698);
        assertEquals(770.1511529340698, alpha.getPosicionX().doubleValue(), 0.01);
    }
    @Test
    public void desplazarPlanetaCorrectamenteEnY() {
        Planeta alpha = new Planeta("Alpha", 1, 500);
        alpha.desplazarse(1);
        assertEquals(420.73549240394823, alpha.getPosicionY().doubleValue(), 0.01);
    }
}
