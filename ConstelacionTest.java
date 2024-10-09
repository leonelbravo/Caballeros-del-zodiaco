import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConstelacionTest {

    private Constelacion leo;
    private Constelacion piscis;

    @BeforeEach
    public void setUp() {
        leo = new Constelacion(500L, true);     // Cerca al sol y de oro
        piscis = new Constelacion(1500L, false); // Lejos del sol y no de oro
    }

    @Test
    public void testConstructor() {
        assertEquals(500L, leo.getDistanciaDelSol());
        assertTrue(leo.isEnBandaCeleste());

        assertEquals(1500L, piscis.getDistanciaDelSol());
        assertFalse(piscis.isEnBandaCeleste());
    }

    @Test
    public void testEstaCercaAlSol() {
        assertTrue(leo.estaCercaAlSol());
        assertFalse(piscis.estaCercaAlSol());
    }

    @Test
    public void testEsDeOro() {
        assertTrue(leo.esDeOro());
        assertFalse(piscis.esDeOro());
    }

    @Test
    public void testSetDistanciaDelSol() {
        leo.setDistanciaDelSol(800L);
        assertEquals(800L, leo.getDistanciaDelSol());
        assertTrue(leo.estaCercaAlSol());

        piscis.setDistanciaDelSol(900L);
        assertEquals(900L, piscis.getDistanciaDelSol());
        assertTrue(piscis.estaCercaAlSol());
    }

    @Test
    public void testSetEnBandaCeleste() {
        piscis.setEnBandaCeleste(true);
        assertTrue(piscis.esDeOro());

        leo.setEnBandaCeleste(false);
        assertFalse(leo.esDeOro());
    }
}