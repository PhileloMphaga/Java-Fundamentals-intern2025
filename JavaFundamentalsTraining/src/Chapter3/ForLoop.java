package Chapter3;

/**
 * @author Philelo Mphaga
 * use the for loop when you know
 * the number of time the loop will execute
 */
public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            //Display Java 5 times
            System.out.println(i + " -java");

            //multiple conditions
            for (int j = 1, y= 5; j <10; j++, y--) {
                System.out.println(i + " <------> " + y);

            }
        }

    }
}
