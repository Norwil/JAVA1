/*1. Write a program simulating the result of a single throw of a dice.  */

import java.util.Random;

public class DiceSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1; // Random number between 1 and 6
        System.out.println("Dice roll result: " + diceRoll);
    }
}
