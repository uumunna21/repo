package package1;

import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {

    /**
     * Reads a file and returns a two-dimensional ragged array of doubles.
     * @param file the input file
     * @return a two-dimensional ragged array of doubles
     * @throws FileNotFoundException if the file is not found
     */
    public static double[][] readFile(File file) throws FileNotFoundException {
        List<double[]> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(" ");
            double[] row = Arrays.stream(line).mapToDouble(Double::parseDouble).toArray();
            list.add(row);
        }
        scanner.close();

        return list.toArray(new double[0][]);
    }

    /**
     * Writes a two-dimensional ragged array of doubles to a file.
     * @param data the ragged array
     * @param file the output file
     * @throws FileNotFoundException if the file cannot be written
     */
    public static void writeToFile(double[][] data, File file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);

        for (double[] row : data) {
            for (int i = 0; i < row.length; i++) {
                writer.print(row[i]);
                if (i < row.length - 1) writer.print(" ");
            }
            writer.println();
        }
        writer.close();
    }

    public static double getTotal(double[][] data) {
        double total = 0;
        for (double[] row : data) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] data) {
        double total = getTotal(data);
        int count = 0;
        for (double[] row : data) {
            count += row.length;
        }
        return total / count;
    }

    public static double getRowTotal(double[][] data, int row) {
        double total = 0;
        for (double value : data[row]) {
            total += value;
        }
        return total;
    }

    public static double getColumnTotal(double[][] data, int col) {
        double total = 0;
        for (double[] row : data) {
            if (col < row.length) {
                total += row[col];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] data, int row) {
        return Arrays.stream(data[row]).max().orElse(Double.NaN);
    }

    public static int getHighestInRowIndex(double[][] data, int row) {
        double max = getHighestInRow(data, row);
        for (int i = 0; i < data[row].length; i++) {
            if (data[row][i] == max) return i;
        }
        return -1;
    }

    public static double getLowestInRow(double[][] data, int row) {
        return Arrays.stream(data[row]).min().orElse(Double.NaN);
    }

    public static int getLowestInRowIndex(double[][] data, int row) {
        double min = getLowestInRow(data, row);
        for (int i = 0; i < data[row].length; i++) {
            if (data[row][i] == min) return i;
        }
        return -1;
    }

    public static double getHighestInColumn(double[][] data, int col) {
        double max = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length) {
                max = Math.max(max, row[col]);
            }
        }
        return max;
    }

    public static int getHighestInColumnIndex(double[][] data, int col) {
        double max = getHighestInColumn(data, col);
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] == max) return i;
        }
        return -1;
    }

    public static double getLowestInColumn(double[][] data, int col) {
        double min = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length) {
                min = Math.min(min, row[col]);
            }
        }
        return min;
    }

    public static int getLowestInColumnIndex(double[][] data, int col) {
        double min = getLowestInColumn(data, col);
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] == min) return i;
        }
        return -1;
    }

    public static double getHighestInArray(double[][] data) {
        double max = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                max = Math.max(max, value);
            }
        }
        return max;
    }

    public static double getLowestInArray(double[][] data) {
        double min = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                min = Math.min(min, value);
            }
        }
        return min;
    }
}
