public class Caballero {

        int maldad = 0;
        int edadCuandoRecibioArmadura;
        Constelacion constelacion;

        public Caballero(int maldad, int edadCuandoRecibioArmadura, Constelacion constelacion) {
                this.maldad = maldad;
                this.edadCuandoRecibioArmadura = edadCuandoRecibioArmadura;
                this.constelacion = constelacion;
        }

        public boolean esPosibleHades(){
                return maldad > 200;
        }
        public boolean esPrecoz() {
                return edadCuandoRecibioArmadura < 12;
        }

        public boolean esCercanoAlSol() {
                return constelacion.estaCercaAlSol();
        }

        public boolean esPoderoso() {
                return esPrecoz() && constelacion.esDeOro();
        }
}
