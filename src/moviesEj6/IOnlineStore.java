package moviesEj6;

public interface IOnlineStore {
    public void addItem(Object item);
    public void recordSale(Object item);
    public void displayInventory();
    public void displayTotalSales();
}
