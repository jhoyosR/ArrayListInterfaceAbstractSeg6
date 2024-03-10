package cuentaBancariaEj2;

public interface IClient {
    void save(Client client);
    public void depositCurrentAccount(String name, double amount);
    public void withdrawCurrentAccount (String name, double amount);
    public void depositSavingsAccount (String name, double amount);
    public void withdrawSavingsAccount (String name, double amount);
    public void investCDT (String name, double amount, double monthlyInterest);
    public void closeCDT (String name);
    public double consultBalanceCurrentAccount (String name);
    public double consultBalanceSavingsAccount (String name);
    public double consultBalanceCDT (String name);
    public double consultTotalBalance (String name);
    public void showClients ();
}
