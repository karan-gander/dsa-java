
public class Prime {

    

    public static boolean isPrime(int n) {

        // Croner case ( Specia conditions)
        if(n==2){
            return true;
        }
        boolean isPrime= true;

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }

        return isPrime;
    }
    

    public static boolean isPrimeOpt(int n){

        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
            }

        }
        return  isPrime;
    }

    public static void isPrimeRange(int n){

        for(int i=2;i<=n;i++){
            
            if(isPrimeOpt(i)){
                System.out.print(i);
                System.out.println();
                // continue;
            }
        }
    }
    public static void main(String args[]){

        // System.out.print(isPrime(84));
        // System.out.print(isPrimeOpt(45));
        isPrimeRange(10);

    }
}
