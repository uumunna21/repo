/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description:  Implement a software for a beverage shop that automates the order transactions and reports 
 * Due:  12/15/2024 
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ugonna Umunna
*/

package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

    @Test
    void testConstructor() {
        Coffee coffee = new Coffee("Latte", Size.MEDIUM, true, true);
        assertEquals("Latte", coffee.getName());            // Check the name
        assertEquals(Size.MEDIUM, coffee.getSize());        // Check the size
        assertTrue(coffee.hasExtraShot());                  // Check if it has extra shot
        assertTrue(coffee.hasExtraSyrup());                 // Check if it has extra syrup
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
