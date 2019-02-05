package models;

import models.Planeta;
import org.junit.Test;

public class SistemaSolar {
    private Planeta alpha;
    private Planeta beta;
    private Planeta gamma;

    public SistemaSolar(Planeta alpha, Planeta beta, Planeta gamma) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
    }

    public void desplazarPlanetas(Integer cantidadDias) {
        alpha.desplazarse(cantidadDias);
        beta.desplazarse(cantidadDias);
        gamma.desplazarse(cantidadDias);
    }

}
