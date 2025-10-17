public class Sumofnnatural {

    public static void main(String args[]) {

        System.out.print(sumOfNaturalnum(5));
    }

    public static int sumOfNaturalnum(int n) {

        if (n == 1) return 1;
        return sumOfNaturalnum(n - 1) + n;
        
    }
}
