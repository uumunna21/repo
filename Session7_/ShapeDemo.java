package Session7_;

import java.util.Scanner;

//This class is called Driver
public class ShapeDemo {

	public static void main(String[] args) {
		Shape s1=new Shape("Circle","blue", 0); //Constructor
//		s1.name= "circle";
//		s1.color="Blue";
		
		System.out.println(s1.getName());
		System.out.println(s1.getNumOfSides());
		System.out.println(s1.getColor());
		System.out.println(s1); //this will only print the memory address  
		/*
		 * Create another Shape object
		 * s2 with the name rectangle,
		 * color Red and number of side 4
		 */
		
		Shape s2=new Shape("Rectangle", "red",4);
		System.out.println(s2); //just to test it
		
		Shape s3=new Shape();
		System.out.println(s3.getName());
		
		Shape s4=new Shape("Triangle");
		s4.setColor("black");
		s4.setNumOfSides(2);
		//s4.display();
		System.out.println(s4);
		askName(s4);
		System.out.println(s4);
		askName(s1);
		System.out.println(s1.getName());
		
		//for example
		//sumOfSides(s1,s2); //Should return 4
	}
	
	/*
	 * Implement a method named sumOfSides
	 * that takes two shape objects as argument 
	 * and returns the sum of number of sides of the shape objects
	 */
	//--------
	

	/*
	 * Implement a method named askName that does the following:
	 * This method is not returning anything and it takes as an argument a shape object.
	 * Your method should ask the user to input the name and modify the passed object's name 
	 * to the one inputed from the user.
	 */
	
	public static void askName(Shape s)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name of the shape: ");
		String n=in.nextLine();
		s.setName(n); 
	}
	
	
}
