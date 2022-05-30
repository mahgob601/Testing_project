package com.company;

public class WithDraw extends Transaction {
    private double amount;
    //private int accountno;


    public WithDraw(String type, String time, String date) {
        super();
    }

    public void withdraw(double amount)
    {
        Balance = Balance - amount;
    }

}
