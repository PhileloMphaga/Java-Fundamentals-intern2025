package Chapter4;

/**
 * @author Philelo Mphaga
 */

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum : "+calcSum(15F,32.6F));
    }

    public static int calcSum(int x, int y){
        return x+y;
    }

    public static double calcSum(double x, double y){
        return x+y;
    }

    public static float calcSum(float x, float y){
        return x+y;
    }
}

