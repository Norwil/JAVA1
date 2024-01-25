/* 1. Write a program that calculates, for 1000, 10,000, or any number of random dice rolls, how often each number was rolled. 
*/

import java.util.Random;
import java.util.Scanner;

public class DiceRollFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] frequencies = new int[6]; // Array to store frequencies for numbers 1-6

        System.out.println("Enter the number of dice rolls: ");
        int numberOfRolls = scanner.nextInt();

        for (int i = 0; i < numberOfRolls; i++) {
            int roll = random.nextInt(6) + 1;
            switch (roll) {
                case 1: frequencies[0]++; break;
                case 2: frequencies[1]++; break;
                case 3: frequencies[2]++; break;
                case 4: frequencies[3]++; break;
                case 5: frequencies[4]++; break;
                case 6: frequencies[5]++; break;
            }
        }

        // Display results
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Number " + (i + 1) + " was rolled " + frequencies[i] + " times.");
        }

        scanner.close();
    }
}
