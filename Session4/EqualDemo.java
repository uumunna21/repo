package Session4;

public class EqualDemo 
{
	public static void main(String[] args)
	{
		int x=9,y=8;
		char ch1='a',ch2='b'; 
		//String n1="Kate", n2="kate";
		String n1="kpue", n2="kate";
		
		System.out.println(x>y); 
		System.out.println(ch1==ch2); //never use mathmetical signs to compare strings
		
		System.out.println(n1.equals(n2)); //use this to comparing strings
	//	System.out.println(n1.compareTo(n2));
		System.out.println(n2.compareTo(n1));
		
		/*
		 * implement a code snippet that displays "Sun" if n1 is greater than n2 
		 * and display "Moon" otherwise
		 */
//		if (n1.compareTo(n2)> 0)
//			System.out.println("Sun"); 
//		else
//			System.out.println("Moon"); 

		//equals method
		if (n1.equals(n2)== true)   //return type is boolean
			System.out.println("Sun"); 
		else
			System.out.println("Moon"); 
	
		
		String sentence ="Today is Thursday!";
		
		//Display the num of chars in sentence
		System.out.println(sentence.length()); 
		
		//Display the 8th character of sentence
		System.out.println(sentence.charAt(7)); 
		
		//Display the substring of the sentence
		//Starting at 4th character
		
		
		System.out.println(sentence.substring(3));
				
		
	}
}
