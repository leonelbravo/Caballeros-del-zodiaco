// Archivo: SantuarioTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SantuarioTest {

    private Santuario santuario;
    private Constelacion leo;
    private Constelacion piscis;
    private Constelacion aries;
    private Constelacion escorpio;
    private Caballero seiya;
    private Caballero shun;
    private Caballero shiryu;
    private Caballero ikki;
    private Caballero hyoga;

    @BeforeEach
    public void setUp() {
        leo = new Constelacion(500L, true);       // Constelación de oro y cercana al sol
        piscis = new Constelacion(1500L, false); // Constelación no cercana ni de oro
        aries = new Constelacion(900L, true);    // Constelación de oro y cercana
        escorpio = new Constelacion(700L, false);// Constelación cercana, pero no de oro

        seiya = new Caballero("Seiya", 50, 10, leo);         // Precoz y de oro
        shun = new Caballero("Shun", 300, 15, piscis);       // Posible Hades
        shiryu = new Caballero("Shiryu", 180, 11, aries);   // Precoz y de oro
        ikki = new Caballero("Ikki", 80, 18, escorpio);      // Cercano al sol, pero no precoz ni de oro
        hyoga = new Caballero("Hyoga", 20, 9, piscis);        // Precoz, pero no de oro

        santuario = new Santuario();
        santuario.losCaballeros.add(seiya);
        santuario.losCaballeros.add(shun);
        santuario.losCaballeros.add(shiryu);
        santuario.losCaballeros.add(ikki);
        santuario.losCaballeros.add(hyoga);
    }

    @Test
    public void testHayUnPosibleHades() {
        assertTrue(santuario.hayUnPosibleHades());

    }

    @Test
    public void testCaballerosCercanosAlSol() {
        List<Caballero> cercanos = santuario.caballerosCercanosAlSol();
        assertEquals(3, cercanos.size());
        assertTrue(cercanos.contains(seiya));
        assertTrue(cercanos.contains(shiryu));
        assertTrue(cercanos.contains(ikki));
    }

    @Test
    public void testCantidadDeCaballerosPrecoces() {
        assertEquals(3, santuario.cantidadDeCaballerosPrecoces());

    }

    @Test
    public void testCaballerosMasPoderosos() {
        List<Caballero> poderosos = santuario.caballerosMasPoderosos();
        assertEquals(2, poderosos.size());
        assertTrue(poderosos.contains(seiya));
        assertTrue(poderosos.contains(shiryu));

    }

    @Test
    public void testAgregarCaballero() {
        Caballero saga = new Caballero("Saga", 250, 14, leo); // Posible Hades
        santuario.losCaballeros.add(saga);
        assertTrue(santuario.hayUnPosibleHades());
        assertEquals(6, santuario.losCaballeros.size());
    }

    @Test
    public void testEliminarCaballero() {
        santuario.losCaballeros.remove(seiya);
        assertEquals(4, santuario.losCaballeros.size());
        List<Caballero> poderosos = santuario.caballerosMasPoderosos();
        assertEquals(1, poderosos.size());
    }
}
