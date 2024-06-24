package org.banksystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KCB kcb = new KCB("KCB", "Nairobi");
        Equity equity = new Equity("Equity", "Nakuru");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Banking System Menu:");
            System.out.println("1. Add Customer to KCB");
            System.out.println("2. Add Customer to Equity");
            System.out.println("3. Display All Customers in KCB");
            System.out.println("4. Display All Customers in Equity");
            System.out.println("5. Deposit Money to KCB");
            System.out.println("6. Deposit Money to Equity");
            System.out.println("7. Withdraw Money from KCB");
            System.out.println("8. Withdraw Money from Equity");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCustomerToBank(scanner, kcb);
                    break;
                case 2:
                    addCustomerToBank(scanner, equity);
                    break;
                case 3:
                    kcb.displayAllCustomers();
                    break;
                case 4:
                    equity.displayAllCustomers();
                    break;
                case 5:
                    depositMoney(scanner, kcb);
                    break;
                case 6:
                    depositMoney(scanner, equity);
                    break;
                case 7:
                    withdrawMoney(scanner, kcb);
                    break;
                case 8:
                    withdrawMoney(scanner, equity);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCustomerToBank(Scanner scanner, Bank bank) {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        BankAccount account = new BankAccount(accountNumber, balance, name);
        Customer customer = new Customer(name, customerId, account);
        bank.addCustomer(customer);
    }

    private static void depositMoney(Scanner scanner, Bank bank) {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        Customer customer = bank.findCustomerById(customerId);

        if (customer != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            customer.getAccount().deposit(amount);
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void withdrawMoney(Scanner scanner, Bank bank) {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        Customer customer = bank.findCustomerById(customerId);

        if (customer != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            customer.getAccount().withdraw(amount);
        } else {
            System.out.println("Customer not found.");
        }
    }
}
