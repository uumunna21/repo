package EqualityDemo;

import Session7.Shape;

public class EqualsDemo {

	public static void main(String[] args) 
	{
		Shape s1 = new Shape("Box", "Red", 4);
		Shape s2 = new Shape("Box", "Red", 4);
		
		System.out.println(s1.equals(s2));

	}

}
