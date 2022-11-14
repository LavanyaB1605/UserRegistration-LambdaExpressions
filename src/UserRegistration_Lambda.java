import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationInterface {
    boolean validate(String pattern, String details);
}

public class UserRegistration_Lambda {

    public static void main(String[] args) {
        UserRegistrationInterface firstName = (String pattern, String first_name) -> {
            if (Pattern.matches(pattern, first_name)) {
                System.out.println("Entered Name is Valid");
                return true;

            } else {
                System.out.println("Entered Name is Invalid");
                return false;
            }
        };
        UserRegistrationInterface lastName = (String pattern, String last_name) -> {
            if (Pattern.matches(pattern, last_name)) {
                System.out.println("Entered Name is Valid");
                return true;
            }else {
                System.out.println("Entered Name is Invalid");
                return false;
            }
        };

        firstName.validate("^[A-Z][a-z]{2,}$", "Lavanya");
        firstName.validate("^[A-Z][a-z]{2,}$", "lavan");

        lastName.validate("^[A-Z][a-z]{2,}$", "Bhaskaran");
        //System.out.println("Entered value is " + lastName.validate("^[A-Z][a-z]{2,}$", "Bhaskaran"));
        lastName.validate("^[A-Z][a-z]{2,}$", "bh");

    }
}
