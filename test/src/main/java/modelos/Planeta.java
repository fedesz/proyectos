package modelos;

import java.text.DecimalFormat;

public class Planeta {
    private String nombre;
    private Decimal velocidadAngular;
    private Decimal distanciaDelSol;
    private Decimal posicionX;
    private Decimal posicionY;

    public Planeta(String nombre, Decimal velocidadAngular, Decimal distanciaDelSol) {
        this.nombre = nombre;
        this.velocidadAngular = velocidadAngular;
        this.distanciaDelSol = distanciaDelSol;
        this.posicionX = distanciaDelSol.doubleValue();
        this.posicionY = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Decimal getVelocidadAngular() {
        return velocidadAngular;
    }

    public void setVelocidadAngular(Decimal velocidadAngular) {
        this.velocidadAngular = velocidadAngular;
    }

    public Decimal getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(Decimal posicionX) {
        this.posicionX = posicionX;
    }

    public Decimal getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(Decimal posicionY) {
        this.posicionY = posicionY;
    }

    public void desplazarse(Integer cantidadDias) {
        DecimalFormat numberFormat = new DecimalFormat("#,00");
        if (velocidadAngular < 0) {
            Decimal seno = Math.sin(360 - (velocidadAngular * cantidadDias));
            seno = numberFormat.format(seno.doubleValue());
            posicionY = numberFormat.format(posicionY = distanciaDelSol * seno));

            Decimal coseno = Math.cos(360 - (velocidadAngular * cantidadDias));
            coseno = numberFormat.format(coseno.doubleValue());
            posicionX = numberFormat.format(distanciaDelSol + (distanciaDelSol * coseno.doubleValue()));
        } else {
            Decimal seno = Math.sin(velocidadAngular * cantidadDias);
            seno = numberFormat.format(seno);
            posicionY = numberFormat.format(distanciaDelSol * seno);

            Decimal coseno = Math.cos(velocidadAngular * cantidadDias);
            coseno = numberFormat.format(coseno.doubleValue());
            posicionX = numberFormat.format(distanciaDelSol + (distanciaDelSol * coseno.doubleValue()));
        }
    }
}
