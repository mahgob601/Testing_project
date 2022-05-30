package com.company;

public class WithDraw extends Transaction {
    private double amount;
    private int accountno;


    public WithDraw(String type, String time, String date) {
        super();
    }

    public void amountW(int amount)
    {
        balance -= amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }
}
