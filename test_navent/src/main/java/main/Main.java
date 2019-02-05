package main;

import math.Recta;
import models.Planeta;
import models.SistemaSolar;

public class Main {
    public static void main(String[] args) {
        int vecesAlineados = 0;

        Planeta alpha = new Planeta("Alpha", 1.00, 500.00);
        Planeta beta = new Planeta("Beta", 2.00, 2000.00);
        Planeta gamma = new Planeta("Gamma", -5.00, 1000.00);

        SistemaSolar sistemaSolar = new SistemaSolar(alpha, beta, gamma);

        for (int i = 0; i < 90; i++) {
            sistemaSolar.desplazarPlanetas(i);
            if (Recta.verificarAlineacionHorizontal(alpha, beta, gamma)) {
                vecesAlineados++;
            } else if (Recta.verificarAlineacionVertical(alpha, beta, gamma)) {
                vecesAlineados++;
            } else if (Recta.verificarAlineacion(alpha, beta, gamma)) {
                vecesAlineados++;
            }
        }
        System.out.println(vecesAlineados);
    }
}
