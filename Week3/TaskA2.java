/* 2. Write a small program that takes two strings from the user and responds which string is lexicographically smaller (i.e., alphabetically precedes the second string). The program asks the user for further strings until it receives information about the end of the operation. Use the string type, the less than operator specified for that type, and the do - while statement. 
*/

import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;

        do {
            System.out.println("Enter the first string (or 'exit' to finish): ");
            str1 = scanner.nextLine();
            if (str1.equalsIgnoreCase("exit")) break;

            System.out.println("Enter the second string: ");
            str2 = scanner.nextLine();

            if (str1.compareTo(str2) < 0) {
                System.out.println("'" + str1 + "' is lexicographically smaller than '" + str2 + "'.");
            } else if (str1.compareTo(str2) > 0) {
                System.out.println("'" + str1 + "' is lexicographically greater than '" + str2 + "'.");
            } else {
                System.out.println("Both strings are lexicographically equal.");
            }
        } while (!str1.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
