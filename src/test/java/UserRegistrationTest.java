import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationException name = new UserRegistrationException();

    @Test
    public void validfirstName() {
        String firstName = "Ajay";
        boolean result = name.validfirstName(firstName);
        Assert.assertTrue(result);
    }
    @Test
    public void validLastName(){
        String lastName = "Gosavi";
        boolean result = name.validLastName(lastName);
        Assert.assertTrue(result);
    }
    @Test
    public void validEmail(){
        String email = "abc.xyz@bl.co.in";
        boolean result = name.validEmail(email);
        Assert.assertTrue(result);
    }
    @Test
    public void validMobileNumber(){
        String num = "91 1234567890";
        boolean result = name.validMobileNumber(num);
        Assert.assertTrue(result);
    }
    @Test
    public void validPassword(){
        String password = "somnath1";
        boolean result = name.validPassword(password);
        Assert.assertTrue(result);
    }
    @Test
    public void validPasswordAtLeastOneUpperCase(){
        String password = "Somnath1";
        boolean result = name.validPasswordAtLeastOneUpperCase(password);
        Assert.assertTrue(result);
    }
    @Test
    public void validPasswordAtLeastOneNumericValue(){
        String password = "S12sdkf4";
        boolean result = name.validPasswordAtLeastOneNumericValue(password);
        Assert.assertTrue(result);
    }
    @Test
    public void validPasswordAtLeastOneSpecialChar(){
        String password = "K1@nhanj";
        boolean result = name.validPasswordAtLeastOneSpecialChar(password);
        Assert.assertTrue(result);
    }
}

