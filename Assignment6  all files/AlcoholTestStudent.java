package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {

    @Test
    void testConstructor() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.LARGE, true);
        assertEquals("Whiskey", alcohol.getName());
        assertEquals(Size.LARGE, alcohol.getSize());
        assertTrue(alcohol.isWeekend());
    }

    @Test
    void testCalcPrice() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        assertEquals(3.1, alcohol.calcPrice(), 0.01);
    }

    @Test
    void testToString() {
        Alcohol alcohol = new Alcohol("Vodka", Size.SMALL, false);
        assertTrue(alcohol.toString().contains("Vodka"));
        assertTrue(alcohol.toString().contains("SMALL"));
        assertTrue(alcohol.toString().contains("Weekend: false"));
    }

    @Test
    void testEquals() {
        Alcohol alcohol1 = new Alcohol("Wine", Size.LARGE, true);
        Alcohol alcohol2 = new Alcohol("Wine", Size.LARGE, true);
        assertTrue(alcohol1.equals(alcohol2));
    }
}

