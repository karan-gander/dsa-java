import java.util.*;
public class Prime{


    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");

        int n = sc.nextInt();
        boolean isPrime=true;

        if(n==2){
            System.out.print("Prime Number");
        }
        else{

            for(int i=2;i<=Math.sqrt(n);i++){

                if(n%i==0){
                    
                    isPrime=false;
                }
            }

            if(isPrime){
                System.out.print("Number is prime");
            }
            else{
                System.out.print("Number is non-prime");

            }

        }


    }
}