package PasswordValidation;
import java.util.Scanner;

public class PasswordValidator {
    public static void main() {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("--- Secure Password Validator ---");
            System.out.print("Enter a password to test: ");
            String password = input.nextLine();

            boolean hasLength = password.length() >= 8;

            if (!hasLength) {
                System.out.println("The password you entered is weak !!!");
                System.out.println("Password must be at least 8 characters long");
                return;
            }

            boolean hasDigit = false;
            boolean hasSpecial = false;

            for (char letter : password.toCharArray()) {
                if (hasDigit && hasSpecial) {
                    break;
                }
                if (Character.isDigit(letter)) {
                    hasDigit = true;
                } else if ("@!#".indexOf(letter) != -1) {
                    hasSpecial = true;
                }
            }

            if (hasDigit && hasSpecial) {
                System.out.println("The password you entered is valid");
            } else {
                System.out.println("The password you entered is weak !!!");
                System.out.println();
                System.out.println("Reasons:");
                if (!hasDigit) {
                    System.out.println("Password should contain at least one digit");
                }
                if (!hasSpecial) {
                    System.out.println("Password should contain at least one special character");
                }
            }
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
