public class Caballero {

        private String nombre;
        private int maldad;
        private int edadCuandoRecibioArmadura;
        private Constelacion constelacion;


        public Caballero(String nombre, int maldad, int edadCuandoRecibioArmadura, Constelacion constelacion) {
                this.nombre = nombre;
                this.maldad = maldad;
                this.edadCuandoRecibioArmadura = edadCuandoRecibioArmadura;
                this.constelacion = constelacion;
        }

        public boolean esPosibleHades() {
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

        // Getters y Setters
        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public int getMaldad() {
                return maldad;
        }

        public void setMaldad(int maldad) {
                this.maldad = maldad;
        }

        public int getEdadCuandoRecibioArmadura() {
                return edadCuandoRecibioArmadura;
        }

        public void setEdadCuandoRecibioArmadura(int edadCuandoRecibioArmadura) {
                this.edadCuandoRecibioArmadura = edadCuandoRecibioArmadura;
        }

        public Constelacion getConstelacion() {
                return constelacion;
        }

        public void setConstelacion(Constelacion constelacion) {
                this.constelacion = constelacion;
        }
}
