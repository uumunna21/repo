package Session10_;

import java.util.Arrays;

public class TwoDArrayExample {

	public static void main(String[] args) {
		/*
		 * Create am array named scores that has 2rows and 3 col.of type int
		 */
		
		int[][] scores=new int [2][3];

		fillInArr(scores,60);
		System.out.println(Arrays.toString(scores[0]));  // to quickly check the erray (not sure)
		System.out.println(Arrays.toString(scores[1]));
		
	}
	
	/*
	 * Create a method named fillInArr that takes 
	 * a 2D array of int and a number
	 * and fills in the array with that number
	 */
	
	public static void fillInArr(int[][] arr, int n)
	{
		for (int r=0; r<arr.length;r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				arr[r][c]=n;
			}
		}
	}

}
