package package1;

import java.util.function.BooleanSupplier;

public class Smoothie extends Beverage {
    private int numFruits;
    private boolean addProtein;
    private final double PROTEIN_PRICE = 1.5;
    private final double FRUIT_PRICE = 0.5;

    public Smoothie(String name, Size size, int numFruits, boolean addProtein) {
        super(name, Type.SMOOTHIE, size);
        this.numFruits = numFruits;
        this.addProtein = addProtein;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        price += numFruits * FRUIT_PRICE;
        if (addProtein) price += PROTEIN_PRICE;
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

	public Object getBevName() {
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

