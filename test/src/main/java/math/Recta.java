package math;

import modelos.Planeta;

public class Recta {
    public static Boolean verificarAlineacion(Planeta alpha, Planeta beta, Planeta gamma) {
        Double m1 = calcularPendiente(alpha.getPosicionX(), alpha.getPosicionY(), beta.getPosicionX(), beta.getPosicionY());
        Double m2 = calcularPendiente(alpha.getPosicionX(), alpha.getPosicionY(), gamma.getPosicionX(), gamma.getPosicionY());
        Double m3 = calcularPendiente(alpha.getPosicionX(), alpha.getPosicionY(), 0.0, 0.0);
        if (m1 == m2) {
            return true;
        } else if (m2 == m3) {
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
        if (Math.abs(alpha.getPosicionX()) == Math.abs(beta.getPosicionX()) && Math.abs(alpha.getPosicionX()) == (Math.abs(gamma.getPosicionX()))) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean verificarAlineacionHorizontal(Planeta alpha, Planeta beta, Planeta gamma) {
        if (Math.abs(alpha.getPosicionY()) == Math.abs(beta.getPosicionY()) && Math.abs(alpha.getPosicionY()) == (Math.abs(gamma.getPosicionY()))) {
            return true;
        } else {
            return false;
        }
    }
}
