package Chapter3;

/**
 * @author Philelo Mphaga
 * Break: will end or exit the loop
 * continue: will skip the current iteration and start the next iteration
 */
public class TerminationTechniques {
    public static void main(String[] args) {

        //break: exit / end the loop
        for(int i=0;i< 20;i++){
            if(i== 5) break;
            System.out.println("i =" + i + ", ");
        }

        //Continue : skip current iteration
        System.out.println("\n\n======continue====");
        for(int i=0;i< 20;i++){

            if(i % 3 == 0) continue;
            System.out.println("i =" + i);
        }

        for(int i=0;i< 15;i++){
            if(i== 5) break;
            if(i % 3 == 0) continue;
            System.out.println("i =" + i);
        }
    }
}
