package Chapter3;

/**
 * @author Philelo Mphaga
 * Do While loop will executr atleast once
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        char option = 'a';

        do{
            System.out.println("option = " + option);
            option++;
        }while(option != 'g');
    }
}
