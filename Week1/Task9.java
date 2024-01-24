/*9. Create a 10-element array and assign its cells the values 11, 22, etc., up to 110, then print.*/

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Assign values to the array and print them
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 11;
            System.out.println("Array element " + i + ": " + array[i]);
        }
    }
}
