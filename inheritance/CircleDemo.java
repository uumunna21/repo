package inheritance;

public class CircleDemo 
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle("Sun", "Yellow", 0, 10);
		System.out.println(c1);
		
		Circle c2 = new Circle("Box", "Red");
		System.out.println(c2);
		Circle c3 = new Circle("Box", "Red"); 

		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));


		

		

	}
	

}
