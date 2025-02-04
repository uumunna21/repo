package session8;

import java.util.Scanner;

import Session7.Shape;

public class PassObjectToMethod {

	public static void main(String[] args) 
	{
		/**
		 * Create a shape object s1 with the following info:
		 * "Box" "Red" 4
		 */
		Shape s1 = new Shape("Box", "Red", 4)
	}
	

	/**
	 * Create a method named changeName that does not return anything and it takes as 
	 * parameter a Shape object
	 * This method should ask the user a name and change the passed Shape object's name to
	 * the name that the user enters.
	 */
	
	public static void changeName(Shape s)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of the shape");
		String name = in.nextLine();
		s.setName(name);
	}
	
	public static void createShape()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the shape");
		String name = input.nextLine();
		System.out.println("Enter the color of the shape");
		String color = input.nextLine();
		System.out.println("Enter the corners of the shape");
		int corners = input.nextInt();
		if (corners < 0)
		{
			return null;
		}
		return new Shape(name, color, corners);
	}

}
