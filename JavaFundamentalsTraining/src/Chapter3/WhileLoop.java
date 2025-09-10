package Chapter3;

/**
 * @author Philelo Mphaga
 * use while loop when you do not know the number of iterations
 * while loop will continue to run until the condition is false
 */

public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 5) {
            System.out.println("count = " + count);
            count+=2;
        }
    }
}
