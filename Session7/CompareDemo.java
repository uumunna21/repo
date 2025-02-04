package Session7;

import java.util.Arrays;

public class CompareDemo {

	public static void main(String[] args) {
		Shape s1 = new Shape("Pool", "Blue", 4);
		Shape s2 = new Shape("Ball", "red", 0);
		Shape s3 = new Shape("Box", "Blue", 3);
		System.out.println(s1.compareTo(s2));
		
		Shape [] shapes = new Shape[3];
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = s3;

		for (Shape s : shapes)
			System.out.println(s);
		Arrays.sort(shapes);
		
		for(Shape s : )
		
	}

}
