public class Pown {

    public static void main(String arg[]) {

        System.out.print(pow(2, 3));
    }

    public static int pow(int x, int n) {

        if (n == 0)
            return 1;

        return x * pow(x, n - 1);
    }

}
