package package1;

import java.util.function.BooleanSupplier;

public class Alcohol extends Beverage {
    private boolean offeredOnWeekend;
    private final double WEEKEND_PRICE = 0.6;

    public Alcohol(String name, Size size, boolean offeredOnWeekend) {
        super(name, Type.ALCOHOL, size);
        this.offeredOnWeekend = offeredOnWeekend;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        if (offeredOnWeekend) price += WEEKEND_PRICE;
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weekend: " + offeredOnWeekend + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Alcohol alcohol = (Alcohol) obj;
        return offeredOnWeekend == alcohol.offeredOnWeekend;
    }

    // Getters and Setters
    public boolean isOfferedOnWeekend() { return offeredOnWeekend; }
    public void setOfferedOnWeekend(boolean offeredOnWeekend) { this.offeredOnWeekend = offeredOnWeekend; }

	public Object getBevName() {
		// TODO Auto-generated method stub
		return null;
	}

	public BooleanSupplier isWeekend() {
		// TODO Auto-generated method stub
		return null;
	}
}
