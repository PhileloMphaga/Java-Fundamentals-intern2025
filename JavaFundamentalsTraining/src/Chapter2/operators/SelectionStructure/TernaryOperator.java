package Chapter2.operators.SelectionStructure;

/**
 * @author Philelo Mphaga
 */
public class TernaryOperator {
    public static void main(String[] args) {

        //...

        int number = 3;
        String results;

        results = number % 2 == 0 ? "Even"
                : number % 5 == 0 ? "Multiple of 5" : "Odd";

        System.out.println(results);
    }
}