package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

    @Test
    void testConstructor() {
        Coffee coffee = new Coffee("Latte", Size.MEDIUM, true, true);
        assertEquals("Latte", coffee.getName());
        assertEquals(Size.MEDIUM, coffee.getSize());
        assertTrue(coffee.hasExtraShot());
        assertTrue(coffee.hasExtraSyrup());
    }

    @Test
    void testCalcPrice() {
        Coffee coffee = new Coffee("Latte", Size.MEDIUM, true, true);
        assertEquals(3.5, coffee.calcPrice(), 0.01);
    }

    @Test
    void testToString() {
        Coffee coffee = new Coffee("Latte", Size.LARGE, true, false);
        assertTrue(coffee.toString().contains("Latte"));
        assertTrue(coffee.toString().contains("LARGE"));
        assertTrue(coffee.toString().contains("Extra Shot: true"));
        assertTrue(coffee.toString().contains("Extra Syrup: false"));
    }

    @Test
    void testEquals() {
        Coffee coffee1 = new Coffee("Espresso", Size.SMALL, false, false);
        Coffee coffee2 = new Coffee("Espresso", Size.SMALL, false, false);
        assertTrue(coffee1.equals(coffee2));
    }
}
