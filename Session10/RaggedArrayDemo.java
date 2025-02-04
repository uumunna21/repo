package Session10;

import java.util.Random;

public class RaggedArrayDemo {

	public static void main(String[] args) 
	{
		int[][] matrix = new int[3][];
		
		matrix[0] = new int[3];
		matrix[1] = new int[2];
		matrix[2] = new int[4]; 
		
//		int[][] matrix = {{2,4,6}, {8,10}, {12,14,16,18}};		
		System.out.println(matrix[1][1]);
		System.out.println(matrix[2].length);
		
	}

	public static int[][] generateRaggedArray(int numRows, int maxColums)
	{
		int [][] rArray = new int[numRows][];
		Random rand = new Random();
		for(int row = 0; row < numRows; row++)
		
		
		return null;
		
		
	}
	
}


//
//import java.util.Random;
//
///**
// * code for the generateRaggedArray method we worked on in class
// * @author Connor
// */
//public class RaggedArrayDemo {
//
//	public static void main(String[] args) {
//
//// int[][] matrix = { { 2, 4, 6 }, { 8, 10 }, { 12, 14, 16, 18 } };
//
//// System.out.println(matrix[1][1]);
//
//// System.out.println(matrix[2].length);
//
//		int[][] raggedArray = generateRaggedArray(10, 15); //creating a 2d array and using generateRaggedArray to initialize it
//		
//		for (int[] r : raggedArray) { // enhanced for loop to move through the rows
//			for (int c : r) // enhanced for loop to move through each column in the selected row
//				System.out.print(c + " "); // printing out the element at each column in the row separated by a space
//			System.out.println();// going to the next line
//		}
//
//	}
//
//	/**
//	 * randomly generates and returns a 2d array based on a given number of rows and
//	 * maximum number of columns
//	 * 
//	 * @param numRows    - the number of desired rows for the ragged array to have
//	 * @param maxColumns - the maximum number of columns that a row can have
//	 * @return raggedArray - an array with a set number of rows and randomly
//	 *         generated columns and elements
//	 */
//	public static int[][] generateRaggedArray(int numRows, int maxColumns) {
//
//		int[][] raggedArray = new int[numRows][]; // creating the array that will be returned and initializing the
//													// number of rows to numRows
//		Random rand = new Random(); // initializing a random number generator
//
//		for (int i = 0; i < raggedArray.length; i++) {// starting a for loop that goes through and sets the number of columns in each row
//			raggedArray[i] = new int[rand.nextInt(1, maxColumns + 1)];//setting the number of columns in row i to a random number between 1 and maxColumns(inclusive)
//		}
//
//		//nested for loops to seek through each element of raggedArray and set them to a random number
//		for (int row = 0; row < raggedArray.length; row++) {
//			for (int col = 0; col < raggedArray[row].length; col++) {
//				raggedArray[row][col] = rand.nextInt(1, 101);//setting the element of raggedArray to a random number between 1 and 100(inclusive)
//			}
//		}
//
//		return raggedArray; //returning the generated array
//
//	}
//
//}
