package org.banksystem;

public class Equity extends Bank {
    private String region;

    public Equity(String bankName, String region) {
        super(bankName);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public void displayAllCustomers() {
        super.displayAllCustomers();
        System.out.println("Region: " + region);
    }

//    public static void main(String[] args){
//        Equity equityBranch = new Equity("Equity Bank", "Western Region");
//    }
}

