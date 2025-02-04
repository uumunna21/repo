package session8;

import Session7.Shape;

public class MemoryDemo 
{

	public static void main(String[] args) {
		Shape s1 = new Shape("Circle","Red", 0);
	}
//	or
//	public static void main(String[] args) {
//		Session7.Shape s1 = new Session7.Shape("Circle","Red", 0);

	
	/*
	 * Create a copy of s1 named s2
	 */
	Shape s2 = new Shape(s1);
	/*
	 * Create a copy of s2 named s3
	 */
	Shape s3 = new Shape(s2);
}

