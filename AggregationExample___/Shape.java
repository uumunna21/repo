package AggregationExample___;
//copied this class from session7_
public class Shape {

//	int numOfSides; //Fields or Attributes
	//String name;
	//String color;
	private int numOfSides; /*Field or attributes*/
	private String name; //private String name; private made it unaccessable outside of the class
	private ColorCombination color;
	
//#approach 1			//changing the type of c
//	public Shape(String n,ColorCombination c,int side)//Parameterized constructor    /accessor methof
//	{
//		name=n;
//		color=c; 
//		numOfSides= side;
//	}
	
	public Shape(String n,int r, int g, int b,int side)//Parameterized constructor    /accessor methof
	{
		name=n;
		color=new ColorCombination(r,g,b); 
		numOfSides= side;
	}
	
	//No Arg (arguement) Constructor
	public Shape()                                                         //Mutator method
	{
		name="noName";
		color=new ColorCombination();
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
		color=new ColorCombination(1,1,1);
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
	public ColorCombination getColor()
	{
		return color;
	}
	public int getNumOfSides()
	{
		return numOfSides;
		
	}
	//Mutator (set)
	public void setColor(ColorCombination c)
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
	
	
	public String toString()
	{
		String s="Name: "+name+ ", Color: "+color+", Sides: "+ numOfSides; //this. can help to search or get the list variables
		return s;
		
	}
}
