package inheritance;

public class Rectangle extends Shape
{
	private double w;
	private double l;
	private final int C = 4;
	
	public Rectangle(String name, String color, double w, double l)
	{
		super(name, color);
		this.l = l; 
		this.w = w;
	}
//	public Rectangle(String name, String color, double w)
//	{
//		super(name, color);
//		
//		this.w = w;
//	}
	
	public Rectangle(String string, String string2, int i) {
	}

	@Override
	public String toString()
	{
		return super.toString() + " " + w + " " + l;
	}
	
	@Override
	public boolean equals (Object o)
	{
		if (o instanceof Rectangle )
		{
			Rectangle temp = (Rectangle) o;
			return super.equals(temp) && this.l  ==  temp.l && this.w == temp.w;
		}
		return false; 
	}
	
	
	@Override
	public double calArea()
	{
		return l * w;

	}
	
	@Override
	public void rotate(int angle) 
	{
		System.out.println("Rect has rotated by " + angle);
	}
	
	@Override
	public void turnRight (int unit)
	{
		System.out.println("Rect has turn right by " + unit);

	}

	@Override
	public void resize(int unit) {
		// TODO Auto-generated method stub
		System.out.println("Rect has been resized by " + unit);

	}

}

