import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountClientTransactionTester {
    Client client1;
    Client client2;
    Transaction trans;
    Transaction trans2;
    Transaction trans3;

    @BeforeEach
    public void setUp() {
        client1 = new Client("Seif Sameh","*****");
        client2 = new Client("Yassin Mahgoub","*****");
    }

    @Test
    @DisplayName("Test Case 1")
    public void test1(){
        trans = new Transaction("Deposit", 400, client1.getAccount());
        assertEquals(400,client1.getAccount().getBalance());
    }
    @Test
    @DisplayName("Test Case 2")
    public void test2(){
        Transaction trans1 = new Transaction("Deposit", 600, client1.getAccount());
        trans2 = new Transaction("Withdraw", 150, client1.getAccount());
        assertEquals(450,client1.getAccount().getBalance());
    }
    @Test
    @DisplayName("Test Case 3")
    public void test3(){
        trans = new Transaction("Deposit", 600, client1.getAccount());
        trans2 = new Transaction("Withdraw", 150, client1.getAccount());
        trans3 = new Transaction("Transfer", 150, client1.getAccount(), client2.getAccount());
        assertEquals(300,client1.getAccount().getBalance());
    }
    @Test
    @DisplayName("Test Case 4")
    public void test4(){
        trans = new Transaction("Deposit", 600, client1.getAccount());
        trans2 = new Transaction("Withdraw", 150, client1.getAccount());
        trans3 = new Transaction("Transfer", 150, client1.getAccount(), client2.getAccount());
        assertEquals(150,client2.getAccount().getBalance());
    }
    @Test
    @DisplayName("Test Case 5")
    public void test5(){
        trans = new Transaction("Deposit", 600, client1.getAccount());
        trans2 = new Transaction("Pay",client1.getAccount(),"30091");
        assertEquals(200,client1.getAccount().getBalance());
    }

    @AfterEach
    public void tearDown(){
        client1 = null;
        client2 = null;
    }

}
