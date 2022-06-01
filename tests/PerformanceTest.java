import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;


public class PerformanceTest {
    //Client clients[];

    @Test(timeout=550)
    public void test_performance1(){
        Client client1 = new Client("Seif","****");
        Client client2 = new Client("Seif2","****");
        for (int i=20; i<100000;i++){
            Transaction trans1 = new Transaction("Deposit",i,client1.getAccount());
            Transaction trans3 = new Transaction("Deposit",i,client2.getAccount());
        }
        for (int i=20; i<100000;i++){
            Transaction trans2 = new Transaction("Withdraw",i,client1.getAccount());
            Transaction trans4 = new Transaction("Withdraw",i,client2.getAccount());
        }
    }

    @Test(timeout=3000)
    public void test_performance2(){
        Client client1 = new Client("Seif","****");
        Client client2 = new Client("Seif2","****");
        for (int i=20; i<100000;i++){
            Transaction trans1 = new Transaction("Deposit",i,client1.getAccount());
            Transaction trans3 = new Transaction("Deposit",i,client2.getAccount());
        }
        for (int i=20; i<100000;i++){
            Transaction trans5 = new Transaction("Transfer",i,client1.getAccount(),client2.getAccount());
        }
    }
}

