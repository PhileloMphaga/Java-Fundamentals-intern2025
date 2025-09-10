package Chapter4;

/**
 * @author Philelo Mphaga
 */

public class VoidMethods {
    public static void main(String[] args) {
        displayMessage();
        System.out.println("---------------------------");
        displayAddresss();
    }

    public static void displayMessage(){
        System.out.println("Hi, Welcome to Java Training");
    }

    private static void displayAddresss(){
        System.out.println("""
                234 Rivonia Street.
                Sandton
                1234""");

    }
}
