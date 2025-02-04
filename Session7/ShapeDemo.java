package Session7;

public class ShapeDemo {

	public static void main(String[] args) 
	{
		Shape square = new Shape();
		square.name = "Square"; // Constructor
		System.out.println(square.name);
		System.out.println(square);

		
		Shape square2 = new Shape("Rectangle", "Blue", 4);
		System.out.println(square2.getName());
		System.out.println(square2.getColor());
		Shape s3 = new Shape("Circle");
		
		System.out.print.ln(square.display());
		System.out.print.ln(square2.display());
		System.out.print.ln(s3.display());
	}
	
	
	
	

}
