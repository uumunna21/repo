package package1;

import java.util.function.BooleanSupplier;

public class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;
    private final double EXTRA_SHOT_PRICE = 0.5;
    private final double EXTRA_SYRUP_PRICE = 0.5;

    public Coffee(String name, Size size, boolean extraShot, boolean extraSyrup) {
        super(name, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        if (extraShot) price += EXTRA_SHOT_PRICE;
        if (extraSyrup) price += EXTRA_SYRUP_PRICE;
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Extra Shot: " + extraShot + ", Extra Syrup: " + extraSyrup + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Coffee coffee = (Coffee) obj;
        return extraShot == coffee.extraShot && extraSyrup == coffee.extraSyrup;
    }

    // Getters and Setters
    public boolean isExtraShot() { return extraShot; }
    public void setExtraShot(boolean extraShot) { this.extraShot = extraShot; }
    public boolean isExtraSyrup() { return extraSyrup; }
    public void setExtraSyrup(boolean extraSyrup) { this.extraSyrup = extraSyrup; }

	public Object getBevName() {
		// TODO Auto-generated method stub
		return null;
	}

	public BooleanSupplier hasExtraShot() {
		// TODO Auto-generated method stub
		return null;
	}

	public BooleanSupplier hasExtraSyrup() {
		// TODO Auto-generated method stub
		return null;
	}
}

