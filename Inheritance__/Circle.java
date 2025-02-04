package Inheritance__;

public class Circle extends Shape{ //sub class of shape

//	final int M=8;
	
	private double radius;
	
	public Circle(String name,String color, int ns, double radius)
	{
//		instead off calling set methods
//		super.setName(name);
//		super.setColor(color);
//		super.setNumOfSides(ns);
		
		super(name,color,ns); //this like always have to write as the first line of the constructor
		
		this.radius= radius;
	}

	public boolean equals(Object o)   //*****
	{
		
		
		if(o instanceof Circle)
		{
		
			Circle temp=(Circle) o;
			//return (this.name.equals(temp.name)&&this.color.equals(temp.color)&& this.numOfSides==temp.numOfSides); //numOfSides is just an int so we can use ==
		if (this.equals(temp) &&  this.radius==temp.radius)
				{
			return true;
				}
		}
			return false;
	}
	
	
	@Override
	public String toString()
	{
		
		return super.toString() +" "+this.radius;//definatly use the super , toString
		
	}

	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
		
	}

	@Override
	public void MoveUp(int units) {
		System.out.println("Circle moved up "+ units);
		
	}

	@Override
	public void MoveDown(int units) {
		System.out.println("Circle moved down "+ units);
		
	}
	
	
}
