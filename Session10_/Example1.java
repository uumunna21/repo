package Session10_;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * 1) Create an array named ages of size 10
		 * that can hold the age of 10 people
		 * 2) set the third element of the array to 14
		 * 3) Set the 7th element to 25
		 * 4)Display the length of the array (Do not use a number)
		 * 5)set the last element of the array to 80
		 * 6) Set the first element of the array to the sum of third and last element
		 */
		
		int[] ages=new int[10]; //1
		
		ages[2]=14; //2
		
		ages[6]=25;//3
		
		System.out.println(ages.length); //4
		
		ages[ages.length-1]=80; //5
		
		ages[0]=ages[2]+ages[ages.length-1];//6
		
		
		//display the content of ages
		for (int i=0; i<ages.length;i++)
		{
			System.out.print(ages[i]+" ");
		}
		
		
		/*Create a copy of ages called agesCopy */
		int [] agesCopy=new int[ages.length];     //reference copy(not sure)
		
		System.out.println("\n"+ages+" "+agesCopy);
		
		for(int i=0; i<ages.length; i++)
		{
			agesCopy[i]=ages[i];			
			
		}
		
		System.out.println();
		
		//foreach,enhance loop = is a loop
		// (Automatically starts with the beaconing of the array element and
		//ends without even initializing it and it is only for printing)
		
		for(int a: agesCopy)
			System.out.print(a+" ");
		
		
		/*
		 * Write a code snippet that finds the 
		 * largest number in ages array
		 */
		
		ages[8]=120;
		//int max=ages[0]; or
		int max=Integer.MIN_VALUE;
		
		for(int a: ages)
		{
			if (a>max)
			{
				max=a;
			}
		}
		
		System.out.println("\n"+max);

	}

}
