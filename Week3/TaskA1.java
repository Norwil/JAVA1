/* 1. Write a short program for a function that is to download a string of strings from the standard input until either the same word appears next or all strings are downloaded. Use a while loop to retrieve one word at a time from a given text. To end the loop when the same word is retrieved again, use the break statement. As a result, the program should print either the word that was retrieved twice or a message stating that no word was retrieved twice. 
*/

import java.util.Scanner;

public class RepeatedWordDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String previousWord = "";
        String currentWord;

        System.out.println("Enter words (type 'exit' to finish): ");
        while (true) {
            currentWord = scanner.next();

            if (currentWord.equals(previousWord)) {
                System.out.println("Repeated word: " + currentWord);
                break;
            } else if (currentWord.equalsIgnoreCase("exit")) {
                System.out.println("No word was retrieved twice.");
                break;
            }

            previousWord = currentWord;
        }

        scanner.close();
    }
}
