public class Client {
    private String Name;
    private String phoneNo;
    private String Address;
    //private int AccountNo;
    private Account account;

    public Client(String Name){
        this.Name = Name;
        this.phoneNo = phoneNo;
        createAccount();
    }
    public Client(String Name, String phoneNo){
        this.Name = Name;
        this.phoneNo = phoneNo;
        createAccount();
    }
    public Client(String Name, String phoneNo, String Address){
        this.Name = Name;
        this.phoneNo = phoneNo;
        this.Address = Address;
        createAccount();
    }
    public void createAccount(){
        this.account = new Account(Name);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void deposit(){}
    public void withdraw(){}
}
