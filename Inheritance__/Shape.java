package Inheritance__;
//this class is called data element
public abstract class Shape  implements ShapeRelocate {// maing a conection with SpareRelocate
// that means u cant make an object of the class shape(not sure)
	
//	int numOfSides; //Fields or Attributes
	//String name;
	//String color;
	
		ShapeRelocate, ShapeResize
	
	private int numOfSides;
	private String color;
	private String name; //private String name; private made it unaccessable outside of the class
	private int sn;
	
	public Shape(String n,String c,int side)//Parameterized constructor    /accessor methof
	{
		name=n;
		color=c; // c=color is wrong
		numOfSides= side;
	}
	
	//No Arg (arguement) Constructor
	public Shape()                                                         //Mutator method
	{
		name="noName";
		color="White";
		numOfSides=0; 
		
	}
	/*
	 * Create a Constructor that sets the name to the passed parameter 
	 * and sets the color to brown and num of sides to 3
	 */
	
	//takes only one argument
	public Shape (String n)
	{
		name=n;
		color="Brown";
		numOfSides=3;
		
	}
	
	//Copy constructor
	public Shape (Shape s)
	{
		name=s.name;
		color=s.color;
		numOfSides=s.numOfSides;
		
	}
	
	
	
	//accessor (get)
	public String getName()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public int getNumOfSides()
	{
		return numOfSides;
		
	}
	//Mutator (set)
	public void setColor(String c)
	{
		this.color=c;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public void setNumOfSides(int s)
	{
		this.numOfSides=s;
	}
	
	
	//Constructor(has the same name as the class, no return type, 
	
	/*
	 * Implement a method named display
	 * that takes no argument and it returns a string
	 * with the following format containing the information
	 * of a shape object:
	 * "Name =" ----, "Color= " ---,"Sides -"---
	 */
	
	@Override
	public String toString()
	{
		String s="Name: "+name+ ", Color: "+color+", Sides: "+ numOfSides; //this. can help to search or get the list variables
		return s;
		
	}
	
	
	
	
	@Override //always use it, safety measure- Just in case you named the method name
	public boolean equals(Object o)   //*****remember the signature fri mid
	{
		
		
		if(o instanceof Shape)
		{
		
			Shape temp=(Shape) o;
			//return (this.name.equals(temp.name)&&this.color.equals(temp.color)&& this.numOfSides==temp.numOfSides); //numOfSides is just an int so we can use ==
			return (this.name.equals(temp.name)&&this.color.equals(temp.color)); //numOfSides is just an int so we can use ==

			//&& this.numOfSides==temp.numOfSides

			}


			return false;


			}



	public abstract double calcArea();
		
	@Override
	public void shrink(int units)
	{
		System.out.println("Shape shrinked");
	}
	
}
