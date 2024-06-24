package org.banksystem;

public class KCB extends Bank {
    private String branchName;

    public KCB(String bankName, String branchName) {
        super(bankName);
        this.branchName = branchName;
    }



    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public void displayAllCustomers() {
        super.displayAllCustomers();
        System.out.println("Branch: " + branchName);
    }

//    public static void main(String[] args){
//        KCB kcbBranch = new KCB("Kenya Commercial Bank", "Nairobi Branch");
//
//
//    }
}

