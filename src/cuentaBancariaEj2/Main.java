package cuentaBancariaEj2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client clientToAdd = new Client("Test");

        int option;
        double amount;
        double monthlyInterest;

        do {
            System.out.println("Banking Operations Menu");
            System.out.println("11. Add Client");
            System.out.println("1. Deposit into Current Account");
            System.out.println("2. Withdraw from Checking Account");
            System.out.println("3. Deposit into Savings Account");
            System.out.println("4. Withdraw from Savings Account");
            System.out.println("5. Invest in CDT");
            System.out.println("6. Close CDT");
            System.out.println("7. Consult Balance Current Account");
            System.out.println("8. Consult Balance Savings Account");
            System.out.println("9. Consult CDT Balance");
            System.out.println("10. Consult Total Balance");
            System.out.println("12. Client's information");
            System.out.println("0. Close");
            System.out.print("Insert the desired option ");
            option = scanner.nextInt();

            switch (option) {
                case 11:
                    System.out.println("Employee's name:");
                    String name = scanner.next();

                    Client clientToAdd1 = new Client(name);
                    clientToAdd.save(clientToAdd);
                    System.out.println("Employee added successfully");
                    break;
                case 1:
                    System.out.println("To which client would you like to deposit in his current account");
                    String clientDepositToMakeinCA = scanner.next();
                    System.out.print("Enter the amount to deposit in Current Account: ");
                    amount = scanner.nextDouble();
                    clientToAdd.depositCurrentAccount(clientDepositToMakeinCA, amount);
                    break;
                case 2:
                    System.out.println("To which client would you like to withdraw from his current account");
                    String clientWithdrawToMakeFromCA = scanner.next();
                    System.out.print("Enter the amount to withdraw in Current Account: ");
                    amount = scanner.nextDouble();
                    clientToAdd.withdrawCurrentAccount(clientWithdrawToMakeFromCA, amount);
                    break;
                case 3:
                    System.out.println("To which client would you like to deposit in his savings account");
                    String clientDepositToMakeinSA = scanner.next();
                    System.out.print("Enter the amount to deposit in Savings Account: ");
                    amount = scanner.nextDouble();
                    clientToAdd.depositSavingsAccount(clientDepositToMakeinSA, amount);
                    break;
                case 4:
                    System.out.println("To which client would you like to withdraw from his current account");
                    String clientWithdrawToMakeFromSA = scanner.next();
                    System.out.print("Enter the amount to withdraw in Savings Account:: ");
                    amount = scanner.nextDouble();
                    clientToAdd.withdrawSavingsAccount(clientWithdrawToMakeFromSA, amount);
                    break;
                case 5:
                    System.out.println("To which client would you like to invest in CDT");
                    String clientInvestToMakeInCDT = scanner.next();
                    System.out.print("Enter the amount to invest in CDT: ");
                    amount = scanner.nextDouble();
                    System.out.print("Enter the monthly interest of the CDT (%): ");
                    monthlyInterest = scanner.nextDouble();
                    clientToAdd.investCDT(clientInvestToMakeInCDT, amount, monthlyInterest);
                    break;
                case 6:
                    System.out.println("To which client would you like to close invest in CDT");
                    String clientInvestToClose = scanner.next();
                    clientToAdd.closeCDT(clientInvestToClose);
                    break;
                case 7:
                    System.out.println("To which client would you like to know the balance in CA");
                    String clientBalanceToConsultInCA = scanner.next();
                    System.out.println("Balance Current Account $" + clientToAdd.consultBalanceCurrentAccount(clientBalanceToConsultInCA));
                    break;
                case 8:
                    System.out.println("To which client would you like to know the balance in SA");
                    String clientBalanceToConsultInSA = scanner.next();
                    System.out.println("Balance Savings Account: $" + clientToAdd.consultBalanceSavingsAccount(clientBalanceToConsultInSA));
                    break;
                case 9:System.out.println("To which client would you like to know the balance in CDT");
                    String clientBalanceToConsultInCDT = scanner.next();
                    System.out.println("CDT balance: $" + clientToAdd.consultBalanceCDT(clientBalanceToConsultInCDT));
                    break;
                case 10:
                    System.out.println("To which client would you like to know the balance in all accounts");
                    String clientBalanceToConsultInAllAccounts = scanner.next();
                    System.out.println("Total balance: $" + clientToAdd.consultTotalBalance(clientBalanceToConsultInAllAccounts));
                    break;
                case 12:
                    clientToAdd.showClients();
                    break;
                case 0:
                    System.out.println("Closing software");
                    break;
                default:
                    System.out.println("Invalid option, try again");
            }
        } while (option != 0);
    }
}