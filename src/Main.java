public class Main {
    public static void main(String[] args){
        Client client1 = new Client("Seif","****");
        System.out.println(client1.getName());
        Transaction trans1 = new Transaction("Withdraw",200,client1.getAccount());
        System.out.println(client1.getAccount().getBalance());
        Transaction trans2 = new Transaction("Deposit",200,client1.getAccount());
        System.out.println(client1.getAccount().getBalance());
        Client client2 = new Client("Yassin","******");
        Transaction trans3 = new Transaction("Transfer",200,client1.getAccount(),client2.getAccount());
        System.out.println(client1.getAccount().getBalance());
        System.out.println(client2.getAccount().getBalance());
        System.out.println(client1.getPassword());
        System.out.println(client2.getPassword());
        System.out.println(client1.getPhoneNo());
        System.out.println(client2.getPhoneNo());
    }
}
