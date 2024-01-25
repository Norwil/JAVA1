/*1. Write a program that calculates for 1000, 10,000, any number from the allowed range of random dice rolls, how often the number 3 was rolled. 
*/

import java.util.Random;
import java.util.Scanner;

public class DiceRollCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of dice rolls: ");
        int numberOfRolls = scanner.nextInt();
        int countOfThrees = 0;

        for (int i = 0; i < numberOfRolls; i++) {
            int roll = random.nextInt(6) + 1; // Random number between 1 and 6
            if (roll == 3) {
                countOfThrees++;
            }
        }

        System.out.println("Number of times 3 was rolled: " + countOfThrees);
        scanner.close();
    }
}
