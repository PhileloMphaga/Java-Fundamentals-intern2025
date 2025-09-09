package Chapter2.operators;

/**
 * @author Philelo Mphaga
 * this class shows differnent assignment operators
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        // Assign
        int age = 25;
        /* Add, multiply, subtract, divide and assign */
        int a = 5, b = 3, c = 4, d = 12, e = 15;

        a += 3;
        b *= 3;
        c -= 3;
        d /= 3;
        e %= 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);//
    }
}
