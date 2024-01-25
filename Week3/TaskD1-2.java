/*1. Write a program that calculates the sum of terms 5 and 7 of the Fibonacci sequence. 
*/

public class FibonacciSum {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n5 = 0, n7 = 0;
        int count = 0;

        while (count < 7) {
            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
            count++;

            if (count == 4) { // 5th term (as count starts from 0)
                n5 = sumOfPrevTwo;
            }

            if (count == 6) { // 7th term
                n7 = sumOfPrevTwo;
            }
        }

        System.out.println("Sum of 5th and 7th terms in Fibonacci sequence: " + (n5 + n7));
    }
}


/*
The "golden angle," approximately 137.5 degrees, is related to the golden ratio, 
a number around 1.618. This ratio is significant in various natural and human-made structures. 
In plants, the golden angle is evident in the arrangement of leaves, petals, and seeds, ensuring 
efficient light exposure and space utilization. This arrangement often aligns with the Fibonacci sequence, 
where the number of spirals or patterns corresponds to Fibonacci numbers, like in sunflowers. 
The connection between the golden angle and Fibonacci numbers in plants is a natural optimization for 
growth and resource distribution.
*/







