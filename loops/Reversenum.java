
import java.util.*;

public class Reversenum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number \n");
        int n = sc.nextInt();
        int reverse=0;
        while(n>0){

            int lastDigit = n%10;

            reverse = (reverse *10)+lastDigit;

            n =n/10;

        }
        System.out.print(reverse);
        

    }

}
