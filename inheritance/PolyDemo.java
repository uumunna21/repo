package inheritance;

public class PolyDemo {

	public static void main(String[] args) 
	{
		Shape[] shapes = new Shape[6];
		
		Circle c1 = new Circle("Sun", "Y", 3);
		Circle c2 = new Circle("Ball", "R", 2);
		Rectangle r1 = new Rectangle("Box", "Y", 2, 4);
		Rectangle r2 = new Rectangle("Pool", "B", 10, 4);
		
		
		//Polymorphysim
		shapes[0] = c1;
		shapes[1] = r1;
		shapes[2] = r2;
		shapes[3] = c2;
		
		for (Shape s : shapes)
		{
			if (s != null)
			{
				System.out.println(s);
				System.out.println(s.calArea());
			}
		}
		
		Object o1 = new Circle("sun", "y", 10);
		System.out.println("===============");
		System.out.println(o1.toString());
		




	}

}
