/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Create two classes, one that manipulates a two-dimensional ragged 
 * array of doubles and one that will calculate holiday bonuses given a ragged array 
 * of doubles.
 * Due: 12/03/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ugonna Umunna.
*/




package package1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HolidayBonusTestStudent {

    @Test
    public void testCalculateHolidayBonus() {
        double[][] sales = {
                {1.5, 2.0, 3.5},
                {4.0, 5.0},
                {6.0, 7.0, 8.0, 9.0}
        };

        double[] bonuses = HolidayBonus.calculateHolidayBonus(sales);

        // Store-wise bonuses
        assertEquals(3000.0, bonuses[0], 0.001);
        assertEquals(4000.0, bonuses[1], 0.001);
        assertEquals(20000.0, bonuses[2], 0.001);
    }

    @Test
    public void testCalculateHolidayBonusNegativeValues() {
        double[][] sales = {
                {-1.5, 2.0, -3.5},
                {4.0, -5.0},
                {6.0, 7.0, 8.0, 9.0}
        };

        double[] bonuses = HolidayBonus.calculateHolidayBonus(sales);

        // Store-wise bonuses
        assertEquals(2000.0, bonuses[0], 0.001);
        assertEquals(2000.0, bonuses[1], 0.001);
        assertEquals(20000.0, bonuses[2], 0.001);
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double[][] sales = {
                {1.5, 2.0, 3.5}, //3000
                {4.0, 5.0}, //4000
                {6.0, 7.0, 8.0, 9.0} //20000
        };

        double totalBonus = HolidayBonus.calculateTotalHolidayBonus(sales);
        assertEquals(27000.0, totalBonus, 0.001);
    }

    @Test
    public void testCalculateTotalHolidayBonusNegativeValues() {
        double[][] sales = {
                {-1.5, 2.0, -3.5}, //2000 
                {4.0, -5.0}, //2000
                {6.0, 7.0, 8.0, 9.0} //20000
        };

        double totalBonus = HolidayBonus.calculateTotalHolidayBonus(sales);
        assertEquals(24000.0, totalBonus, 0.001);
    }
}
