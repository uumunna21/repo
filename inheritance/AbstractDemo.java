package inheritance;

public class AbstractDemo {

	public static void main(String[] args) 
	{
		Circle c1 = new Circle ("Sun", "Y", 0);
		System.out.println(c1.calArea());
		
		Rectangle r1 = new Rectangle("Box", "Red", 5.5, 10);
		Rectangle r2 = new Rectangle("Box", "Red", 5.5, 10);
		Rectangle r3 = new Rectangle("Box", "Red", 6.5, 10);

		System.out.println(r1);
		System.out.println(r1.calcArea());
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));




	}

}
