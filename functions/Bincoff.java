
public class Bincoff {

    public static int fact(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;
        }
            return fact;

    }

    public static int binCoff(int n, int r) {

        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);

        int bin = fact_n / (fact_r * fact_nmr);
        return bin;
    }

    public static void main(String args[]) {

        System.out.print(binCoff(5, 4));

    }

}

