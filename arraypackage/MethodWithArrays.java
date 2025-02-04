package arraypackage;
import java.util.*;

public class MethodWithArrays {

	public static void main(String[] args) 
	{
		int[] myArray = createArray(5);
		fillArray(myArray);
		
		for (int s : myArray)
			System.out.print(s);

	}
	
	public static int[] sumArray(int[] array1, int[] array2)
	{
		int biggest;
		if (array1.length > array2.length)
		{
			biggest = array1.length;
		}
		else
			biggest = array2.length;
		
		int[] newArray = new int[biggest];
		for ( int i = 0; i < biggest; i++)
		{
			newArray[i] = array1[i] + array2[i];
		}
		
		
		return newArray; 
		
	}
	
	
	public static void fillArray(int[] array)
	{
		System.out.println("Enter a number");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = num;
		}
		
	}
	
	public static int[] createArray(int n)
	{
		int[] array = new int[n];
		
		if (n == 0 || n < 0)
			return null;
		else
			return array; 
		
	}

}
