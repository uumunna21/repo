package EqualityOfObjects__;

import Session7_.Shape;

public class EqualsDemo {

	public static void main(String[] args) {
		
		int x=5,y=9;
		System.out.println(x==y); //can be compared like this
		
		String n1="Hi", n2= "Hi";  //"hi";
		System.out.println(n1.equals(n2)); // comparing strings
		
		
		
		Shape s1=new Shape("box", "red", 4);
		Shape s2=new Shape("box", "red", 4);
		
		System.out.println(s1.equals(s2)); 
		/*
		 * Doesn't work.
		 *  but to make it work make an equals method for this public boolean equals(Object o).
		 *  Check session7_ end we added the method
		 */
		
		System.out.println(s1.equals(123)); 
		
	}

}
