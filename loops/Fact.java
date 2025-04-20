
import java.util.*;

public class Fact {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter a number");

        int num = sc.nextInt();

        for (int i = 1; i <=num; i++) {

        // System.out.print(i);
            fact*=i;
        }

        System.out.print(fact);

    }

}
