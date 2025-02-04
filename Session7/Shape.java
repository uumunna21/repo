package Session7;
//not my code
public class Shape 
{
	
	int corners;
	String color;
	String name;
	
	public String getColor()
	{
		return color;
	}
	public int getCorners()
	{
		return corners;
	}
	public void setCorners(int c)
	{
		corners = c;
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
		name = n;
	}
	
	
	public String display()
	{
		String s = "name =" + name + " color =" + color + " Corners" + corners;
		return s;
	}
	
	
	public Shape(String n, String c, int cr)
	{
		name = n;
		color = c;
		corners = cr;
	}
	
	public Shape (String b)
	{
		name = n;
		color = "Brown";
		corners = 0;
	}
	
	public Shape ()
	{
		name = "no name";
		color = "Red";
		corners = 3;
	}
	
	public Shape(Shape s)
	{
		name = s.name;
		color = s.color;
		this.corners = s.corners;
	}
	
	public String toString()
	{
		return name + " " + color + " " + corners;

	}
	
	public boolean equals(object o)
	{
		if (o instanceof Shape)
		{
			Shape temp = (Shape) o;
//			if ( this.name.equals(temp.name))
//				return true;
//			else 
//				return false;
			
			return (this.name.equals(temp.name)&& this.color.equals(temp.color) && this.corners == temp.corners);
						
		}
	}
	public char[] compareTo(Shape s2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
