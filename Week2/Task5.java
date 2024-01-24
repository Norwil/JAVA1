/*Task 5: Conditional Text Printing*/

import java.util.Scanner;

public class TextPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();  // Clear the buffer

        int choice;
        do {
            System.out.print("Print text? (1 for yes, 2 for no): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                for (int i = 0; i < number; i++) {
                    System.out.println(text);
                }
                break;
            } else if (choice == 2) {
                System.out.println("Text printing cancelled.");
                break;
            } else {
                System.out.println("I didn't understand, please select the answer again.");
            }
        } while (true);
    }
}
