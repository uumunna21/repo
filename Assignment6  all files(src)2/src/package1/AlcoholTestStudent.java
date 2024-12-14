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

class AlcoholTestStudent {

    @Test
    void testConstructor() {
        // Create an instance of Alcohol
        Alcohol alcohol = new Alcohol("Whiskey", Size.LARGE, true);

        // Verify that the name is correct
        assertEquals("Whiskey", alcohol.getName());

        // Verify that the size is correct
        assertEquals(Size.LARGE, alcohol.getSize());

        // Verify that the offeredOnWeekend flag is correct
        assertTrue(alcohol.isWeekend());
    }

    @Test
    void testCalcPrice() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        
        // Verify that the calculated price is correct.
        // Assuming BASE_PRICE + SIZE_PRICE for MEDIUM + WEEKEND_PRICE
        assertEquals(3.1, alcohol.calcPrice(), 0.01);
    }

    @Test
    void testToString() {
        Alcohol alcohol = new Alcohol("Vodka", Size.SMALL, false);

        // Verify that the toString contains expected values.
        assertTrue(alcohol.toString().contains("Vodka"));
        assertTrue(alcohol.toString().contains("SMALL"));
        assertTrue(alcohol.toString().contains("Weekend: false"));
    }

    @Test
    void testEquals() {
        Alcohol alcohol1 = new Alcohol("Wine", Size.LARGE, true);
        Alcohol alcohol2 = new Alcohol("Wine", Size.LARGE, true);

        // Verify that two equal alcohol objects are considered equal.
        assertTrue(alcohol1.equals(alcohol2));
    }
}
