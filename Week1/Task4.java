/*4. Create a double variable with the value 11.9876543210 
  and increment it 10 times. What is the value of the variable now? Why is this happening? Repeat the task for 10 decrements.*/

public class Main {
    public static void main(String[] args) {
        double number = 11.9876543210;

        // Increment the variable 10 times
        for (int i = 0; i < 10; i++) {
            number++;
        }
        System.out.println("Value after incrementing 10 times: " + number);

        // Decrement the variable 10 times
        for (int i = 0; i < 10; i++) {
            number--;
        }
        System.out.println("Value after decrementing 10 times: " + number);
    }
}
