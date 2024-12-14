/*
 * Class: CMSC203 
 * Instructor:Khanndan Monshi
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
        if (offeredOnWeekend) {
            price += WEEKEND_PRICE;
        }
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
    public boolean isWeekend() { 
        return offeredOnWeekend; 
    }

    public void setOfferedOnWeekend(boolean offeredOnWeekend) {
        this.offeredOnWeekend = offeredOnWeekend;
    }

	public String getBevName() {
		// TODO Auto-generated method stub
		return null;
	}
}
