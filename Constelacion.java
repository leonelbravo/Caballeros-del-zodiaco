public class Constelacion {

    Long distanciaDelSol;
    boolean enBandaCeleste;

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
}
