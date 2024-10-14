package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

    GradeBook gradeBook1;
    GradeBook gradeBook2;

    @BeforeEach
    void setUp() throws Exception {
        // Create two GradeBook objects
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        // Add scores to gradeBook1
        gradeBook1.addScore(85.5);
        gradeBook1.addScore(92.0);

        // Add scores to gradeBook2
        gradeBook2.addScore(78.0);
        gradeBook2.addScore(88.5);
    }

    @AfterEach
    void tearDown() throws Exception {
        // Set the GradeBook objects to null
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    void testAddScore() {
    	// Add scores to the GradeBook
        assertTrue(gradeBook1.addScore(78.5));

        // Check the string representation of the scores in the GradeBook
        assertEquals("85.5 92.0 78.5", gradeBook1.toString());

        // Check the number of scores added
        assertEquals(3, gradeBook1.getScoreSize());
    }

    @Test
    void testSum() {
    	// Add scores to the GradeBook
        gradeBook1.addScore(78.5);

        // Check if the sum of the scores is correct
        assertEquals(256.0, gradeBook1.sum());
    }

    @Test
    void testMinimum() {
    	// Add scores to the GradeBook
        gradeBook1.addScore(85.5);
        gradeBook1.addScore(92.0);
        gradeBook1.addScore(78.5);

        // Check if the minimum score is correct
        assertEquals(78.5, gradeBook1.minimum(), 0.001);
    }

    @Test
    void testFinalScore() {
    	// Test case with no scores
        //assertEquals(0, gradeBook2.finalScore());

        // Add scores to the GradeBook
        gradeBook2.addScore(85.5);
        assertEquals(174.0, gradeBook2.finalScore());  

        

        // Check if the final score (sum with the lowest score dropped) is correct
        assertEquals(174.0, gradeBook2.finalScore(), 0.001);
    }

    @Test
    void testGetScoreSize() {
    	assertEquals(2, gradeBook2.getScoreSize());
    }

    @Test
    void testToString() {
    	assertEquals("78.0 88.5", gradeBook2.toString());
    }
}

