package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class LiquidTest {

    @Test
    void testConstructor() {
        Liquid l = new Liquid("Anok", 0.3, 0.5);

        assertEquals("Anok", l.getName());
        assertEquals(0.3, l.getVolume());
        assertEquals(0.5, l.getAlcoholPercent());
    }

    @Test
    void testConstructorInvalidNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Liquid(null, 6.0, 1.0);
        });
    }

    @Test
    void testConstructorInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Liquid("", 6.0, 1.0);
        });
    }

    @Test
    void testConstructorInvalidVolume() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Liquid("Anok", -5.0, 3.0);
        });
    }

    @Test
    void testConstructorInvalidAlcoholPercentage() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Liquid("Anok", 5.0, 111.0);
        });
    }

    @Test
    void testSetNameValid() {
        Liquid l = new Liquid("Maggus", 0.3, 0.5);
        l.setName("Casp");
        assertEquals("Casp", l.getName());
    }

    @Test
    void testSetNameNull() {
        Liquid l = new Liquid("Maggus", 0.3, 0.5);
        assertThrows(IllegalArgumentException.class, () -> {
            l.setName(null);
        });

    }

    @Test
    void testSetNameInvalid() {
        Liquid l = new Liquid("Maggus", 0.3, 0.5);
        assertThrows(IllegalArgumentException.class, () -> {
            l.setName("");
        });
    }

    @Test
    void testSetVolumeValid() {
        Liquid l = new Liquid("Chianti", 1.0, 20.0);
        l.setVolume(0.3);
        assertEquals(0.3, l.getVolume());
    }

    @Test
    void testSetVolumeInvalid() {
        Liquid l = new Liquid("Chianti", 1.0, 20.0);

        assertThrows(IllegalArgumentException.class, () -> {
            l.setVolume(-5.0);
        });
    }

    @Test
    void testSetAlcoholValid() {
        Liquid l = new Liquid("Vermuth", 0.4, 55.0);
        l.setAlcoholPercent(0.34);
        assertEquals(0.34, l.getAlcoholPercent());
    }

    @Test
    void testSetAlcoholInvalid() {
        Liquid l = new Liquid("Vermuth", 0.4, 55.0);
        assertThrows(IllegalArgumentException.class, () -> {
            l.setAlcoholPercent(102.0);
        });
    }

}
