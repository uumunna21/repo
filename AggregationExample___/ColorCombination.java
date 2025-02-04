package AggregationExample___;

/**Create a class called ColorCombination
 * with the following
 * int attributes:
 * 
 * red, green, blue
 * Create a parameterized constructor
 */



public class ColorCombination {

	private int red;
	private int green;
	private int blue;	
	

	public ColorCombination()
	{
		red=0;
		green=0;
		blue=0;
	}
	
	public ColorCombination(int red, int green, int blue )
	{
		this.red=red;
		this.green=green;
		this.blue=blue;
	}
	
	public String toString()
	{
		return "Red= "+red+ " Green= "+green+ " Blue= "+blue;
		
	}
	
	
	
}
