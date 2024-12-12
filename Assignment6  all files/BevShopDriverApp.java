package package1;

public class BevShopDriverApp {
    public static void main(String[] args) {
        BevShop shop = new BevShop();

        // First order
        shop.startNewOrder(10, Day.MONDAY, "John", 25);
        shop.processCoffeeOrder("Latte", Size.MEDIUM, true, false);
        shop.processAlcoholOrder("Whiskey", Size.LARGE);
        shop.processSmoothieOrder("Berry Blast", Size.SMALL, 3, true);
        System.out.println("First Order: ");
        System.out.println(shop.getOrderAtIndex(0));

        // Second order
        shop.startNewOrder(15, Day.SUNDAY, "Ray", 18);
        shop.processCoffeeOrder("Espresso", Size.SMALL, false, true);
        shop.processSmoothieOrder("Mango Delight", Size.LARGE, 5, true);
        System.out.println("\nSecond Order: ");
        System.out.println(shop.getOrderAtIndex(1));

        // Monthly sales report
        System.out.println("\nMonthly Report: ");
        System.out.println(shop);
    }
}
