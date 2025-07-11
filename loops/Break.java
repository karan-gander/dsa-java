import java.util.*;

public  class Break{


    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Enter a number ");

            int n = sc.nextInt();

            if(n%10==0){
                break;
            }

            System.out.print(n);

        } while (true);
    }
}