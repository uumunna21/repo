package package1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {

    private double[][] data;

    @Before
    public void setUp() {
        data = new double[][]{
                {1.5, 2.0, 3.5},
                {4.0, 5.0},
                {6.0, 7.0, 8.0, 9.0}
        };
    }

    @Test
    public void testReadFile() throws FileNotFoundException {
        File file = new File("test.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.println("1.5 2.0 3.5");
        writer.println("4.0 5.0");
        writer.println("6.0 7.0 8.0 9.0");
        writer.close();

        double[][] result = TwoDimRaggedArrayUtility.readFile(file);
        assertArrayEquals(data, result);
    }

    @Test
    public void testWriteToFile() throws FileNotFoundException {
        File file = new File("output.txt");
        TwoDimRaggedArrayUtility.writeToFile(data, file);

        double[][] result = TwoDimRaggedArrayUtility.readFile(file);
        assertArrayEquals(data, result);
    }

    @Test
    public void testGetTotal() {
        assertEquals(46.0, TwoDimRaggedArrayUtility.getTotal(data), 0.001);
    }

    @Test
    public void testGetAverage() {
        assertEquals(5.111111111, TwoDimRaggedArrayUtility.getAverage(data), 0.001);
    }

    @Test
    public void testGetRowTotal() {
        assertEquals(7.0, TwoDimRaggedArrayUtility.getRowTotal(data, 0), 0.001);
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(data, 1), 0.001);
    }

    @Test
    public void testGetColumnTotal() {
        assertEquals(11.5, TwoDimRaggedArrayUtility.getColumnTotal(data, 0), 0.001);
        assertEquals(14.0, TwoDimRaggedArrayUtility.getColumnTotal(data, 1), 0.001);
    }

    @Test
    public void testGetHighestInRow() {
        assertEquals(3.5, TwoDimRaggedArrayUtility.getHighestInRow(data, 0), 0.001);
    }

    @Test
    public void testGetHighestInRowIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 0));
    }

    @Test
    public void testGetLowestInRow() {
        assertEquals(1.5, TwoDimRaggedArrayUtility.getLowestInRow(data, 0), 0.001);
    }

    @Test
    public void testGetLowestInRowIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 0));
    }

    @Test
    public void testGetHighestInColumn() {
        assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(data, 0), 0.001);
    }

    @Test
    public void testGetHighestInColumnIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, 0));
    }

    @Test
    public void testGetLowestInColumn() {
        assertEquals(1.5, TwoDimRaggedArrayUtility.getLowestInColumn(data, 0), 0.001);
    }

    @Test
    public void testGetLowestInColumnIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, 0));
    }

    @Test
    public void testGetHighestInArray() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(data), 0.001);
    }

    @Test
    public void testGetLowestInArray() {
        assertEquals(1.5, TwoDimRaggedArrayUtility.getLowestInArray(data), 0.001);
    }
}