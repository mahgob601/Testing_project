package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class UnitTesting {
    @Test
    public void AccountTest() {
        Account client1 = new Account("Seif");
        client1.updateBalance(866);
        client1.setName("Seif");
        assertEquals(866,client1.getBalance());
        assertEquals("Seif",client1.getName());
        client1.updateBalance(10);
        assertEquals(876,client1.getBalance());
    }

    @Test
    public void AccountTest2() {
        Account client1 = new Account("Seif");
        client1.updateBalance(866);
        client1.setName("Seif");
        assertNotEquals(86,client1.getBalance());
        client1.updateBalance(10);
        assertNotEquals(76,client1.getBalance());
    }

    @Test
    public void AccountTest3() {
        Account client1 = new Account("Seif");
        client1.updateBalance(-866);
        client1.setName("Seif");
        assertEquals(0,client1.getBalance());
        client1.updateBalance(10);
        assertNotEquals(76,client1.getBalance());
    }

    @Test
    public void ClientTest(){
        Client client1=new Client("Yara","12345","0129232434","NasrCity");
        assertEquals("Yara",client1.getName());
        assertEquals("12345", client1.getPassword());
        assertEquals("0129232434",client1.getPhoneNo());
        assertEquals("NasrCity",client1.getAddress());
    }

    @Test
    public void TransactionTest(){
        Client client1 = new Client("Seif","****");
        Transaction trans1=new Transaction("Withdraw",200,client1.getAccount());
        assertEquals(0,client1.getAccount().getBalance());

        Transaction trans2 = new Transaction("Deposit",200,client1.getAccount());
        assertEquals(200,client1.getAccount().getBalance());

        Client client2 = new Client("Yassin","******");
        Transaction trans3 = new Transaction("Transfer",200,client1.getAccount(),client2.getAccount());
        assertEquals(0,client1.getAccount().getBalance());
        assertEquals(200,client2.getAccount().getBalance());

        Transaction trans4=new Transaction("Withdraw",100,client2.getAccount());
        assertEquals(100,client2.getAccount().getBalance());
    }


    @Test
    public void TransactionTest2(){ //tests the printed out transactions made by a certain account
        ArrayList<String> transactions_list1= new ArrayList<String>(){{
           add("Deposit $400.0 Successful");
           add("Deposit $600.0 Successful");
           add("Withdraw $150.0 Successful");
           add("Transfer $150.0 Successful");
        }
        };
        Client client8 = new Client("Seif Sameh","*****");
        Client client9 = new Client("Yassin Mahgoub","*****");

        Transaction trans = new Transaction("Deposit", 400, client8.getAccount());
        Transaction trans2 = new Transaction("Deposit", 600, client8.getAccount());
        Transaction trans3 = new Transaction("Withdraw", 150, client8.getAccount());
        Transaction trans4 = new Transaction("Transfer", 150, client8.getAccount(), client9.getAccount());
        assertEquals(transactions_list1,client8.getAccount().getTransactions_list());

    }
    @Test
    public void TransactionTest3(){
        Client client1 = new Client("Seif","****");
        Transaction trans1=new Transaction("Withdraw",200,client1.getAccount());
        assertEquals(0,client1.getAccount().getBalance());

        Transaction trans2 = new Transaction("Deposit",-200,client1.getAccount());
        assertEquals(0,client1.getAccount().getBalance());

        Transaction trans6 = new Transaction("Deposit",200,client1.getAccount());
        assertEquals(200,client1.getAccount().getBalance());

        Client client2 = new Client("Yassin","******");
        Transaction trans3 = new Transaction("Transfer",400,client1.getAccount(),client2.getAccount());
        //wont proceed transfering money because its not availble in the client's account
        assertEquals(200,client1.getAccount().getBalance());

        /*Transaction trans4=new Transaction("Withdraw",100,client2.getAccount());
        assertEquals(100,client2.getAccount().getBalance());*/
    }
}