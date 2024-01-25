import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    private static HashMap<String, Integer> accountBalances = new HashMap<>();

    public static void main(String[] args) {
        // Predefined accounts
        accountBalances.put("ABC", 1000); // Sample account with balance
        accountBalances.put("XYZ", 500);  // Another sample account

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insert card (Enter a 3-letter code):");
            String cardCode = scanner.nextLine();

            if (accountBalances.containsKey(cardCode)) {
                while (true) {
                    System.out.println("\n1. Check Balance\n2. Withdraw Money\n3. Exit");
                    System.out.print("Choose an option: ");
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        // Check Balance
                        System.out.println("Your balance is: " + accountBalances.get(cardCode) + " zlotys");
                    } else if (choice == 2) {
                        // Withdraw Money
                        System.out.print("Enter amount to withdraw: ");
                        int amount = scanner.nextInt();

                        if (amount <= accountBalances.get(cardCode)) {
                            accountBalances.put(cardCode, accountBalances.get(cardCode) - amount);
                            System.out.println("Withdrawn: " + amount + " zlotys. New balance: " + accountBalances.get(cardCode) + " zlotys.");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else if (choice == 3) {
                        // Exit
                        break;
                    } else {
                        System.out.println("Invalid option! Please try again.");
                    }
                }
            } else {
                System.out.println("Invalid card code.");
            }

            System.out.print("Do you want to insert another card? (yes/no): ");
            String continueTransaction = scanner.next();
            scanner.nextLine(); // Consume newline left-over

            if (!continueTransaction.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Thank you for using our ATM!");
    }
}
