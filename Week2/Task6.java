/*Task 5: Conditional Text Printing */

import java.util.Scanner;

public class TextPrinterSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        while (true) {
            System.out.print("Print text? (1 for yes, 2 for no): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < number; i++) {
                        System.out.println(text);
                    }
                    return; // Exit the program

                case 2:
                    System.out.println("Text printing cancelled.");
                    return; // Exit the program

                default:
                    System.out.println("I didn't understand, please select the answer again.");
                    break; // Ask for input again
            }
        }
    }
}
