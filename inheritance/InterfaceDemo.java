package inheritance;

public interface InterfaceDemo 
{

	public static void main(String[] args)
	{
		Circle c1 = new Circle ("Sun", "Y" , 10);
		Rectangle r1 = new Rectangle ("Box", "R", 20);
		
		c1.turnRight(10);
		r1.turnRight(20);
		r1.rotate(20);
		c1.rotate(30);
		
	}
}
