package com.company;

public class Transaction {
    private String type;
    //private String time;
    private double amount;
    private Account account;
    private Account transferAccount;


    public Transaction(String type, double amount, Account account)
    {
        this.type = type;
        //this.time = time;
        this.account = account;
        this.amount = amount;
        checkType();
    }
    public Transaction(String type, double amount, Account account,Account transferAccount)
    {
        this.type = type;
        //this.time = time;
        this.account = account;
        this.transferAccount = transferAccount;
        this.amount = amount;
        checkType();
    }

    public void checkType(){
        if(type == "Withdraw"){
            withdraw();
        }
        else if(type == "Deposit"){
            deposit();
        }
        else if(type == "Transfer"){
            transferMoney();
        }
    }

    public void withdraw()
    {
        account.updateBalance(-amount);
    }

    public void deposit(){
        account.updateBalance(amount);
    }

    public void transferMoney(){
        if(account.getBalance()<amount){
            System.out.println("Can't proceed transfer");
        }
        else{
        account.updateBalance(-amount);
        transferAccount.updateBalance(amount);

        System.out.println(amount + " Transferred Successfully!");
             }
    }
}