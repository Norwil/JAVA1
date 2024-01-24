/* Task 2: Sort and Print Three Numbers in Ascending Order */

import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter 3 numbers (from 1 to 100):");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));
    }
}
