/*8. Print the letters of the alphabet from A to Z and a to z using a loop.*/

public class Main {
    public static void main(String[] args) {
        // Print uppercase letters
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }

        System.out.println();

        // Print lowercase letters
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
    }
}
