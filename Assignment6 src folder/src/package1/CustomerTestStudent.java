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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTestStudent {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John Doe", 25);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("John Doe", customer.getName());
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testSetters() {
        customer.setName("Jane Smith");
        customer.setAge(30);

        assertEquals("Jane Smith", customer.getName());
        assertEquals(30, customer.getAge());
    }

    @Test
    public void testCopyConstructor() {
        Customer copiedCustomer = new Customer(customer);

        // Verify that the copy has the same values
        assertEquals("John Doe", copiedCustomer.getName());
        assertEquals(25, copiedCustomer.getAge());

        // Verify that changing the original does not affect the copy
        customer.setName("Modified Name");
        customer.setAge(35);

        assertEquals("John Doe", copiedCustomer.getName());
        assertEquals(25, copiedCustomer.getAge());
    }

    @Test
    public void testToString() {
        String result = customer.toString();

        assertTrue(result.contains("John Doe"));
        assertTrue(result.contains("25"));
    }

    @Test
    public void testEquality() {
        Customer anotherCustomer = new Customer("John Doe", 25);
        Customer differentCustomer = new Customer("Jane Smith", 30);

        // Test that two customers with the same name and age are equal
        assertEquals(customer, anotherCustomer);

        // Test that two customers with different names or ages are not equal
        assertNotEquals(customer, differentCustomer);
    }


    @Test
    public void testEdgeCases() {
        // Test with edge case ages
        customer.setAge(0);
        assertEquals(0, customer.getAge());

        customer.setAge(150);
        assertEquals(150, customer.getAge());
    }
}
