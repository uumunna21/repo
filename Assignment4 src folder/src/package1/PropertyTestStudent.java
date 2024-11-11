/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Write a property management application
 * Due: 11/11/2024
 * Platform/compiler: Eclipse.
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ugonna Umunna.
*/


package package1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropertyTestStudent {

    @Test
    void testConstructorAndGetters() {
        Property property = new Property("Green Acres", "Baltimore", 1200.0, "John Doe");
        assertEquals("Green Acres", property.getPropertyName());
        assertEquals("Baltimore", property.getCity());
        assertEquals(1200.0, property.getRentAmount(), 0.01);
        assertEquals("John Doe", property.getOwner());
    }

    @Test
    void testSetters() {
        Property property = new Property();
        property.setPropertyName("Green Acres");
        property.setCity("Baltimore");
        property.setRentAmount(1200.0);
        property.setOwner("John Doe");
        assertEquals("Green Acres", property.getPropertyName());
        assertEquals("Baltimore", property.getCity());
        assertEquals(1200.0, property.getRentAmount(), 0.01);
        assertEquals("John Doe", property.getOwner());
    }

    @Test
    void testToString() {
        Property property = new Property("Green Acres", "Baltimore", 1200.0, "John Doe");
        assertEquals("Green Acres,Baltimore,John Doe,1200.0", property.toString());
    }

    @Test
    void testPlotConstructor() {
        Property property = new Property("Green Acres", "Baltimore", 1200.0, "John Doe", 1, 2, 3, 4);
        assertEquals("1,2,3,4", property.getPlot().toString());
    }
}

