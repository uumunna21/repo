/*
 * Class: CMSC203 
 * Instructor:Khanndan Monshi
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

