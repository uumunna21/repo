package Session6;
//not mine
public class MetthodExamples 
{
	public static void main( String[] args)
	{
		display();
		System.out.println("End of main");
	}

	public static void display()
	{
		System.out.println("DD");
		System.out.println("In display!");
		displayName("Hello nice to meet you");
		System.out.println("xx");
	}
	
	public static void displayName(String name)
	{
		System.out.println(name);
		System.out.println("nn");
	}
	
	
	public static void randMethod (String boy, int number)
	{
		String sub = boy.substring(number);
		if (boy.compareTo(number) > 0)
		{
			sub = "";
			System.out.println(sub);
		}
		else
		{
			sub = boy.substring(number);
			System.out.println(sub);
		}
	}
	
}
