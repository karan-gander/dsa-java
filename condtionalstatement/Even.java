import java.util.*;

public class Even{


    public static void main(String args[]){


        System.out.print("Enter a number \n");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0){
            System.out.print("Even");
        }
        else{

            System.out.print("Odd");
        }



    }
}