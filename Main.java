import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creando constelaciones
        Constelacion leo = new Constelacion(500L, true);         // Constelación de oro y cercana al sol
        Constelacion piscis = new Constelacion(1500L, false);   // Constelación no cercana ni de oro
        Constelacion aries = new Constelacion(900L, true);      // Constelación de oro y cercana
        Constelacion escorpio = new Constelacion(700L, false);  // Constelación cercana, pero no de oro

        // Creando caballeros
        Caballero seiya = new Caballero("Seiya", 50, 10, leo);        // Precoz y de oro
        Caballero shun = new Caballero("Shun", 300, 15, piscis);      // Posible Hades
        Caballero shiryu = new Caballero("Shiryu", 180, 11, aries);  // Precoz y de oro
        Caballero ikki = new Caballero("Ikki", 80, 18, escorpio);     // Cercano al sol, pero no precoz ni de oro
        Caballero hyoga = new Caballero("Hyoga", 20, 9, piscis);       // Precoz, pero no de oro

        // Creo santuario y añado los caballeros
        Santuario santuario = new Santuario();
        santuario.losCaballeros.add(seiya);
        santuario.losCaballeros.add(shun);
        santuario.losCaballeros.add(shiryu);
        santuario.losCaballeros.add(ikki);
        santuario.losCaballeros.add(hyoga);

        // 1. Verificar si hay un posible Hades y mostrar "True" o "False"
        boolean posibleHades = santuario.hayUnPosibleHades();
        System.out.println("¿Hay un posible Hades?: " + (posibleHades ? "True" : "False"));

        // 2. Obtener los caballeros con constelaciones cercanas al sol
        List<Caballero> cercanosAlSol = santuario.caballerosCercanosAlSol();
        System.out.println("Caballeros cercanos al sol: ");
        for (Caballero c : cercanosAlSol) {
            System.out.println(" - " + c.getNombre() + " con constelación a " + c.getConstelacion().getDistanciaDelSol() + " años luz");
        }

        // 3. Cantidad de caballeros precoces
        System.out.println("Cantidad de caballeros precoces: " + santuario.cantidadDeCaballerosPrecoces());

        // 4. Obtener los caballeros más poderosos
        List<Caballero> poderosos = santuario.caballerosMasPoderosos();
        System.out.println("Caballeros más poderosos: ");
        for (Caballero c : poderosos) {
            System.out.println(" - " + c.getNombre());
        }
    }
}
