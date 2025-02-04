package inheritance;

public class Circle extends Shape{
	private double radius;
	private final int corners = 0;

	
	public Circle (String name, String color, int corners, double radius)
	{
//		super.setName(name);
//		setColor(color);
//		super.setCorners(corners);
		super(name, color);
		this.radius = radius;
	}
	
	public Circle (String name, String color, int i)
	{
		this(name,color, 4, 5);
	}
	
	public String toString()
	{
		return super.toString() + " " + this.radius;
	}
	
	public Circle(String n, double radius)
	{
		super(n);
		this.radius = radius;
	}
	
	public Circle(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	@Override 
	public double calArea()
	{
		return Math.PI * Math.pow(radius, 2);
		
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Circle)
		{
			Circle temp = (Circle) o;
			if (super.equals(temp) && this.radius == temp.radius)
				return true; 
			return false;
			
//			return (this.name.equals(temp.name)&& this.color.equals(temp.color) && this.corners == temp.corners);
						
		}
		return false;
	}

	public int getCorners() {
		return corners;
	}
	
	@Override
	public void rotate(int angle) 
	{
		System.out.println("Circle has rotated by " + angle);
	}
	
	@Override
	public void turnRight (int unit)
	{
		System.out.println("Circle has turn right by " + unit);

	}
	
//	@Override
//	public void erase()
//	{
//		System.out.println("Shape is erased");
//
//	}

	@Override
	public void resize(int unit) {
		System.out.println("Circle has been resized by " + unit);
		
	}




}
