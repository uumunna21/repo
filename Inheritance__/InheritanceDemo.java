package Inheritance__;

import java.util.ArrayList;

public class InheritanceDemo {

	public static void main(String[] args) {
	
	//	String n=new String ("John");
		//String.valueOf(false);
		
		Circle c1=new Circle("Sun", "Yellow",0,5);
		Circle c2=new Circle("Sun", "Yellow",0,10);

		System.out.println(c1.equals(c2));
		
		
		Rectangle r1=new Rectangle("pool", "B", 4,2,4);
		Rectangle r2=new Rectangle("Box", "R", 4,3,3);
		System.out.println(r1);
		
		
		ArrayList<Shape> shapes=new ArrayList();
		shapes.add(c1);
		shapes.add(r1);
		shapes.add(c2);
		shapes.add(r2);
		
		//Dynamic binding
		
		for (Shape s: shapes)
		{
			
			System.out.println(s.calcArea());
		}
	}
	
	
	
	

}
