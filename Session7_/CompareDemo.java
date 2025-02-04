package Session7_;

import java.util.Arrays;

public class CompareDemo {

	public static void main(String[] args) {
		int x=9, y=7;
		
		String n1="SUn", n2="Soon";
		System.out.println(n1.compareTo(n2));

		Shape s1= new Shape("SUN","Y",4);
		Shape s2= new Shape("MOON","W",0);
		Shape s3= new Shape("BOX","R",3);
		
		//Change s1 ,s2, s3 and check the output
		System.out.println(s3.compareTo(s1)); // can't do that without the comparedTo method on the shape class(not sure)
		
		Shape[] shapes= new Shape[3];
		
		shapes[0]=s1;
		shapes[1]=s2;
		shapes[2]=s3;
		for(Shape s: shapes)
		{
			System.out.println(s);
		}
		
		//Arrays.sort(shapes); // changes order of shape, u need to implement comparable in the shape class
		
		selectionSort(shapes);
		
		for(Shape s: shapes)
		{
			System.out.println(s);
		}
		
		
		
	}
	
	
	 // Function to perform selection sort on an array  
    public static void selectionSort(Comparable[] arr) {  
        int n = arr.length;  
  
        // Iterate through the array  
        for (int i = 0; i < n - 1; i++) {  
            // Find the index of the minimum element in the unsorted portion of the array  
            int minIndex = i;  
            // Search for the minimum element in the unsorted portion  
            for (int j = i + 1; j < n; j++) {  
                if (arr[j].compareTo(arr[minIndex]) <0) {  
                    minIndex = j;  
                }  
            }  
            // Swap the found minimum element with the first element of the unsorted portion  
            Comparable temp = arr[minIndex];  
            arr[minIndex] = arr[i];  
            arr[i] = temp;  
        }  
    }  

}
