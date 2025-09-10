package Chapter5.Homework;

/**
 * @author Philelo Mphaga
 * Homework 5.1
 */
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];  // store up to 10 numbers
        int count = 0;               // how many numbers entered
        int sum = 0;

        System.out.println("Enter up to 10 integers (0 to quit):");

        // Input loop
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = sc.nextInt();

            if (num == 0) break; // quit if user enters 0

            numbers[count] = num;
            sum += num;
            count++;
        }

        // If no numbers entered
        if (count == 0) {
            System.out.println("Error: You must enter at least one number!");
        } else {
            // Calculate average
            double average = (double) sum / count;
            System.out.println("\nAverage = " + average);

            // Display each number and its distance from average
            System.out.println("\nNumber\tDistance from Average");
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(numbers[i] - average);
                System.out.println(numbers[i] + "\t" + distance);
            }
        }

        sc.close();

    }
}
