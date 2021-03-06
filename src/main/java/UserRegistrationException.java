import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationException {

    public boolean validfirstName(String firstname) {

        boolean result = Pattern.matches("^[A-Z]{1}+[a-z]{3,}", firstname);
        try {
            if (result) {
                System.out.println("First Name is Valid");
                return true;
            } else {
                throw new CustomException("First Name is Invalid: Please Enter Valid First Name: ");
            }
        } catch (CustomException e) {
            System.out.printf(e.getMessage());
        }
        return false;
    }
    public boolean validLastName(String lname) {

        boolean result = Pattern.matches("^([A-Z]{1})([a-z A-Z]{2,})$", lname);
        try {
            if (result) {
                System.out.println("Last Name is Valid: ");
                return true;
            } else {
                throw new CustomException("Last Name is Invalid\n. Please Enter Last Valid Name: ");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean validEmail(String email){

        boolean result = Pattern.matches("^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$",email);
        try {
            if (result) {
                System.out.println("Email is Valid: ");
            }
            else {
                throw new CustomException("Email is Invalid. Please Enter Valid Email");
            }
            return true;
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean validMobileNumber(String num) {

        boolean result = Pattern.matches("^([0-9]{2}) ([1-9]{1}[0-9]{9,})$",num);
        try {
            if (result) {
                System.out.println("Mobile Number is Valid");
            } else {
                throw new CustomException("Mobile Number is Invalid: Please Enter Valid Password");
            }
            return true;
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean validPassword(String password) {

        boolean result = Pattern.matches("^[a-zA-Z0-9-@#$]{8,}$", password);
        try {
            if (result) {
                System.out.println("Password is Valid: ");
            } else {
                throw new CustomException("Password is Invalid. Please Enter Valid Password: ");
            }
            return true;
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean validPasswordAtLeastOneUpperCase(String password) {

        boolean result = Pattern.matches("^[A-Z]{1}+[A-Za-z0-9]{7,}$", password);
        try {
            if (result) {
                System.out.println("Password is Valid: ");
            } else {
                throw new CustomException("Password is Invalid. Please Enter Valid Password: ");
            }
            return true;
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean validPasswordAtLeastOneNumericValue(String password) {

        boolean result = Pattern.matches("^([A-Z]{1})+([0-9]{1,})+([A-Za-z0-9]{6,})$", password);
        try {
            if (result) {
                System.out.println("Password is Valid: ");
            } else {
                throw new CustomException("Password is Invalid. Please Enter Valid Password: ");
            }
            return true;
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean validPasswordAtLeastOneSpecialChar(String password) {

        boolean result = Pattern.matches("^(.*[A-Z]{1,}.*[0-9]{1,}.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$", password);
        try {
            if (result) {
                System.out.println("Password is Valid: ");
            } else {
                throw new CustomException("Password is Invalid. Please Enter Valid Password: ");
            }
            return true;
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
