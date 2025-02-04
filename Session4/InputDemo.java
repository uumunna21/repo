package Session4;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
//		/*
//		 * implement a code snippet that keep asking the user to enter a positive number.
//		 * and display the square of that number.
//		 * the program ends when the user enters a negative or 0
//		 */
//		
//		int num;
//		Scanner in=new Scanner(System.in);
//		
//		do{											//do while will at least run the code inside  once
//			System.out.print("Enter a number: ");
//			num=in.nextInt();
//			if (num>0)
//				System.out.println(num*2);
//		}while (num>0);
		
		/*
		 * write a for loop to display the numbers from 5 to 14. Display the resu;t at each step
		 * ex:
		 * 5
		 * 11
		 * 18
		 * ...
		 */
		
		int sum=0;
		
		for (int n=5; n<15; n++)
		{
			sum+=n;
			System.out.println(sum);
			
		}
		
	}

}
