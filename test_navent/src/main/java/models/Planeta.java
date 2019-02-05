package models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Planeta {
    private String nombre;
    private Double velocidadAngular;
    private Double distanciaDelSol;
    private Double posicionX;
    private Double posicionY;

    public Planeta(String nombre, Double velocidadAngular, Double distanciaDelSol) {
        this.nombre = nombre;
        this.velocidadAngular = velocidadAngular;
        this.distanciaDelSol = distanciaDelSol;
        this.posicionX = distanciaDelSol;
        this.posicionY = 0.00;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getVelocidadAngular() {
        return velocidadAngular;
    }

    public void setVelocidadAngular(Double velocidadAngular) {
        this.velocidadAngular = velocidadAngular;
    }

    public Double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(Double posicionX) {
        this.posicionX = posicionX;
    }

    public Double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(Double posicionY) {
        this.posicionY = posicionY;
    }

    public void desplazarse(Integer cantidadDias) {
        if (velocidadAngular < 0) {
            Double seno = Math.sin((Math.toRadians(360 - velocidadAngular * cantidadDias)));
            BigDecimal bd = new BigDecimal(seno).setScale(2, RoundingMode.HALF_UP);
            seno = bd.doubleValue();
            posicionY = (distanciaDelSol * seno);

            Double coseno = Math.cos(Math.toRadians(360 - (velocidadAngular * cantidadDias)));
            BigDecimal bd2 = new BigDecimal(coseno).setScale(2, RoundingMode.HALF_UP);
            coseno = bd2.doubleValue();
            posicionX = distanciaDelSol + (distanciaDelSol * coseno);
        } else {
            Double seno = (Math.sin(Math.toRadians(velocidadAngular) * cantidadDias));
            BigDecimal bd = new BigDecimal(seno).setScale(2, RoundingMode.HALF_UP);
            seno = bd.doubleValue();
            posicionY = (distanciaDelSol * seno);

            Double coseno = Math.cos(Math.toRadians(velocidadAngular) * cantidadDias);
            BigDecimal bd2 = new BigDecimal(coseno).setScale(2, RoundingMode.HALF_UP);
            coseno = bd2.doubleValue();
            posicionX = distanciaDelSol + (distanciaDelSol * coseno);
        }
    }
}
