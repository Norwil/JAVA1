/* Task 5: Array Initialization and Printing */

public class ArrayInitialization {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 111 * (i + 1);
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }
}
