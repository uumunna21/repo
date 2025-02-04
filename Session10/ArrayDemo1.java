package Session10;

public class ArrayDemo1 {
	public static void main(String[] args) {
		/**
		 * create an array of char named alpha and size 4
		 */
		
		char[] alpha = new char[4];
		alpha[0] = 'A';
		System.out.println(alpha.length);
		alpha[alpha.length - 1] = 'Z';
		
		for (int i = 0; (i < alpha.length); i++ )
		{
			System.out.println(alpha[i]);
		}
		
		// enhanced for loop
		for (char myChar : alpha)
			System.out.println(myChar); 
		
		alpha[2] = alpha[0];
	}

}
