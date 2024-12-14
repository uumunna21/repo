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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {
    private BevShop shop;

    @BeforeEach
    void setUp() {
        shop = new BevShop();
    }

    @Test
    void testStartNewOrder() {
        shop.startNewOrder(9, Day.SATURDAY, "Alice", 30);
        assertEquals(1, shop.totalNumOfMonthlyOrders());
    }

    @Test
    void testProcessAlcoholOrder() {
        shop.startNewOrder(9, Day.SATURDAY, "Bob", 25);
        shop.processAlcoholOrder("Wine", Size.SMALL);
        assertEquals(1, shop.getOrderAtIndex(0).getBeverages().size());
    }

    @Test
    void testTotalMonthlySale() {
        // First order: Coffee
        shop.startNewOrder(9, Day.SATURDAY, "Alice", 30);
        shop.processCoffeeOrder("Latte", Size.MEDIUM, true, false);  // $3.0

        // Second order: Smoothie
        shop.startNewOrder(11, Day.SUNDAY, "Bob", 25);
        shop.processSmoothieOrder("Tropical", Size.LARGE, 2, true);  // $6.0

        // Verify that the total monthly sale is the sum of the individual prices
        assertEquals(9.0, shop.totalMonthlySale(), 0.01);  // 3.0 + 6.0 = 9.0
    }
}
