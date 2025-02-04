package Session8_;

import Session7_.Shape;// this will only import Shape from session7_
import Session7_.*;//import everything from that package by usuing '*'

public class CopyConstructorDemo {

	public static void main(String[] args) {
		/*
		 * Create a Shape instance with the following info:
		 * "Box" "Red" 4
		 */

		Shape s1=new Shape("Box","Red",4); //can't use it because its in a different class and has the same name. 
		//import it and then you can use it from the other class
		//or Session7_.Shape s1=new Session_7.Shape("Box","Red",4);

		/**
		 * Create another object of Shape with the same info as s1.
		 * Use the no arg constructor to create s2. 
		 * Then set the info s2 to s1.
		 * Display information of s1 and s2
		 */


		//Shape s2=s1;// wrong because it is not creating the object but only storing the address of s1.  an object can be created is by adding "new"
		//Shape s2=new Shape();

		Shape s2=new Shape(s1); //this wont work unless thees is a constructor
		Shape s3=new Shape(s2);
		//		s2.setName(s1.getName());
		//		s2.setColor(s1.getColor());
		//		s2.setNumOfSides(s1.getNumOfSides());

		System.out.println(s1.display());
		System.out.println(s2.display());
		System.out.println(s3.display());
	}

}
