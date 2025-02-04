package Session7;

public class ShapeDemo2 
{
	public static void main(String[] args)
	{
		/**
		 * create a shape object s1 using parameterized constructor of the shape with the following information
		 * Box Blue 4
		 */
		
		/**
		 * Create another object s2 that has the same information as s1
		 */
		
		Shape s1 = new Shape("Box", "Blue", 4);
		
		Shape s2 = new Shape();
		s2.setName(s1.getName());
		s2.setColor(s1.getColor());
		s2.setCorners(s1.getCorners());
		
		System.out.println(s1.display());
		System.out.println(s2.display());
	}
	
}
