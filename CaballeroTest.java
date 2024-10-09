import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaballeroTest {

    private Constelacion aries;
    private Constelacion escorpio;
    private Caballero seiya;
    private Caballero shun;

    @BeforeEach
    public void setUp() {
        aries = new Constelacion(900L, true);     // Cerca al sol y de oro
        escorpio = new Constelacion(700L, false); // Cerca al sol pero no de oro

        seiya = new Caballero("Seiya", 50, 10, aries);    // Precoz y de oro
        shun = new Caballero("Shun", 300, 15, escorpio);  // Posible Hades
    }

    @Test
    public void testConstructor() {
        assertEquals("Seiya", seiya.getNombre());
        assertEquals(50, seiya.getMaldad());
        assertEquals(10, seiya.getEdadCuandoRecibioArmadura());
        assertEquals(aries, seiya.getConstelacion());

        assertEquals("Shun", shun.getNombre());
        assertEquals(300, shun.getMaldad());
        assertEquals(15, shun.getEdadCuandoRecibioArmadura());
        assertEquals(escorpio, shun.getConstelacion());
    }

    @Test
    public void testEsPosibleHades() {
        assertFalse(seiya.esPosibleHades());
        assertTrue(shun.esPosibleHades());
    }

    @Test
    public void testEsPrecoz() {
        assertTrue(seiya.esPrecoz());
        assertFalse(shun.esPrecoz());
    }

    @Test
    public void testEsCercanoAlSol() {
        assertTrue(seiya.esCercanoAlSol());
        assertTrue(shun.esCercanoAlSol());
    }

    @Test
    public void testEsPoderoso() {
        assertTrue(seiya.esPoderoso());
        assertFalse(shun.esPoderoso());
    }

}
