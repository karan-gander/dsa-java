import java.util.*;
public class Practiceone{


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();


        // int avg = (a+b+c)/3;

        // int squre = a*a;

        float pen = sc.nextFloat();
        float pancil = sc.nextFloat();
        float earser = sc.nextFloat();


        float gst = (pen+pancil+earser) * 18/100;

        float totalCost = pen + pancil + earser + gst;




        System.out.print(totalCost);

    }

}