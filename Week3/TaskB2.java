/*2. Write a program simulating the random appearance of an opponent in a fighting game: a dragon, a sorcerer, a gladiator. */

import java.util.Random;

public class OpponentSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] opponents = {"Dragon", "Sorcerer", "Gladiator"};

        int index = random.nextInt(opponents.length); // Random index 0, 1, or 2
        System.out.println("An opponent appears: " + opponents[index]);
    }
}
