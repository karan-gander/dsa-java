public class Introduction {

    public static void main(String args[]) {
        // PrintNtoTen(10);
        printIncreaseN(10);
    }

    public static int PrintNtoTen(int n) {

        if (n == 1) {
            System.out.print(n);
            return 0;
        } else {
            System.out.print(n);
            return PrintNtoTen(--n);

        }
    }

    public static void printIncreaseN(int n) {

        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreaseN(n - 1);
        System.out.print(n + " ");

    }

}
