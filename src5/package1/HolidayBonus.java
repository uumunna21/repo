/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Create two classes, one that manipulates a two-dimensional ragged 
 * array of doubles and one that will calculate holiday bonuses given a ragged array 
 * of doubles.
 * Due: 12/03/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ugonna Umunna.
*/



package package1;

public class HolidayBonus {

    public static final double HIGHEST_BONUS = 5000.0;
    public static final double LOWEST_BONUS = 1000.0;
    public static final double OTHER_BONUS = 2000.0;

    public static double[] calculateHolidayBonus(double[][] sales) {
        double[] bonuses = new double[sales.length];

        int maxColumns = 0;
        for (double[] row : sales) {
            maxColumns = Math.max(maxColumns, row.length);
        }
        
        double bonusEachItem = 0;
        double bonusEachStore = 0;

        for (int row = 0; row < sales.length; row++) {
        	bonusEachStore = 0;
            
            
            for (int col = 0; col < sales[row].length; col++) {
            	 double highest = TwoDimRaggedArrayUtility.getHighestInColumn(sales, col);
                 double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(sales, col);
                if (col < sales[row].length && sales[row][col] > 0) {
                    if (sales[row][col] == highest) {
                    	bonusEachItem = HIGHEST_BONUS;
                    } else if (sales[row][col] == lowest) {
                    	bonusEachItem = LOWEST_BONUS;
                    } 
                    else if (sales[row][col] < 0)
                    {
                    	bonusEachItem = 0;
                    } 
                    else {
                    	bonusEachItem = OTHER_BONUS;
                    }
                    bonusEachStore += bonusEachItem;
                    
                    
                }
            }
            
            bonuses[row] = bonusEachStore; 
        }

        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] sales) {
        double[] bonuses = calculateHolidayBonus(sales);
        double total = 0;
        for (double bonus : bonuses) {
            total += bonus;
        }
        return total;
    }
}
