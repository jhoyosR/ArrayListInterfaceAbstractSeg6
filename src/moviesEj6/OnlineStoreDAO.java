package moviesEj6;

import java.util.ArrayList;

public class OnlineStoreDAO extends OnlineStoreAbs{
    public ArrayList<Object> inventory;
    private double totalSales;

    public OnlineStoreDAO() {
        inventory = new ArrayList<>();
        totalSales = 0.0f;
    }
    @Override
    public void addItem(Object item) {
        inventory.add(item);
    }
    @Override
    public void recordSale(Object item) {
        if (item instanceof Book) {
            totalSales += ((Book) item).getPrice();
            inventory.remove(item);
        } else if (item instanceof Movie) {
            totalSales += ((Movie) item).getPrice();
            inventory.remove(item);
        }
    }
    @Override
    public void displayInventory() {
        System.out.println("Available Books and Movies:");
        for (Object item : inventory) {
            System.out.println(item);
        }
    }
    @Override
    public void displayTotalSales() {
        System.out.println("Total sales: $" + totalSales);
    }
}