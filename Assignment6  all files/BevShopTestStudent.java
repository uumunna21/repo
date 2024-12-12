package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
        shop.startNewOrder(9, Day.SATURDAY, "Alice", 30);
        shop.processCoffeeOrder("Latte", Size.MEDIUM, true, false);
        shop.startNewOrder(11, Day.SUNDAY, "Bob", 25);
        shop.processSmoothieOrder("Tropical", Size.LARGE, 2, true);
        assertEquals(9.0, shop.totalMonthlySale(), 0.01);
    }
}

