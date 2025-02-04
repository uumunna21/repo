package inheritance;

import java.util.ArrayList;

public class MoreOnInheritance {

	public static void main(String[] args) {

		Circle c1 = new Circle("Sun", "Y", 4);
		Circle c2 = new Circle("Ball", "R", 3);
		Rectangle r1 = new Rectangle("Pool", "B", 2, 3);
		Rectangle r2 = new Rectangle("Box", "B", 4, 3);

		ArrayList<ShapeInterface> shapes = new ArrayList();
		shapes.add(r1);
		shapes.add(r2);
		shapes.add(c1);
		shapes.add(c2);
		
		for (ShapeInterface s : shapes)
		{
			System.out.println(s);
			s.rotate(20);
			s.turnRight(33);
		}


		
	}

}
