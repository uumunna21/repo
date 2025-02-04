package Inheritance__;

public class AnotherInheritanceDemo {

	public static void main(String[] args) {
		//Shape s1=new Shape("Box","Y",4); // Incorrect. can't do that because shape is an abstact class

		Shape s1=new Rectangle("Box","Y",4,2,3); //Polymorphysm
		s1=new Circle("Sun","Y",0,4);
		
		
		Shape[] shapes= {new Rectangle("Pool","Y",4,2,3),
						new Circle("Moon","Y",0,4) };
				
				
				
				
		for ( Shape s :shapes)
		{
			s.MoveDown(10);
			s.MoveUp(5);
			System.out.println(s);
			System.out.println(s.calcArea());
			
		}
	}
	
	

}
