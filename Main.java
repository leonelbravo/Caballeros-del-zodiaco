import java.util.List;

public class Main {
    public static void main(String[] args) {
        Constelacion leo = new Constelacion(500L, true);   // Constelación de oro y cercana al sol
        Constelacion piscis = new Constelacion(1500L, false); // Constelación no cercana ni de oro
        Constelacion aries = new Constelacion(900L, true); // Constelación de oro y cercana
        Constelacion escorpio = new Constelacion(700L, false); // Constelación cercana, pero no de oro

        Caballero seiya = new Caballero(50, 10, leo);       // Precoz y de oro
        Caballero shun = new Caballero(300, 15, piscis);    // Posible Hades
        Caballero shiryu = new Caballero(180, 11, aries);   // Precoz y de oro
        Caballero ikki = new Caballero(80, 18, escorpio);   // Cercano al sol, pero no precoz ni de oro
        Caballero hyoga = new Caballero(20, 9, piscis);     // Precoz, pero no de oro

        Santuario santuario = new Santuario();
        santuario.losCaballeros.add(seiya);
        santuario.losCaballeros.add(shun);
        santuario.losCaballeros.add(shiryu);
        santuario.losCaballeros.add(ikki);
        santuario.losCaballeros.add(hyoga);

        // 1. Verificar si hay un posible Hades
        santuario.hayUnPosibleHades();

        // 2. Obtener los caballeros con constelaciones cercanas al sol
        List<Caballero> cercanosAlSol = santuario.caballerosCercanosAlSol();
        for (Caballero c : cercanosAlSol) {
            System.out.println(" - Caballero con constelación cercana: " + c.constelacion.distanciaDelSol + " años luz");
        }

        // 3. Cantidad de caballeros precoces
        santuario.cantidadDeCaballerosPrecoces();

        // 4. Obtener los caballeros más poderosos
        List<Caballero> poderosos = santuario.caballerosMasPoderosos();
        for (Caballero c : poderosos) {
            System.out.println(" - Caballero precoz y de oro");
        }
    }
}