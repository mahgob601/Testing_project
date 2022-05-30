package com.company;
public class Account {
    private String Name;
    private int AccountNo;
    private double Balance;
    private static int counter=0;

    public Account(String Name){
        this.Name = Name;
        this.AccountNo = counter;
        counter++;
        this.Balance = 0;
        System.out.println("Account Created");
    }

    public double getBalance() {
        return Balance;
    }

    public void updateBalance(double balance){
        if ((Balance <= 0) && (balance < 0)){
            System.out.println("Invalid Balance");
        }
        else{
            Balance += balance;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }
}