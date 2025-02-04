package AggregationExample;
//not my code
public class Shape 
{
	
	private int corners;
	private ColorCombination color;
	private String name;
	
	public ColorCombination getColor()
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
	
	
	public Shape(String n, ColorCombination c, int cr)
	{
		name = n;
		color = c;
		corners = cr;
	}
	public Shape()
	
	
	
	public String toString()
	{
		return name + " " + color + " " + corners;

	}
	
}
