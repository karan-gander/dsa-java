
public class Petterns {

    public static void hellowRectangle(int row, int col) {

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= col; j++) {

                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedPyamid(int row) {

        for (int i = 1; i <= row; i++) {

            for (int j = 0; j <= row - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void resverPyryamid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);

            }
            // for(int j=)
            System.out.println();
        }
    }

    public static void floydTriangle(int n) {

        int counter = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                // System.out.print("*");
                System.out.print(counter + " ");
                counter++;
            }

            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n) {

        boolean one = true;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //  secound half
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    public static void hellowRhombus(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }

    public static void dimond(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= (2*i)-1; k ++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= (n - i); j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // hellowRectangle(8, 15);
        // invertedPyamid(10);
        // resverPyryamid(5);
        // floydTriangle(5);
        // zeroOneTriangle(5);
        // butterfly(8);
        // solidRhombus(10);
        // hellowRhombus(10);
        dimond(5);
    }

}
