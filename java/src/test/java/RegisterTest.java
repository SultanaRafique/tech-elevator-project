import com.techelevator.Register;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RegisterTest {

    @Test
    public void updateUserBalance_withValidData_ShouldReturnCorrectBalance(){
        Register register = new Register();
        double data = 1000;
        double expected = 1000;

    }

    @Test
    public void returnChange_withQuarters_ShouldReturnCorrectChange(){
        Register register = new Register();
        String expected = "your change is 4 Quarter(s) 0 Dime(S) 0 Nickel(s).";
        String result = register.returnChange(100);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void returnChange_withQuartersAndDimes_ShouldReturnCorrectChange(){
        Register register = new Register();
        String expected = "your change is 6 Quarter(s) 1 Dime(S) 0 Nickel(s).";
        String result = register.returnChange(160);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void feedMoneyMethod_withValidData_ShouldReturnUpdatedUserBalance(){
        Register register = new Register();
        int expected = 100;
        int Actual = (int)(register.moneyFeed("$1") );
        Assert.assertEquals(expected, Actual);
    }

    @Test
    public void displayUserBalance_withValidData_ShouldReturnCorrectlyFormattedUserBalance(){
        Register register = new Register();
        register.setUserBalance(100);
        double expected = 1.00;
        double result = register.displayUserBalance();
        Assert.assertEquals(expected, result,1);
    }

    @Test
    public void displayUserBalance_withZeroBalance_ShouldReturnCorrectlyFormattedUserBalance() {
        Register register = new Register();
        register.setUserBalance(0);
        double expected = 0.00;
        double result = register.displayUserBalance();
        Assert.assertEquals(expected, result, 1);
    }

        @Test
        public void displayUserBalance_withNull_ShouldReturnNotNull() {
            Register register = new Register();
            register.setUserBalance(0);
            double result = register.displayUserBalance();
            Assert.assertNotNull(result);
        }

    @Test
    public void displayVendingMachineBalance_withValidData_ShouldReturnCorrectlyFormattedUserBalance(){
        Register register = new Register();
        register.setUserBalance(100);
        double expected = 1.00;
        double result = register.displayVendingMachineBalance();
        Assert.assertEquals(expected, result,1);
    }

    @Test
    public void displayVendingMachineBalance_withZeroBalance_ShouldReturnCorrectlyFormattedUserBalance() {
        Register register = new Register();
        register.setUserBalance(0);
        double expected = 0.00;
        double result = register.displayVendingMachineBalance();
        Assert.assertEquals(expected, result, 1);
    }

    @Test
    public void displayVendingMachineBalance_withNull_ShouldReturnNotNull() {
        Register register = new Register();
        register.setUserBalance(0);
        double expected = 0.00;
        double result = register.displayVendingMachineBalance();
        Assert.assertNotNull(result);
    }
    @Test
     public void makePrchaseMethod_withInvalidVAlueShouldReturnvalidOutput() {

        Register register = new Register();
        String expected = "";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream output = System.out;
        System.setOut(ps);
        register.makePurchase("G1");
        System.out.flush();
        System.setOut(output);
        Assert.assertEquals(expected, baos.toString());

    }


    @Test
    public void feedMoneyMethod_withValidData_ShouldReturnupdatedUserBalance(){
        Register register = new Register();
        int expected = 100;
        int Actual = (int)(register.moneyFeed("$1") );
        Assert.assertEquals(expected, Actual);
    }



}
