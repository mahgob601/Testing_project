import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// BOTTOM-UP Approach with Account and Client as actual code and drivers Transaction
//Creation of Client implies creation of Account
public class AccountClientDriver {
    class driver{
        public boolean format(Client client){
            client.getAccount().updateBalance(2000);
            client.getAccount().updateBalance(-500);
            if(client.getAccount().getBalance()==1500){
                return true;
            }
            return false;
        }
        public boolean format1(Client client){
            client.getAccount().addTransaction("Deposit $2000 Successful");
            client.getAccount().addTransaction("Withdraw $500 Successful");
            if(client.getAccount().getTransactions_list().get(0)=="Deposit $2000 Successful" && client.getAccount().getTransactions_list().get(1)=="Withdraw $500 Successful"){
                return true;
            }
            return false;
        }
        public boolean format2(Client client,String Name){
            if(client.getAccount().getName() == Name){
                return true;
            }
            return false;
        }
    }

    Client c1;
    AccountClientDriver.driver d1;

    @Test
    @DisplayName("AccountClient Driver 1st Test Case")
    public void testAccountClientDriver1(){
        c1 = new Client("Name","Password");
        d1 = new AccountClientDriver.driver();
        assertTrue(d1.format(c1));
    }
    @Test
    @DisplayName("AccountClient Driver 2nd Test Case")
    public void testAccountClientDriver2(){
        c1 = new Client("Name","Password");
        c1.getAccount().updateBalance(1000);
        d1 = new AccountClientDriver.driver();
        assertFalse(d1.format(c1));
    }
    @Test
    @DisplayName("AccountClient Driver 3rd Test Case")
    public void testAccountClientDriver3(){
        c1 = new Client("Name","Password");
        c1.getAccount().addTransaction("Deposit $400.0 Successful");
        d1 = new AccountClientDriver.driver();
        assertFalse(d1.format1(c1));
    }
    @Test
    @DisplayName("AccountClient Driver 4th Test Case")
    public void testAccountClientDriver4(){
        c1 = new Client("Name","Password");
        d1 = new AccountClientDriver.driver();
        assertEquals(true,d1.format2(c1,"Name"));
    }
    @Test
    @DisplayName("AccountClient Driver 5th Test Case")
    public void testAccountClientDriver5(){
        c1 = new Client("Name","Password");
        d1 = new AccountClientDriver.driver();
        assertEquals(false,d1.format2(c1,"NAME"));
    }
}
