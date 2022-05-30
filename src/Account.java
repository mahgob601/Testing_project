import java.util.ArrayList;

public class Account {
    private String Name;
    private int AccountNo;
    private double Balance;
    private static int counter=0;
    private ArrayList<String> transactions_list= new ArrayList<String>();



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

    public String updateBalance(double balance) {
        if ((Balance+balance< 0) && (balance < 0)){
            System.out.println("Invalid Transaction");
            return("Failed");
        }
        else{
            Balance += balance;
            return ("Successful");
        }
    }

    public void addTransaction(String transact)
    {
        this.transactions_list.add(transact);
    }

    public ArrayList<String> getTransactions_list() {
        return transactions_list;
    }

    public void printTransactions()
    {
        int val = 0;
        while(transactions_list.size() > val)
        {
            System.out.println(transactions_list.get(val));
            val++;
        }
    }

    public String getName() {
        return Name;
    }

    public int getAccountNo() {
        return AccountNo;
    }
}