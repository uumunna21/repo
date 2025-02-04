package inheritance;

public class AnotherDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle("Sun", "Y", 10);
		Rectangle r1 = new Rectangle("Box", "Red", 2, 3);
		c1.erase();
		c1.resize(10);
		r1.erase();
		r1.resize(6);
	}

}
