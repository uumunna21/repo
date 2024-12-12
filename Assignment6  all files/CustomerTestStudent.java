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

        assertEquals(customer, anotherCustomer);
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
