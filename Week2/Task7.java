/* Task 1: Print Pattern Using Loop */

public class StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.print("***** *****");
    }
}
