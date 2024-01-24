/* Task 3: Types of Loops in Java and Re-solving Task 1 */

public class StarPatternWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.print(" ");
            i++;
        }
        System.out.print("***** *****");
    }
}
