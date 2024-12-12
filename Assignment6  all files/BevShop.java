package package1;

import java.util.ArrayList;

public class BevShop implements BevShopInterface {
    private ArrayList<Order> orders;
    private int numOfAlcoholicDrinks;
    private final int MAX_ALCOHOL = 3;
    private final int MIN_AGE_FOR_ALCOHOL = 21;
    private Order currentOrder;

    public BevShop() {
        this.orders = new ArrayList<>();
        this.numOfAlcoholicDrinks = 0;
    }

    @Override
    public void startNewOrder(int time, Day day, String customerName, int customerAge) {
        currentOrder = new Order(time, day, new Customer(customerName, customerAge));
        numOfAlcoholicDrinks = 0;
        orders.add(currentOrder);
    }

    @Override
    public void processAlcoholOrder(String bevName, Size size) {
        if (currentOrder.getCustomer().getAge() < MIN_AGE_FOR_ALCOHOL) {
            throw new IllegalArgumentException("Customer is not of legal age to order alcohol.");
        }

        if (numOfAlcoholicDrinks >= MAX_ALCOHOL) {
            throw new IllegalStateException("Cannot order more than " + MAX_ALCOHOL + " alcoholic beverages per order.");
        }

        currentOrder.addNewBeverage(bevName, size, true);
        numOfAlcoholicDrinks++;
    }

    @Override
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtein);
    }

    @Override
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
    }

    @Override
    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public double totalMonthlySale() {
        double total = 0;
        for (Order order : orders) {
            for (Beverage beverage : order.getBeverages()) {
                total += beverage.calcPrice();
            }
        }
        return total;
    }

    @Override
    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }

    @Override
    public Order getOrderAtIndex(int index) {
        return orders.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Order order : orders) {
            sb.append(order).append("\n");
        }
        sb.append("Total Monthly Sale: ").append(totalMonthlySale());
        return sb.toString();
    }

	@Override
	public boolean isValidTime(int time) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMaxNumOfFruits() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinAgeForAlcohol() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMaxOrderForAlcohol() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEligibleForMore() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumOfAlcoholDrink() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isValidAge(int age) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order getCurrentOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		
	}
}

