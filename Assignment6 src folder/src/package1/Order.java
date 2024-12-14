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

import java.util.ArrayList;
import java.util.Random;

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {

    private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> beverages;

    /**
     * Constructor to initialize an Order object.
     * 
     * @param orderTime the time the order was placed
     * @param orderDay  the day the order was placed
     * @param customer  the customer who placed the order
     */
    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderNumber = generateOrderNumber();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = new Customer(customer); // Deep copy of the customer
        this.beverages = new ArrayList<>();
    }

    /**
     * Generates a random order number between 10000 and 90000.
     * 
     * @return the generated order number
     */
    private int generateOrderNumber() {
        Random rand = new Random();
        return rand.nextInt(80001) + 10000; // Range: [10000, 90000]
    }

    /**
     * Adds a new coffee beverage to the order.
     * 
     * @param bevName     the name of the coffee
     * @param size        the size of the coffee
     * @param extraShot   whether the coffee has an extra shot
     * @param extraSyrup  whether the coffee has extra syrup
     */
    @Override
    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
    }

    /**
     * Adds a new smoothie beverage to the order.
     * 
     * @param bevName     the name of the smoothie
     * @param size        the size of the smoothie
     * @param numFruits   the number of fruits in the smoothie
     * @param addProtein  whether the smoothie has protein powder
     */
    @Override
    public void addNewBeverage(String bevName, Size size, int numFruits, boolean addProtein) {
        beverages.add(new Smoothie(bevName, size, numFruits, addProtein));
    }

    /**
     * Adds a new alcoholic beverage to the order.
     * 
     * @param bevName the name of the alcoholic beverage
     * @param size    the size of the beverage
     */
    @Override
    public void addNewBeverage(String bevName, Size size) {
        boolean isWeekend = (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY);
        beverages.add(new Alcohol(bevName, size, isWeekend));
    }

    /**
     * Calculates the total cost of all beverages in the order.
     * 
     * @return the total price of the order
     */
    @Override
    public double calcOrderTotal() {
        double total = 0;
        for (Beverage beverage : beverages) {
            total += beverage.calcPrice();
        }
        return total;
    }

    /**
     * Returns the total number of beverages in the order.
     * 
     * @return the number of beverages
     */
    @Override
    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the list of beverages in the order.
     * 
     * @return the list of beverages
     */
    public ArrayList<Beverage> getBeverages() {
        return beverages;
    }

    /**
     * Compares this order to another based on the order number.
     * 
     * @param other the other order to compare to
     * @return 0 if equal, -1 if this order is smaller, 1 if this order is larger
     */
    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.orderNumber, other.orderNumber);
    }

    /**
     * Returns a deep copy of the customer associated with the order.
     * 
     * @return a copy of the customer
     */
    public Customer getCustomer() {
        return new Customer(customer);
    }

    /**
     * Returns the order number.
     * 
     * @return the order number
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Returns the time the order was placed.
     * 
     * @return the order time
     */
    public int getOrderTime() {
        return orderTime;
    }

    /**
     * Returns the day the order was placed.
     * 
     * @return the order day
     */
    public Day getOrderDay() {
        return orderDay;
    }

    /**
     * String representation of the order, including order number, time, day,
     * customer information, and the list of beverages.
     * 
     * @return the string representation
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Number: ").append(orderNumber)
          .append("\nOrder Time: ").append(orderTime)
          .append("\nOrder Day: ").append(orderDay)
          .append("\nCustomer: ").append(customer)
          .append("\nBeverages:\n");
        for (Beverage beverage : beverages) {
            sb.append(beverage.toString()).append("\n");
        }
        sb.append("Total Price: $").append(String.format("%.2f", calcOrderTotal()));
        return sb.toString();
    }

	public int getTotalItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isWeekend() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setOrderNumber(int orderNumber2) {
		// TODO Auto-generated method stub
		
	}

	public void addNewBeverage(String bevName, Size size, boolean b) {
		// TODO Auto-generated method stub
		
	}
}
