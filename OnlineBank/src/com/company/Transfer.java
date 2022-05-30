package com.company;

public class Transfer extends Transaction {
    private int accountno;
    private int amount;
    private int reciever_accountno;

    public Transfer(String type, String time, String date) {
        super();
    }


    public void tranferMoney(int accountno,int reciever_accountno,int amount){

            balance.reciever_accountno = balance.reciever_accountno + deposit.Amountaccountno;
            balance.Amountaccountno = balance.Amountaccountno - deposit.Amountaccountno;
    }
}
