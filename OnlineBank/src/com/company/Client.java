package com.company;
public class Client {
    private String Name;
    private String phoneNo;
    private String Address;
    private String Password;
    private Account account;

    public Client(String Name, String Password){
        this.Name = Name;
        this.Password = Password;
        createAccount();
    }
    public Client(String Name, String Password, String phoneNo){
        this.Name = Name;
        this.Password = Password;
        this.phoneNo = phoneNo;
        createAccount();
    }
    public Client(String Name, String Password, String phoneNo, String Address){
        this.Name = Name;
        this.Password = Password;
        this.phoneNo = phoneNo;
        this.Address = Address;
        createAccount();
    }
    private void createAccount(){
        this.account = new Account(Name);
    }

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public String getPassword() {
        return Password;
    }
}