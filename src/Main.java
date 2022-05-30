public class Main {
    public static void main(String[] args){
       /* Client client1 = new Client("Seif","****");
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
        System.out.println(client2.getPhoneNo());*/

        Client client8 = new Client("Seif Sameh","*****");
        Client client9 = new Client("Yassin Mahgoub","*****");

        Transaction trans = new Transaction("Deposit", 400, client8.getAccount());

        Transaction trans2 = new Transaction("Deposit", 600, client8.getAccount());
        Transaction trans3 = new Transaction("Withdraw", 150, client8.getAccount());
        Transaction trans4 = new Transaction("Transfer", 150, client8.getAccount(), client9.getAccount());
        //System.out.println(client8.getAccount().getBalance());
        Transaction trans6 = new Transaction("Pay",client8.getAccount(),"50091");


        client8.getAccount().printTransactions();
        System.out.println("\n");

        System.out.println(client8.getAccount().getBalance());
        //client9.getAccount().printTransactions();
    }
}
