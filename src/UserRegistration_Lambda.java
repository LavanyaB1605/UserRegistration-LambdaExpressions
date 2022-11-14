import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationInterface {
    boolean validate(String pattern, String details);
}
public class UserRegistration_Lambda {
    public static void main(String[] args) {
        UserRegistrationInterface firstName = (String pattern, String first_name) -> {
            if (Pattern.matches(pattern, first_name)) {
                System.out.println("Entered First Name is Valid");
                return true;

            } else {
                System.out.println("Entered First Name is Invalid");
                return false;
            }
        };

        UserRegistrationInterface lastName = (String pattern, String last_name) -> {
            if (Pattern.matches(pattern, last_name)) {
                System.out.println("Entered Last Name is Valid");
                return true;
            }else {
                System.out.println("Entered Last Name is Invalid");
                return false;
            }
        };

        UserRegistrationInterface emailID = (String pattern, String email) -> {
            if (Pattern.matches(pattern, email)) {
                System.out.println("Entered ID is Valid");
                return true;
            }else {
                System.out.println("Entered ID is Invalid");
                return false;
            }
        };

        UserRegistrationInterface mobileNumber = (String pattern, String mobile_number) -> {
            if (Pattern.matches(pattern, mobile_number)) {
                System.out.println("Entered Number is Valid");
                return true;
            }else {
                System.out.println("Entered Number is Invalid");
                return false;
            }
        };

        UserRegistrationInterface password = (String pattern, String pwd) -> {
            if (Pattern.matches(pattern, pwd)) {
                return true;
            }else {
                return false;
            }
        };

        firstName.validate("^[A-Z][a-z]{2,}$", "Lavanya");
        firstName.validate("^[A-Z][a-z]{2,}$", "lavan");

        lastName.validate("^[A-Z][a-z]{2,}$", "Bhaskaran");
        //System.out.println("Entered value is " + lastName.validate("^[A-Z][a-z]{2,}$", "Bhaskaran"));
        lastName.validate("^[A-Z][a-z]{2,}$", "bh");

        emailID.validate("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$","lavanb23@gmail.com");
        emailID.validate("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$","abc.com");

        mobileNumber.validate("[91]{2} [6-9]{1}[0-9]{9}", "91 9087654321");
        mobileNumber.validate("[91]{2} [6-9]{1}[0-9]{9}", "91 546790");

        System.out.println("Entered value is " + password.validate("[A-Z][a-z0-9]{7,}[$&+,:;=?@#|'<>.-^*()%!]","Lavanya07#"));
        System.out.println("Entered value is " + password.validate("[A-Z][a-z0-9]{7,}[$&+,:;=?@#|'<>.-^*()%!]","lava16"));

        /*password.validate("[A-Z][a-z0-9]{7,}[$&+,:;=?@#|'<>.-^*()%!]","Lavanya07#");
        password.validate("[A-Z][a-z0-9]{7,}[$&+,:;=?@#|'<>.-^*()%!]","lava16");*/

    }
}
