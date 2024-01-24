/*Develop a simplified ski jump assessment algorithm and write a program to evaluate a jump.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the distance and style points from user input
        System.out.print("Enter the distance of the jump (meters): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the style points (out of 20): ");
        double stylePoints = scanner.nextDouble();

        // Calculate the total score
        double score = distance * 2 + stylePoints;
        System.out.println("Total score for the jump: " + score);
    }
}
