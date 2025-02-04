package inheritance;
//not my code
public abstract class Shape implements ShapeInterface, ModifyShapeInterface
{
	
	private String color;
	private String name;
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String c)
	{
		color = c;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String c)
	{
		name = c;
	}
	
	
	public String display()
	{
		String s = "name =" + name + " color =" + color + " Corners";
		return s;
	}
	
	
	public Shape(String n, String c)
	{
		name = n;
		color = c;
	}
	
	public Shape (String b)
	{
		name = b;
		color = "Brown";
	}
	
	public Shape ()
	{
		name = "no name";
		color = "Red";
	}
	
	public Shape(Shape s)
	{
		name = s.name;
		color = s.color;
	}
	
	public String toString()
	{
		return name + " " + color;

	}
	
	public boolean equals(Object o)
	{
		if (o instanceof Shape)
		{
			Shape temp = (Shape) o;
//			if ( this.name.equals(temp.name))
//				return true;
//			else 
//				return false;
			
			return (this.name.equals(temp.name)&& this.color.equals(temp.color));
						
		}
		return false;
	}

	public abstract double calArea();
	
//	@Override
//	public void rotate(int angle) 
//	{
//		System.out.println("Shape has rotated by " + angle);
//	}
//	
//	@Override
//	public void turnRight (int unit)
//	{
//		System.out.println("Shape has turn right by " + unit);
//
//	}
	
	
	@Override
	public void erase()
	{
		System.out.println("Shape is erased");

	}

	

	
	
}
