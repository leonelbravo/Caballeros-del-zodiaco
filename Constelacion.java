public class Constelacion {

    private Long distanciaDelSol;
    private boolean enBandaCeleste;

    public Constelacion(Long distanciaDelSol, boolean enBandaCeleste) {
        this.distanciaDelSol = distanciaDelSol;
        this.enBandaCeleste = enBandaCeleste;
    }

    public boolean estaCercaAlSol() {
        return distanciaDelSol < 1000;
    }

    public boolean esDeOro() {
        return enBandaCeleste;
    }

    // Getters y Setters
    public Long getDistanciaDelSol() {
        return distanciaDelSol;
    }

    public void setDistanciaDelSol(Long distanciaDelSol) {
        this.distanciaDelSol = distanciaDelSol;
    }

    public boolean isEnBandaCeleste() {
        return enBandaCeleste;
    }

    public void setEnBandaCeleste(boolean enBandaCeleste) {
        this.enBandaCeleste = enBandaCeleste;
    }
}
