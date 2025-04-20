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
    public static void main(String[] args) {
        
        System.out.print(bintodec(101));
    }
}