public class Tilingprob {

    public static int tiling(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        // horizontal
        int horizontal = tiling(n - 1);

        // vertical

        int vertical = tiling(n - 2);

        return horizontal + vertical;

    }

    public static void main(String args[]) {

        System.out.print(tiling(4));

    }
}