package math;

import modelos.Planeta;

public class Recta {
    public static Boolean verificarAlineacion(Planeta alpha, Planeta beta, Planeta gamma) {
        Double m1 = calcularPendiente(alpha.getPosicionX(), alpha.getPosicionY(), beta.getPosicionX(), beta.getPosicionY());
        Double m2 = calcularPendiente(alpha.getPosicionX(), alpha.getPosicionY(), gamma.getPosicionX(), gamma.getPosicionY());
        if (m1 == m2) {
            return true;
        } else {
            return false;
        }
    }

    public static Double calcularPendiente(Double x1, Double y1, Double x2, Double y2) {
        Double m = (y2 - y1) / (x2 - x1);
        return m;
    }

    public static Boolean verificarAlineacionVertical(Planeta alpha, Planeta beta, Planeta gamma) {
        if (alpha.getPosicionX() == beta.getPosicionX() && alpha.getPosicionX() == gamma.getPosicionX()) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean verificarAlineacionHorizontal(Planeta alpha, Planeta beta, Planeta gamma) {
        if (alpha.getPosicionY() == beta.getPosicionY() && alpha.getPosicionY() == gamma.getPosicionY()) {
            return true;
        } else {
            return false;
        }
    }
}