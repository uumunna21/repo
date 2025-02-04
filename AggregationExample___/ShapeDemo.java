package AggregationExample___;

import java.util.ArrayList;

public class ShapeDemo {

	public static void main(String[] args) {
		/**
		 * Create a Shape object with the following info:
		 * 
		 * BOX (name), 2(red), 3 (green), 1 (blue) ,4 (corners)
		 * 
		 * Verify if the attributes of the object are set correctly
		 * by printing (using toString) the object
		 */
		
		
	//	ColorCombination c= new ColorCombination(2,3,1); //#approach 1 line near 12
		Shape s1=new Shape ("Box",  2,3,1  , 4);
		System.out.println(s1);
		
		/**
		 * Create an array called shapes of size 3 that can hold 3 shape objects
		 */
		
		Shape[] shapes= new Shape[4];
		shapes[0]=s1;
		shapes[1]=new Shape();
		shapes[2]=new Shape("Triangle");
		
		for( Shape s: shapes)
		{
			System.out.println(s);
		}
		
		
		ArrayList<Shape> myShapes = new ArrayList <Shape>();
		myShapes.add(s1);
		myShapes.add(new Shape());
		
		ArrayList<Integer> nums= new ArrayList <Integer>();
		nums.add(100);
		nums.add(20);
		nums.add(1);
		nums.add(5);
		nums.add(3);
		nums.add(77);
		
		//check the output
		System.out.println(nums);
		
		for(int i=0;i<nums.size();i++) //.size instead of .length because Arraylist don't have specific length and the length changes
		{
			nums.remove(i);
		}
		System.out.println(nums);
		//nums.clear() - clears everything
	}

}
