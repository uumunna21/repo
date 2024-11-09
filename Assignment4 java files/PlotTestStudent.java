package package1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlotTestStudent {

    @Test
    void testConstructorAndGetters() {
        Plot plot = new Plot(1, 2, 3, 4);
        assertEquals(1, plot.getX());
        assertEquals(2, plot.getY());
        assertEquals(3, plot.getWidth());
        assertEquals(4, plot.getDepth());
    }

    @Test
    void testSetters() {
        Plot plot = new Plot();
        plot.setX(5);
        plot.setY(6);
        plot.setWidth(7);
        plot.setDepth(8);
        assertEquals(5, plot.getX());
        assertEquals(6, plot.getY());
        assertEquals(7, plot.getWidth());
        assertEquals(8, plot.getDepth());
    }

    @Test
    void testOverlaps() {
        Plot plot1 = new Plot(0, 0, 5, 5);
        Plot plot2 = new Plot(3, 3, 5, 5);
        assertTrue(plot1.overlaps(plot2));
        
        Plot plot3 = new Plot(10, 10, 5, 5);
        assertFalse(plot1.overlaps(plot3));
    }

    @Test
    void testEncompasses() {
        Plot plot1 = new Plot(0, 0, 10, 10);
        Plot plot2 = new Plot(1, 1, 5, 5);
        assertTrue(plot1.encompasses(plot2));
        
        Plot plot3 = new Plot(5, 5, 10, 10);
        assertFalse(plot1.encompasses(plot3));
    }

    @Test
    void testToString() {
        Plot plot = new Plot(1, 2, 3, 4);
        assertEquals("1,2,3,4", plot.toString());
    }
}
