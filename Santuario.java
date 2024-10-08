import java.util.ArrayList;
import java.util.List;

public class Santuario {
    List<Caballero> losCaballeros = new ArrayList<>();

    public boolean hayUnPosibleHades(){
        for (Caballero c : losCaballeros){
            if(c.esPosibleHades())
                return true;
        }
        return false;
    }
    public List<Caballero> caballerosCercanosAlSol() {
        List<Caballero> cercanosAlSol = new ArrayList<>();
        for (Caballero c : losCaballeros) {
            if (c.esCercanoAlSol())
                cercanosAlSol.add(c);
        }
        return cercanosAlSol;
    }

    public int cantidadDeCaballerosPrecoces() {
        int contador = 0;
        for (Caballero c : losCaballeros) {
            if (c.esPrecoz())
                contador++;
        }
        return contador;
    }

    public List<Caballero> caballerosMasPoderosos() {
        List<Caballero> poderosos = new ArrayList<>();
        for (Caballero c : losCaballeros) {
            if (c.esPoderoso())
                poderosos.add(c);
        }
        return poderosos;
    }
}
