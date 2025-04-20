
import java.util.*;

public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a set of intiger");

        int n = sc.nextInt();
        int sumOfEven=0;
        int sumOfOdd=0;
        while(n>0){

            int lastDigit = n%10;
            
            if(lastDigit%2==0){

                sumOfEven+=lastDigit;
            }
            else{
                sumOfOdd+=lastDigit;
            }


            n=n/10;

        }

        System.out.println(sumOfEven);
        System.out.print(sumOfOdd);

    }
}
