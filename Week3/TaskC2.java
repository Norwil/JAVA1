/*2. Declare 2 5 x 5 arrays storing integers. Write a program that calculates and stores the result of adding, subtracting and multiplying these arrays in the third working table. 
*/

import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        int[][] sum = new int[5][5];
        int[][] difference = new int[5][5];
        int[][] product = new int[5][5];

        Random random = new Random();

        // Populating arrays with random numbers and calculating operations
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array1[i][j] = random.nextInt(10); // Random numbers between 0 and 9
                array2[i][j] = random.nextInt(10);

                sum[i][j] = array1[i][j] + array2[i][j];
                difference[i][j] = array1[i][j] - array2[i][j];
                product[i][j] = array1[i][j] * array2[i][j];
            }
        }

        // Display results
        System.out.println("Sum of Arrays:");
        displayArray(sum);
        System.out.println("\nDifference of Arrays:");
        displayArray(difference);
        System.out.println("\nProduct of Arrays:");
        displayArray(product);
    }

    private static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
