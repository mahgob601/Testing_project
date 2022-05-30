import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// BOTTOM-UP Approach with Account as actual code and drivers Client and Transaction
class AccountDriver{
    class driver{
        public boolean format(Account account){
            account.updateBalance(-200);
            account.updateBalance(300);
            if(account.getBalance()==1100){
                return true;
            }
            return false;
        }
        public boolean format1(Account account){
            account.addTransaction("Deposit $200 Successful");
            account.addTransaction("Withdraw $100 Successful");
            if(account.getTransactions_list().get(0)=="Deposit $200 Successful" && account.getTransactions_list().get(1)=="Withdraw $100 Successful"){
                return true;
            }
            return false;
        }
        public boolean format2(Account account,String Name){
            if(account.getName() == Name){
                return true;
            }
            return false;
        }
    }

    Account a1;
    driver d1;

    @Test
    @DisplayName("Account Driver First Test Case")
    public void testAccountDriver1(){
        a1 = new Account("Name");
        a1.updateBalance(1000);
        d1 = new driver();
        assertTrue(d1.format(a1));
    }
    @Test
    @DisplayName("Account Driver Second Test Case")
    public void testAccountDriver2(){
        a1 = new Account("Name");
        a1.updateBalance(2000);
        d1 = new driver();
        assertFalse(d1.format(a1));
    }
    @Test
    @DisplayName("Account Driver Third Test Case")
    public void testAccountDriver3(){
        a1 = new Account("Name");
        a1.updateBalance(1000);
        d1 = new driver();
        assertTrue(d1.format1(a1));
    }
    @Test
    @DisplayName("Account Driver Fourth Test Case")
    public void testAccountDriver4(){
        a1 = new Account("Name");
        a1.addTransaction("Deposit $400.0 Successful");
        d1 = new driver();
        assertFalse(d1.format1(a1));
    }
    @Test
    @DisplayName("Account Driver 5th Test Case")
    public void testAccountDriver5(){
        a1 = new Account("Name");
        d1 = new driver();
        assertEquals(true,d1.format2(a1,"Name"));
    }
    @Test
    @DisplayName("Account Driver 6th Test Case")
    public void testAccountDriver6(){
        a1 = new Account("Name");
        d1 = new driver();
        assertEquals(false,d1.format2(a1,"NAME"));
    }

}
