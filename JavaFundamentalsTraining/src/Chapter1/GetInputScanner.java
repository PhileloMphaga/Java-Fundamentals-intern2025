package Chapter1;

import java.util.Scanner;

/**
 * Documentation comment
 * @author philelo Mphaga
 * This class demonstrate how to get input from the user
 * using a scanner object
 *
 */
public class GetInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        double height;
        float salary;
        boolean isMarried = true;
        char initial ='P';
        String firstname = "s";

        System.out.println("Please enter your initial");
        initial = sc.next().charAt(0);

        System.out.println("Please enter your name");
        firstname = sc.next();

        System.out.println("Please enter age");
        age = sc.nextInt();

        System.out.println("Please enter height");
        height = sc.nextDouble();

        System.out.println("Please enter salary");
        salary = sc.nextFloat();

        System.out.println("\n========= Details =========");
        System.out.println("Name: " + firstname + " (" + initial );
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
        System.out.println("Married: " + isMarried);
    }
}
