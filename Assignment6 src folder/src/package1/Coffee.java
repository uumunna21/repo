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

public class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;
    private final double SHOT_PRICE = 0.5;
    private final double SYRUP_PRICE = 0.3;
    private final double EXTRA_SHOT_PRICE = 0.5;
    private final double EXTRA_SYRUP_PRICE = 0.5;
	private String bevName;
	private Size size;

    // Constructor for the Coffee class
    public Coffee(String name, Size size, boolean extraShot, boolean extraSyrup) {
        super(name, Type.COFFEE, size);  // Call the superclass constructor (Beverage)
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    // Getter methods
    public boolean hasExtraShot() {
        return extraShot;
    }

    public boolean hasExtraSyrup() {
        return extraSyrup;
    }

    @Override
    public double calcPrice() {
        double basePrice = 3.0;  // Base price for medium size coffee
        if (this.size == Size.MEDIUM) {
            basePrice = 3.0;
        }
        if (this.extraShot) {
            basePrice += 0.5;
        }
        if (this.extraSyrup) {
            basePrice += 0.5;
        }
        return basePrice;
    }


    @Override
    public String toString() {
        return super.toString() + ", Extra Shot: " + extraShot + ", Extra Syrup: " + extraSyrup;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coffee)) {
            return false;
        }
        Coffee other = (Coffee) obj;
        return this.getName().equals(other.getName()) && 
               this.getSize() == other.getSize() && 
               this.extraShot == other.extraShot && 
               this.extraSyrup == other.extraSyrup;
    }

    @Override
    public String getBevName() {
        return bevName;
    }

	public BooleanSupplier isExtraShot() {
		// TODO Auto-generated method stub
		return null;
	}

	public BooleanSupplier isExtraSyrup() {
		// TODO Auto-generated method stub
		return null;
	}
}
