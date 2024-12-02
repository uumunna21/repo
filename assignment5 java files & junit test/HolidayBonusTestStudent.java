package package1;

import static org.junit.jupiter.api.Assertions.*;\

import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;
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
        assertEquals(10000.0, bonuses[0], 0.001);
        assertEquals(8000.0, bonuses[1], 0.001);
        assertEquals(16000.0, bonuses[2], 0.001);
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
        assertEquals(5000.0, bonuses[1], 0.001);
        assertEquals(16000.0, bonuses[2], 0.001);
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double[][] sales = {
                {1.5, 2.0, 3.5},
                {4.0, 5.0},
                {6.0, 7.0, 8.0, 9.0}
        };

        double totalBonus = HolidayBonus.calculateTotalHolidayBonus(sales);
        assertEquals(34000.0, totalBonus, 0.001);
    }

    @Test
    public void testCalculateTotalHolidayBonusNegativeValues() {
        double[][] sales = {
                {-1.5, 2.0, -3.5},
                {4.0, -5.0},
                {6.0, 7.0, 8.0, 9.0}
        };

        double totalBonus = HolidayBonus.calculateTotalHolidayBonus(sales);
        assertEquals(23000.0, totalBonus, 0.001);
    }
}

