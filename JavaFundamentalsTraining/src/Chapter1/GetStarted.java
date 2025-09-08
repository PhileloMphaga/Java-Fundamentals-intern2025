package Chapter1;

/**
 * Documentation comment
 * @author philelo Mphaga
 * this class shows basic variable declaration
 * and assignment
 */
public class GetStarted {
    public static void main(String[]  args) {
        // Single line comment

        /*
         * multi-line
         * comment
         */

        // Declare
        int age = 21;
        short shortAge = 25;
        double height = 18.5;
        float salary = 16500.55f;
        boolean isValid = true;
        char letter = 'K';

        // Object type
        String firstName = "Philelo";

        // Use
        System.out.println("Name: " + firstName);
        System.out.println("Initials: " + letter);
        System.out.println("Height: " + height);
        System.out.println("Age: " + age);
        System.out.println("Short Age: " + shortAge);
        System.out.println("Salary: " + salary);

    }
}
