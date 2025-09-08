package Chapter1;

/**
 * Documentation comment
 * @author philelo Mphaga
 * this class shows using constant values:
 * should not change during program execution
 * methods from the string class
 *
 */

public class UsingConstant {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "ILAB";
        String welcomeMessage;

        welcomeMessage = "Welcome to " + COMPANY_NAME + "'s " + CURRENT_YEAR + " internship program";

        System.out.println(welcomeMessage);
    }
}
