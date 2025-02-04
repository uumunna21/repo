package Session6;

public class StringExamples 
{
	public static void main(String[] args)
	{
		String n = "Today is a rainy day!";
		char x = n.charAt(3);
		System.out.println(x);
		
		String u = n.substring(3,8);
		System.out.println(u);
		
		
		String f1 = "Kale", f2 = "Kie";
		int z = 4, y = 3;
		char a = 'A', b = 'a';
		
		System.out.println(z <= y);
		System.out.println(a == b);
		System.out.println(a + 1);
		System.out.println((char)(a+2));
		
		System.out.println(f1.equals(f1));
		System.out.println(f1.compareTo(f2));
		
		if (f1.compareTo(f2) < 0)
			System.out.println("less than");
		else if (f1.compareTo(f2) > 0)
			System.out.println("greater than");
		else if (f1.compareTo(f2) == 0)
			System.out.println("same");
			
			
	}
	
}
