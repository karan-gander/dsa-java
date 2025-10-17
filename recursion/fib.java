public class fib {




    public static void main(String args[]){

        System.out.print(fibo(12));
    }


    public static int fibo(int n){

        if(n==1||n==0) return n;

        int f1 = fibo(n-1);
        int f2 = fibo(n-2);

        return f1+f2;
    }
    
}
