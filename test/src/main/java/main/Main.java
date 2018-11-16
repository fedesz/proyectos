package main;

import math.Recta;
import modelos.Planeta;
import modelos.SistemaSolar;

public class Main {
    public static Integer main(Integer cantidadDias) {
        int vecesAlineados = 0;

        Planeta alpha = new Planeta("Alpha", 1, 500);
        Planeta beta = new Planeta("Beta", 2, 2000);
        Planeta gamma = new Planeta("Gamma", -5, 1000);

        SistemaSolar sistemaSolar = new SistemaSolar(alpha, beta, gamma);

        for (int i = 0; i < cantidadDias; i++) {
            sistemaSolar.desplazarPlanetas(cantidadDias);
            if (Recta.verificarAlineacionHorizontal(alpha, beta, gamma)) {
                vecesAlineados++;
            } else if (Recta.verificarAlineacionVertical(alpha, beta, gamma)) {
                vecesAlineados++;
            } else if(Recta.verificarAlineacion(alpha, beta, gamma)){
                vecesAlineados++;
            }
        }

        return vecesAlineados;
    }
}