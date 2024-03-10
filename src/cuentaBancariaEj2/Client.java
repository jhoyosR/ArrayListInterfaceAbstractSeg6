package cuentaBancariaEj2;

import java.util.ArrayList;

public class Client extends ClientAbs{
    public String name;
    private double balanceCurrentAccount;
    private double balanceSavingsAccount;
    private double balanceCDT;
    public ArrayList<Client> clients;

    // Constructor
    public Client(String name) {
        this.name = name;
        balanceCurrentAccount = 0;
        balanceSavingsAccount = 0;
        balanceCDT = 0;
        clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void save(Client client) {
        clients.add(client);
    }
    @Override
    public void depositCurrentAccount(String name, double amount) {
        for (Client client : clients) {
            if (client.getName().equals(name)) {
                client.balanceCurrentAccount += amount;
            }
        }
    }
    @Override
        public void withdrawCurrentAccount (String name, double amount) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    client.balanceCurrentAccount -= amount;
                }
            }
        }
    @Override
        public void depositSavingsAccount (String name, double amount) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    client.balanceSavingsAccount += amount;
                }
            }
        }
    @Override
        public void withdrawSavingsAccount (String name, double amount) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    client.balanceSavingsAccount -= amount;
                }
            }
        }
    @Override
        public void investCDT (String name, double amount, double monthlyInterest) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    client.balanceCDT += amount;
                    double interests = client.balanceCDT * (monthlyInterest / 100);
                    client.balanceCurrentAccount += interests;
                }
            }
        }
    @Override
        public void closeCDT (String name) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    client.balanceCurrentAccount += balanceCDT;
                    client.balanceCDT = 0;
                }
            }
        }
    @Override
        public double consultBalanceCurrentAccount (String name) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    return client.balanceCurrentAccount;
                }
            }
            return 0;
        }
    @Override
        public double consultBalanceSavingsAccount (String name) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    return client.balanceSavingsAccount;
                }
            }
            return 0;
        }
    @Override
        public double consultBalanceCDT (String name) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    return client.balanceCDT;
                }
            }
            return 0;
        }
    @Override
        public double consultTotalBalance (String name) {
            for (Client client : clients) {
                if (client.getName().equals(name)) {
                    return client.balanceCurrentAccount + client.balanceSavingsAccount + client.balanceCDT;
                }
            }
            return 0;
        }
    @Override
        public void showClients () {
            for (Client client : clients) {
                System.out.println(client);
            }
        }
}