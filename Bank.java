package org.banksystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    private String bankName;

    public Bank(String bankName) {
        this.customers = new ArrayList<>();
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayAllCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer customer : customers) {
            customer.displayCustomerInfo();
            System.out.println("---------------");
        }
    }

    public Customer findCustomerById(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

//    public static void main(String[] args){
//        Bank bank = new Bank("Kcb");
//    }

}

