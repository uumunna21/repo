/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description:  Implement a software for a beverage shop that automates the order transactions and reports 
 * Due:  12/15/2024 
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ugonna Umunna
*/

package package1;

import java.util.function.BooleanSupplier;

public class Smoothie extends Beverage {
    private int numFruits;
    private boolean addProtein;
    private final double PROTEIN_PRICE = 1.5;
    private final double FRUIT_PRICE = 0.5;
	private Size size;
	private double numOfFruits;

    public Smoothie(String name, Size size, int numFruits, boolean addProtein) {
        super(name, Type.SMOOTHIE, size);
        this.numFruits = numFruits;
        this.addProtein = addProtein;
    }

    @Override
    public double calcPrice() {
        double price = 4.0;  // Base price for smoothie
        if (this.size == Size.LARGE) {
            price += 2.0;  // Extra cost for large size
        }
        price += this.numOfFruits * 0.5;  // $0.5 per fruit
        if (this.addProtein) {
            price += 1.5;  // Add cost for protein
        }
        return price;
    }


    @Override
    public String toString() {
        return super.toString() + ", Protein: " + addProtein + ", Fruits: " + numFruits + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Smoothie smoothie = (Smoothie) obj;
        return numFruits == smoothie.numFruits && addProtein == smoothie.addProtein;
    }

    // Getters and Setters
    public int getNumFruits() { return numFruits; }
    public void setNumFruits(int numFruits) { this.numFruits = numFruits; }
    public boolean isAddProtein() { return addProtein; }
    public void setAddProtein(boolean addProtein) { this.addProtein = addProtein; }

	public String getBevName() {
		// TODO Auto-generated method stub
		return null;
	}

	public BooleanSupplier getAddProtein() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getNumOfFruits() {
		// TODO Auto-generated method stub
		return null;
	}

	public BooleanSupplier addProtein() {
		// TODO Auto-generated method stub
		return null;
	}
}

