/*Task 3: Calculate and Print Points*/


import java.util.Scanner;

public class PointsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter points for style: ");
        double stylePoints = scanner.nextDouble() * 0.2;

        System.out.print("Enter points for effects: ");
        double effectsPoints = scanner.nextDouble() * 0.3;

        System.out.print("Enter points for result: ");
        double resultPoints = scanner.nextDouble() * 0.5;

        double totalPoints = stylePoints + effectsPoints + resultPoints;
        System.out.println("Total points: " + totalPoints);
    }
}
