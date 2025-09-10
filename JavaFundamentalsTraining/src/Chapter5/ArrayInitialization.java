package Chapter5;

import java.util.Arrays;

/**
 * @author Philelo Mphaga
 */

public class ArrayInitialization {
    public static void main(String[] args) {
        int[] arNumbers = new int[]{52,41,32,74,85};
        String[] arNames = new String[]{"Kate","John","Carol","David","Mike"};
        double[] arPrices = new double[]{23.55, 15.5, 52.99,99.99,75.69};
        double[] arSales = {5000.00, 20000.00, 5000.00, 5500.00, 6750.00};

        //arPrices = new double[]{500, 600};
        arSales = new double[]{5000, 6000};

        System.out.println("------Numbers------");
        for(int i =0; i<=arNumbers.length-1; i++){
            System.out.println(arNumbers[i]);
        }

        int count = 0;
        System.out.println("-------Names-------");
        while(count < arNames.length){
            System.out.println(arNames[count]);
            count++;
        }

        System.out.println("-------Prices-------");
        for(double price : arPrices){
            System.out.println(price + "  ");
        }

        System.out.println("old price\tNew price");
        for (double price : arPrices){
            price = price + (price * 0.1);//change each price
            System.out.println(price);
        }
    }
}
