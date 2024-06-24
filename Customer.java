package org.banksystem;

public class Customer {
    private String name;
    private String customerId;
    private BankAccount account;

    public Customer(String name, String customerId, BankAccount account) {
        this.name = name;
        this.customerId = customerId;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        account.displayAccountInfo();
    }

//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("123456789", 1000.50, "John Doe");
//        Customer customer = new Customer("John Doe", "C001", account);
//        customer.displayCustomerInfo();
//    }
}
