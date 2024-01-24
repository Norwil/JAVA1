/*5. Write a program that calculates the area of ​​a triangle based on the base and height entered from the keyboard.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get base and height from user input
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
    }
}
