package Session10_;

import Session7_.Shape;

public class FunctionWithArray {

	public static void main(String[] args) {
		
//		int[]ages =new int[5];
//		ages[0]=34;
//		ages[1]=76;
//		ages[2]=89;
//		ages[3]=10;
//		ages[4]=45;   or
		
		int[] ages= {34,76,89,10,45};
		
		System.out.println(maxAge(ages));
		
		int[]myArr = crArray(5);
		
		for(int n: myArr)
			System.out.print(n+" ");
		
		/*
		 * Declare an array named shapes
		 * of type Shape that can hold 3 Shape objects
		 */
		
		Shape[] shapes=new Shape[3];
		
		/*
		 * set the last element of shapes to an object using the arg constru
		 */
		shapes[shapes.length-1]=new Shape();
		

		/*
		 * set the first element of shapes to an object using the parameterized constru
		 */
		shapes[0] =new Shape("Box", "Black" ,4);
		displayShapes(shapes);
	
		
	}
	
	/*
	 * Implement a method named displayShapes that takes an array of tyoe shape 
	 * and prints the information of on=bjects in the array
	 */
	
	public static void displayShapes(Shape[] arr)
	{
		for(Shape s :arr )
			if(s!=null)
			System.out.println(s.display());
//		for(int i=0; i<arr.length;i++)               both of them will work
//			System.out.print(arr[i].display());
	}
	
	
	
	/*
	 * implement a method named maxAge that return an int 
	 * and takes an array of in as parameter and finds and 
	 * returns the largest number in the array
	 */	
	public static int maxAge (int[] anArray)
	{
		int max=Integer.MIN_VALUE;
		
		for(int a: anArray) //loop automatically to the first element to last 
		{
			if (a>max)
			{
				max=a;
			}
		}
		
		return max; 
		
	}
	
	/*
	 * Implement a method named crArray that takes a number as parameter.
	 * This method should create an array with the size of parameter number
	 * and initialize the array elements to 90.
	 * and return the array
	 */
	
	public static int[] crArray (int n)
	{
		int[] tempArr=new int[n];
		
		for(int i=0;i<tempArr.length;i++)
		{
			tempArr[i]=90;
		}
		
		return tempArr;
	}

	
	
}

