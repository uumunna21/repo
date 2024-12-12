package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {

    @Test
    void testConstructor() {
        Smoothie smoothie = new Smoothie("Berry Blast", Size.LARGE, 3, true);
        assertEquals("Berry Blast", smoothie.getName());
        assertEquals(Size.LARGE, smoothie.getSize());
        assertEquals(3, smoothie.getNumOfFruits());
        assertTrue(smoothie.addProtein());
    }

    @Test
    void testCalcPrice() {
        Smoothie smoothie = new Smoothie("Berry Blast", Size.MEDIUM, 2, true);
        assertEquals(5.5, smoothie.calcPrice(), 0.01);
    }

    @Test
    void testToString() {
        Smoothie smoothie = new Smoothie("Tropical", Size.SMALL, 1, false);
        assertTrue(smoothie.toString().contains("Tropical"));
        assertTrue(smoothie.toString().contains("SMALL"));
        assertTrue(smoothie.toString().contains("Number of Fruits: 1"));
        assertTrue(smoothie.toString().contains("Protein Powder: false"));
    }

    @Test
    void testEquals() {
        Smoothie smoothie1 = new Smoothie("Mango Delight", Size.LARGE, 2, true);
        Smoothie smoothie2 = new Smoothie("Mango Delight", Size.LARGE, 2, true);
        assertTrue(smoothie1.equals(smoothie2));
    }
}

