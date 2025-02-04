package Session10_;

import java.util.ArrayList;

public class ArrayLsitDemo {

	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList<String>();
		
		//Add John, Kate, Alex
		
		names.add("John");
		names.add("Kate");
		names.add("Alex");
		
		System.out.println(names);
		
		//Add Maria between John and Kate
		
		names.add(1,"Maria");
		
		System.out.println(names);
		
		//remove Alex
		names.remove("Alex");
		System.out.println(names);
		
	}

}
