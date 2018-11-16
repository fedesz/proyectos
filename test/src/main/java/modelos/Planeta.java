package modelos;

public class Planeta {
    private String nombre;
    private Integer velocidadAngular;
    private Integer distanciaDelSol;
    private Double posicionX;
    private Double posicionY;

    public Planeta(String nombre, Integer velocidadAngular, Integer distanciaDelSol) {
        this.nombre = nombre;
        this.velocidadAngular = velocidadAngular;
        this.distanciaDelSol = distanciaDelSol;
        this.posicionX = distanciaDelSol.doubleValue();
        this.posicionY = 0.00;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVelocidadAngular() {
        return velocidadAngular;
    }

    public void setVelocidadAngular(Integer velocidadAngular) {
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
        Double coseno = Math.cos(velocidadAngular * cantidadDias);
        posicionX = distanciaDelSol + (posicionX * coseno.intValue());

        Double seno = Math.sin(velocidadAngular * cantidadDias);
        posicionY = posicionY * seno.intValue();
    }
}
