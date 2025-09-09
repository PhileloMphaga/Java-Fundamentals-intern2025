package Chapter2.operators;

/**
 * @author Philelo Mphaga
 * This class demonstrate the use of pre increament /decrement
 * and post increament / decrement
 */
public class IncreamentDecrement {
    public static void main(String[] args) {

        int number = 25;

        System.out.print("===========POST===========\n");
        // post increment / decrement
        System.out.println("Original value of number: " + number); // 25
        System.out.println("Increment the value of number by 1, but only updates after being used: " + number++); // 25
        System.out.println("New value of number is: " + number); // 26
        System.out.println("Decrement the value of number by 1, but only updates after being used: " + number--); // 26
        System.out.println("New value of number is: " + number); // 25

        number = 25;
        System.out.print("===========PRE===========\n");
        // pre increment / decrement
        System.out.println("Original value of number: " + number); // 25
        System.out.println("Increment the value of number by 1 and update the value before being accessed: " + ++number); // 26
        System.out.println("New value of number is: " + number); // 26
        System.out.println("Decrement the value of number by 1, and update the value before being accessed: " + --number); // 25
        System.out.println("New value of number is: " + number); // 25
    }
}
