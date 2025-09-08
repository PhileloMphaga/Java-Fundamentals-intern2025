package Chapter1;
/**
 * Documentation comment
 * @author philelo Mphaga
 * this class shows the use of different
 * methods from the string class
 *
 */

public class ExploreStrings {
    public static void main(String[] args) {

        String firstname = "Johnathan";
        String lastname = "Smith";
        String sentence = "Video provides a powerful way to help you prove your point.";

        System.out.println(firstname + " has " + firstname.length() + " letters");

        System.out.println("'m' is found at position (index): "
                + lastname.indexOf("m") + " from " + lastname);

        System.out.println("Is smith = " + lastname + " ? "
                + lastname.equals("smith"));

        System.out.println("The third letter from " + firstname + " is: "
                + firstname.charAt(2));

        System.out.println("The last position of 'h' from " + firstname + " is: "
                + firstname.lastIndexOf("h"));

        System.out.println("With space: " + sentence.length());
        sentence = sentence.replace(" ", "");
        System.out.println("Without space: " + sentence.length());
    }
}
