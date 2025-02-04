package arraypackage;
import Session7.Shape;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] Scores = new int[10];
		Scores[2] = 75;
		Scores[5] = 59;
		System.out.println(Scores.length);

		Scores[Scores.length-1] = (Scores[2] + Scores[5]);
		System.out.println(Scores[Scores.length-1]);

		for (int i = 0; i < Scores.length; i++)
		{
			System.out.print(Scores[i]);
		}

		for (int i = 2; i < Scores.length; i++)
		{
			Scores[i] += 3;
			Scores[i] *= 2;
		}

		for (int i = 0; i < Scores.length; i++)
		{
			System.out.println(Scores[i]);
		}

		for (int num : Scores)
			System.out.println(num);

		System.out.println(Scores);


		int[] tempScores = new int[10];

		for (int i = 0; i < Scores.length; i++)
		{
			tempScores[i] = Scores[i];
		}

		Shape[] shapes = new Shape[5];

		shapes[1] = new Shape();

		shapes[shapes.length-1] = new Shape(shapes[1]);

		shapes[0] = shapes[1];

		//		shapes[0].setName("box");
		//		Shape s = shapes[0];

		System.out.println(shapes[1].getName());

		Shape[] shapeCopy = new Shape[5];

		for (int i = 0; i < shapes.length; i++)
		{
			shapeCopy[i] = shapes[i];
		}

		for (Shape g : shapeCopy)
		{
			System.out.println(g);
		}

		Shape[] deepCopy = new Shape[shapes.length];
		for (int i = 0; i < shapes.length; i++)
		{
			if (shapes[i] != null)
				deepCopy[i] = new Shape(shapes[i]);
		}
		
		System.out.println("-------------");
		
		for (Shape s : deepCopy)
			System.out.println(s);




	}

//	public String toString()
//	{
//		return name + " " + color + " " + corners;
//
//	}

}
