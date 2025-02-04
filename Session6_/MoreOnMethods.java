package Session6_;

import java.util.Random;

public class MoreOnMethods {

	public static void main(String[] args)
	{
//		System.out.println(randMethod("Sunshine", 2));
//		System.out.println( myPlan("Raiha", 14 ));
//		
//		System.out.println(myPlan("Dana", 9));
		
		dispNum(55, 4);
	}

	/*
	 * Implement a method named randMethod
	 *  that takes a String parameter and 
	 *  an integer number. This method should
	 *  return the substring of the passed
	 *  parameter starting at the index 
	 *  given as the second parameter.
	 *  if the index is invalid return an
	 *  empty String ""
	 *  Ex:
	 *  randMethod("SunShine", 2) ==> nShine
	 *  randMethod("SunShine", 40) ==> ""
	 */
	
	public static String randMethod(String word, int index)
	{
		if(index<0|| index>word.length()-1)
		{
			return "";
		}
		return word.substring(index);
	}
	
	/*
	 *  * Write a method named myPlan that takes 
	 * two parameter of type String and int for 
	 * name and age.
	 * The method checks the following:
	 * if the age is less than 6 your method should 
	 * return a message "name : "Play Play""
	 * if the age is between 7 and 14 return 
	 * "name "Play study"
	 * if the age is between 14 and 60 
	 * "name "work study"
	 * otherwise :  "name "study work ready to retire" 
	 * 
	 * ex: 
	 * myPla("Kate", 6) ---> kate: play play
	 * 
	 */
	
	
	/*
	 * Implement a method named dispNum that takes two param
	 * of type int
	 * The method displays the numbers between the first and second
	 * number which ever is larger
	 * 
	 * dispNum(6,89) ==> 6,7,8,......89
	 * dispNum(60,9) ==> 9,10,11,12,.... 60
	 */
	
	
	public static void dispNum(int num1, int num2)
	{
		if (num1 > num2)
		{
			for (int i = num2; i < num1; i++)
			{
				System.out.print(i + ",");
			}
			
		}
		else
		{
			for (int i = num1; i < num2; i++)
			{
				System.out.print(i + ",");
			}			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String myPlan(String name, int age)
	{
		if (age < 6)
		{
			return "name : Play Play";
		}
		else if (age >= 7 && age <= 14)
		{
			return "name work study";
		}
		else if (age >= 14 && age <= 60)
		{
			return "name work study";
		}
		else
		{
			return "name study work ready to retire";
		}
	}
	
	
	
//	public static String myPlan(String name, int age)
//	{
//	
//		if(age<7)
//			return "name:" +name+ " -Play Play";
//		else if(age<14 &&age>6)
//			return "name:" + name+ " -Play study";
//		else if(age<61 &&age>13)
//			return "name:" + name+ " -work study";
//		else
//			return "name:" + name+ " -study work ready to retire";
//		
//					
//					
//	}
}