package Session10_;

import java.util.Random;

public class RaggedArrayDemo {

	public static void main(String[] args) {
		
		/*
		 * {
		 * 	{5,6,7}
		 * 	[3]
		 * 	[4,5,6,9}
		 * }
		 */

		//this approach
//		int [][] nums=new int [3][];
//		nums[0]= new int[3];
//		nums[1]=new int[1];
//		nums[2]=new int[4];
//		nums[0][0]=5;	nums[0][1]=7;   or
		
		//this approach both of them are correctS
		//int[][] nums= { {5,6,7},{3},{4,5,6,9} };
		
		int[][]nums=generateRaggedArray(3,5);
		
		for(int i=0;i<nums.length;i++)
		{
			for (int j=0;i<nums[i].length;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			
			System.out.print("\n");
			
		}
		
		int[] array=toOneDim(nums);
		
		for(int n: array)
		{
			System.out.print(n+", ");
		}
		
		
	}
		
		/**
		 * create a method named generateRaggedArray 
		 * that takes two parameters,row num and max num of colums 
		 * generates and returns a 2d array based on a given number of rows and maximum number o colimns chosen randomly 
		 * set the element of the array to a random number 1-100
		 */
				  	
		
		public static int[][] generateRaggedArray (int row, int col)
		{
			Random gen=new Random();
			int[][] arr = new int [row][];
			
			for(int i=0;i<arr.length;i++)
			{
				int columns=gen.nextInt(col)+1;
				arr[i]=new int [columns];
				
				for (int j=0;j<arr[i].length;j++)
				{
					arr[i][j]=gen.nextInt(100)+1;
				}
				
			}
			return arr;
			
		}
		
		
		/*
		 * Implement a method named toOneDim that takes a ragged array of int
		 *  and returns a one dimensional array cotaining all the content of the passed ragged array
		 */
				  
	
		public static int[] toOneDim (int[][] raggedArray)
		{
			int numOfElements=0;
	
			
			
			for(int row=0;row<raggedArray.length;row++)
			{
				
				numOfElements+=raggedArray[row].length;
			
			}
			
			int[] newOneDimArr=new int[numOfElements];
			int index=0;
			
			for(int row=0;row<raggedArray.length;row++)
			{
				for(int col=0;col< raggedArray[row].length;col++)
				{
					newOneDimArr[index]=raggedArray[row][col];
				index++;
				}
			}
			
			return newOneDimArr;
		}
			

}
