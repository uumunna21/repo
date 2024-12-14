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

class BeverageTestStudent {

    @Test
    void testAddSizePrice() {
        Coffee smallCoffee = new Coffee("Espresso", Size.SMALL, false, false);
        Coffee mediumCoffee = new Coffee("Latte", Size.MEDIUM, false, false);
        Coffee largeCoffee = new Coffee("Mocha", Size.LARGE, false, false);

        assertEquals(2.0, smallCoffee.calcPrice());
        assertEquals(2.5, mediumCoffee.calcPrice());
        assertEquals(3.0, largeCoffee.calcPrice());
    }

    @Test
    void testToString() {
        Coffee coffee = new Coffee("Espresso", Size.SMALL, false, false);
        assertTrue(coffee.toString().contains("Espresso"));
        assertTrue(coffee.toString().contains("SMALL"));
    }

    @Test
    void testEquals() {
        Coffee coffee1 = new Coffee("Latte", Size.LARGE, true, true);
        Coffee coffee2 = new Coffee("Latte", Size.LARGE, true, true);
        assertTrue(coffee1.equals(coffee2));
    }
}

