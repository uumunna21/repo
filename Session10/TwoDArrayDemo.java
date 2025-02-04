package Session10;
import Session7.Shape;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		
		int[][] arrayScores = new int[3][3];
		
		arrayScores[1][2] = 3;
		display(arrayScores);
		
		Shape[] shapes = new Shape[5];
		
		shapes[shapes.length - 1] = new Shape();
		
		shapes[1] = new Shape("sun", "Yellow", 0);
		
		int[] ex = {4, 5, 15, 21};
		
		int[] myNewArr = doubleSize(ex);
		
		for (int x: myNewArr)
			System.out.print(x + " ");
		
//		System.out.println(doubleSize(ex));
		
	}
	
	public static void display(int[][] array)
	{
		for (int row = 0; row < array.length; row++)
		{
			for (int col = 0; col < array[row].length; col++)
			{
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[] doubleSize(int[] array)
	{
		int[] newArr = new int[array.length * 2];
		for (int i = 0; i < array.length; i++)
		{
			newArr[i] = array[i];
		}
	
		return newArr;
		
	}

	
	
}
