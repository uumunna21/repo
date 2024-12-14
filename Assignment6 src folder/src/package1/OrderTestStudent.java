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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTestStudent {

    private Order order;
    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John Doe", 25);
        order = new Order(10, Day.FRIDAY, customer);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals(10, order.getOrderTime());
        assertEquals(Day.FRIDAY, order.getOrderDay());
        assertEquals("John Doe", order.getCustomer().getName());
        assertEquals(25, order.getCustomer().getAge());
        assertNotNull(order.getBeverages());
        assertTrue(order.getBeverages().isEmpty());
    }

    @Test
    public void testAddNewBeverageCoffee() {
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);

        ArrayList<Beverage> beverages = order.getBeverages();
        assertEquals(1, beverages.size());
        assertTrue(beverages.get(0) instanceof Coffee);

        Coffee coffee = (Coffee) beverages.get(0);
        assertEquals("Latte", coffee.getBevName());
        assertEquals(Size.MEDIUM, coffee.getSize());
        assertTrue(coffee.isExtraShot());
        assertFalse(coffee.isExtraSyrup());
        assertEquals(3.0, coffee.calcPrice());
    }

    @Test
    public void testAddNewBeverageSmoothie() {
        order.addNewBeverage("Tropical", Size.LARGE, 2, true);

        ArrayList<Beverage> beverages = order.getBeverages();
        assertEquals(1, beverages.size());
        assertTrue(beverages.get(0) instanceof Smoothie);

        Smoothie smoothie = (Smoothie) beverages.get(0);
        assertEquals("Tropical", smoothie.getBevName());
        assertEquals(Size.LARGE, smoothie.getSize());
        assertEquals(2, smoothie.getNumOfFruits());
        assertTrue(smoothie.getAddProtein());
        assertEquals(6.0, smoothie.calcPrice());
    }

    @Test
    public void testAddNewBeverageAlcohol() {
        order.addNewBeverage("Whiskey", Size.SMALL);

        ArrayList<Beverage> beverages = order.getBeverages();
        assertEquals(1, beverages.size());
        assertTrue(beverages.get(0) instanceof Alcohol);

        Alcohol alcohol = (Alcohol) beverages.get(0);
//        assertEquals("Whiskey", alcohol.getBevName());
        assertEquals(Size.SMALL, alcohol.getSize());
        assertFalse(alcohol.isWeekend());
        assertEquals(2.0, alcohol.calcPrice());
    }

    @Test
    public void testCalcOrderTotal() {
        order.addNewBeverage("Latte", Size.MEDIUM, true, false); // $3.0
        order.addNewBeverage("Tropical", Size.LARGE, 2, true);   // $6.0
        order.addNewBeverage("Whiskey", Size.SMALL);             // $2.0

        assertEquals(11.0, order.calcOrderTotal(), 0.01);
    }

    @Test
    public void testFindNumOfBeveType() {
        order.addNewBeverage("Latte", Size.MEDIUM, true, false); // Coffee
        order.addNewBeverage("Espresso", Size.SMALL, false, false); // Coffee
        order.addNewBeverage("Whiskey", Size.SMALL);             // Alcohol
        order.addNewBeverage("Tropical", Size.LARGE, 2, true);   // Smoothie

        assertEquals(2, order.findNumOfBeveType(Type.COFFEE));
        assertEquals(1, order.findNumOfBeveType(Type.ALCOHOL));
        assertEquals(1, order.findNumOfBeveType(Type.SMOOTHIE));
    }

    @Test
    public void testCompareTo() {
        Order anotherOrder = new Order(12, Day.SATURDAY, new Customer("Jane Smith", 30));
        anotherOrder.setOrderNumber(order.getOrderNumber() + 1); // Larger order number

        assertEquals(-1, order.compareTo(anotherOrder)); // Current order < Another order
        anotherOrder.setOrderNumber(order.getOrderNumber()); // Same order number
        assertEquals(0, order.compareTo(anotherOrder));
    }

    @Test
    public void testToString() {
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        order.addNewBeverage("Tropical", Size.LARGE, 2, true);

        String result = order.toString();
        assertTrue(result.contains("Order Number:"));
        assertTrue(result.contains("Order Time: 10"));
        assertTrue(result.contains("Order Day: FRIDAY"));
        assertTrue(result.contains("John Doe"));
        assertTrue(result.contains("Latte"));
        assertTrue(result.contains("Tropical"));
        assertTrue(result.contains("Total Price: $9.00"));
    }

    @Test
    public void testDeepCopyCustomer() {
        Customer retrievedCustomer = order.getCustomer();
        retrievedCustomer.setName("Modified Name");

        // Ensure the original customer in the order is not affected
        assertEquals("John Doe", order.getCustomer().getName());
    }
}