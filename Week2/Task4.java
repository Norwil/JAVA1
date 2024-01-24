/* Task 3: Calculate and Print Points */

import java.util.Scanner;

public class BusinessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your telephone number: ");
        int telephone = scanner.nextInt();

        System.out.println("\n----- BUSINESS CARD -----");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Telephone: " + telephone);
        System.out.println("-------------------------");
    }
}
