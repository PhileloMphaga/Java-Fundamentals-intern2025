package Chapter5.Homework;

import java.util.Scanner;

/**
 * @author Philelo Mphaga
 * Homework 5.2
 */

public class ArrayMethodDemo {
    public static void main(String[] args) {

        // The array with eight integers
        int[] data = {12, 7, 25, 4, 18, 31, 9, 14};

        // 1) display all
        displayAll(data);

        // 2) display in reverse order
        displayReverse(data);

        // 3) display sum
        displaySum(data);

        // 4) display values less than a limiting argument
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limiting value: ");
        int limit = sc.nextInt();
        displayLessThan(data, limit);

        // 5) display values higher than the calculated average
        displayHigherThanAverage(data);

        sc.close();
    }

    // (1) Display all integers
    static void displayAll(int[] arr) {
        System.out.print("All values: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }

    // (2) Display all integers in reverse order
    static void displayReverse(int[] arr) {
        System.out.print("Reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // (3) Display the sum of the integers
    static void displaySum(int[] arr) {
        int sum = 0;
        for (int v : arr) sum += v;
        System.out.println("Sum: " + sum);
    }

    // (4) Display all values less than a limiting argument
    static void displayLessThan(int[] arr, int limit) {
        System.out.print("Values < " + limit + ": ");
        boolean any = false;
        for (int v : arr) {
            if (v < limit) {
                System.out.print(v + " ");
                any = true;
            }
        }
        if (!any) System.out.print("(none)");
        System.out.println();
    }

    // (5) Display all values higher than the calculated average value
    static void displayHigherThanAverage(int[] arr) {
        double avg = average(arr);
        System.out.println("Average: " + avg);

        System.out.print("Values > average: ");
        boolean any = false;
        for (int v : arr) {
            if (v > avg) {
                System.out.print(v + " ");
                any = true;
            }
        }
        if (!any) System.out.print("(none)");
        System.out.println();
    }

    // Helper: average
    static double average(int[] arr) {
        int sum = 0;
        for (int v : arr) sum += v;
        return (double) sum / arr.length;

    }
}
