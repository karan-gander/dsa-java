
import java.util.*;

public class Counter {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        System.out.println("Enter the value of n \n");
        int n = sc.nextInt();

        while (counter <= n) {

            System.out.println(counter);
            sum+=counter;
            counter++;
        }

        System.out.println("some of all number ");
        System.out.println(sum);

    }
}
