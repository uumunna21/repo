package Session5;

import java.util.Scanner;

public class MethodExamples
{

	public static void main(String[] args) 
	{
//		 disSqur(89);
//		 disSqur(4);
//		
//		 /* Write a loop to ask the user to enter a number and show the square root by calling the disSqur.
//		  * The loop should ask the user if it should continue by asking the user to enter "Yes" or "No"
//		  * Ex:
//		  * Enter a number: 4
//		  * 2
//		  * Do you want to continue? Yes
//		  * ...
//		  */
//		 
//		 String repeat = null;
//		 double n;
//		 
//		 do {
//		 System.out.println("Enter a number: ");
//		 
//		 Scanner in=new Scanner(System.in);
//		 n=in.nextDouble();
//		
//		 disSqur(n);
//		 System.out.println("Do you want to continue?");
//		 
//		 in.nextLine();
//		 
//		 repeat= in.nextLine();
//		 
//		  
//		 }while(repeat.equalsIgnoreCase("yes"));  //it ignores the cases
//
//		 System.out.println("End of program");
		
		disNum(16,10);
//		 
		 
		 
	}
	
	/*Implement a method named disSqur that takes a double parameter and
	 *  and it displays the square root of the passed parameter.
	 */
	public static void disSqur (double num)
	{
		System.out.println(Math.sqrt(num)); //Math. to  and see the details and choose which one you need to
	}
	
	
	/*
	 * Implement a method named disNum that takes two parameters of type int
	 * The method displays the numbers between the first and second number whichever is larger
	 * 
	 * display(6,80)==> 6,7,8,....89
	 * display (60,9)==>9,10,11,12,....60
	 */
	public static void disNum(int firstNum, int secondNum)
	{
		
		if(firstNum<secondNum)
		{
			
					
			while(firstNum <=secondNum)
			{
				System.out.print(firstNum+", ");
				firstNum++;
				
			}
		}
		else if(firstNum>secondNum)
		{
				
			while(secondNum<=firstNum)
			{
				System.out.print(secondNum+", ");
				secondNum++;
				
			}
		}
	}
	
}
