package Session10;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> scores = new ArrayList<Integer>();
		//78,3,67,89,90
		scores.add(78);
		scores.add(3);
		scores.add(67);
		scores.add(89);
		scores.add(90);
		
		for(int a : scores)
			System.out.print(a + " ");
		
//		for(Integer a : scores)
//			System.out.print(a + " ");
		
		// Add 56 btw 67 & 89
		scores.add(3,56);
		System.out.println(scores);

		System.out.println(scores.contains(89));
		System.out.println(scores.indexOf(89));
		
		scores.remove((Integer)89);
		System.out.println(scores);
		System.out.print(scores.size());
		
		scores.set(2, 120);
		
		for(int i = 0; i < scores.size(); i++)
			System.out.print(scores.get(i) + " ");
		
		for(int i = 0; i < scores.size(); i++)
			scores.remove(i);
		
		
		
		System.out.print(scores);

		



	}

}
