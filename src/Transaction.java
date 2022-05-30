import java.util.Random;
public class Transaction {
    private String type;
    //private String time;
    private double amount;
    private Account account;
    private Account transferAccount;

    private String payCode;


    Random r = new Random();
    double price = 100 + (500 - 100) * r.nextDouble();


    public Transaction(String type, double amount, Account account)
    {
        this.type = type;
        //this.time = time;
        this.account = account;
        this.amount = amount;


        checkType();
    }

    public Transaction(String type,Account account, String code)
    {
        this.type = type;

        //this.time = time;
        this.account = account;

        this.payCode = code;

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
        else if(type == "Pay")
        {
            payOnline();

        }
    }

    public void payOnline()
    {
        String check = account.updateBalance(-price);
        if(check == "Successful")
        {
            this.account.addTransaction("Item with code "+ this.payCode + " was purchased "  + " $" + price + " Successfully");
        }
        else
        {
            this.account.addTransaction("Unable to purchase item with code "+ this.payCode);
        }

    }

    public void withdraw()
    {
        String check;
        check = account.updateBalance(-amount);
        if(check == "Successful")
        {
            this.account.addTransaction(type + " $" + amount + " Successful");
        }
        else
        {
            this.account.addTransaction(type + " $" + amount + " Failed");
        }


    }

    public void deposit(){
        account.updateBalance(amount);
        this.account.addTransaction(type + " $" + amount + " Successful");
    }

    public void transferMoney(){
        if(account.getBalance()<amount){
            System.out.println("Can't proceed transfer");
            this.account.addTransaction(type + " $" + amount + " Failed");

        }
        else{
            account.updateBalance(-amount);
            transferAccount.updateBalance(amount);
            this.account.addTransaction(type + " $" + amount + " Successful");
            account.addTransaction(type + "red $" + amount + " to " + transferAccount.getName());
            transferAccount.addTransaction("$" + amount + " were transferred to you from " + account.getName());
            System.out.println(amount + " Transferred Successfully!");
        }
    }

}
