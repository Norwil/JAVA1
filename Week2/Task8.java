/* Task 2: ATM PIN Code Verification with Loop Modification */

import java.util.Scanner;

public class ATMPin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int correctPin = 1234;
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Please enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Access Granted.");
                return;
            } else {
                System.out.println("Incorrect PIN.");
                attempts++;
            }
        }

        System.out.println("You don't know your PIN. The bank intercepts your card. Apply for a new bank card.");
    }
}
