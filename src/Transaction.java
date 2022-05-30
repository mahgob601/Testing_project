public class Transaction {
    private String type;
    //private String time;
    private double amount;
    private Account account;
    private Account transferAccount;
    private String payCode;


    public Transaction(String type, double amount, Account account)
    {
        this.type = type;
        //this.time = time;
        this.account = account;
        this.amount = amount;

        account.addTransaction(type + " $" + amount);
        checkType();
    }
    public Transaction(String type, double amount, Account account, String code)
    {
        this.type = type;
        //this.time = time;
        this.account = account;
        this.amount = amount;
        this.payCode = code;

        account.addTransaction("Item with code "+ code + " was purchased " +type + " $" + amount);
        checkType();
    }
    public Transaction(String type, double amount, Account account,Account transferAccount)
    {
        this.type = type;
        //this.time = time;
        this.account = account;
        this.transferAccount = transferAccount;
        this.amount = amount;

        transferAccount.addTransaction("$" + amount + " were transferred to you from " + account.getName());
        account.addTransaction(type + "red $" + amount + " to " + transferAccount.getName());
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
