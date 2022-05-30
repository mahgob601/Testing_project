public class Main {
    public static void main(String[] args){
        Client client1 = new Client("Seif");
        client1.createAccount();
        System.out.println(client1.getName());
        System.out.println(client1.getAccount().getBalance());
        Client client2 = new Client("Yara");
        client1.createAccount();
        System.out.println(client2.getName());
        System.out.println(client2.getAccount().getAccountNo());

    }
}
