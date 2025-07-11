public class Bintodec{


    public static int bintodec(int n){

        int pow=0;
        int dec=0;

        while(n>0){

            int lastDigit = n%10;
            dec = dec+((int) Math.pow(2,pow)*lastDigit);
            pow++;
            n/=10;
        }

        return dec;
    }


    public static void dectobin(int n){

        int pow=0;
        int dec=0;

        while(n>0){
            
            int rem =n%2;
            dec = dec + (rem * (int) Math.pow(10,pow));
            pow++;
            n=n/2;
        }

        System.out.print(dec);

    }
    public static void main(String[] args) {
        dectobin(5);
        // System.out.print(bintodec(101));
    }
}