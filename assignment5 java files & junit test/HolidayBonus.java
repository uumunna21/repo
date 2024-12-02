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

        for (int col = 0; col < maxColumns; col++) {
            double highest = TwoDimRaggedArrayUtility.getHighestInColumn(sales, col);
            double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(sales, col);

            for (int row = 0; row < sales.length; row++) {
                if (col < sales[row].length && sales[row][col] > 0) {
                    if (sales[row][col] == highest) {
                        bonuses[row] += HIGHEST_BONUS;
                    } else if (sales[row][col] == lowest) {
                        bonuses[row] += LOWEST_BONUS;
                    } else {
                        bonuses[row] += OTHER_BONUS;
                    }
                }
            }
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
