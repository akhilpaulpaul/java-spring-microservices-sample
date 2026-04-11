package MultiCurrencyAtm;

import java.util.Scanner;

public class MultiCurrencyAtm {
    double balance = 100.00;
    void main () {
        System.out.println("--- Welcome to ATM Services ---\n");
        System.out.println("1. INR\n2. GBP\n3. USD");
        System.out.print("Select currency: ");
        try (Scanner input = new Scanner(System.in)) {
            int currencySelection = input.nextInt();
            String currencyLabel;

            switch (currencySelection) {
                case 1 -> currencyLabel = "INR";
                case 2 -> currencyLabel = "GBP";
                case 3 -> currencyLabel = "USD";
                default -> {
                    System.out.println("Invalid selection. Exiting.");
                    return;
                }
            }

            System.out.println("\nSelected: " + currencyLabel);
            System.out.println("1. Deposit\n2. Withdraw");
            int service = input.nextInt();

            if (service == 1) {
                System.out.print("Please enter the amount to be deposited: ");
                double depositAmount = input.nextDouble();
                balance = balance + depositAmount;
            }
            else if (service == 2) {
                System.out.print("Please enter the amount to be withdrawn: ");
                double withdrawAmount = input.nextDouble();

                if (withdrawAmount > balance) {
                    System.out.println("Error: Insufficient funds. Your balance is only " + balance);
                    return;
                }
                balance = balance - withdrawAmount;
            }
            else {
                System.out.println("Invalid service selection.");
                return;
            }
            System.out.println("\nTransaction Successful!");
            System.out.printf("The final balance is: %.2f %s%n", balance, currencyLabel);
        }
    }
}
