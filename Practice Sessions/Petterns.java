
public class Petterns {

    public static void main(String arg[]) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                if (i == 1 && (j == 1 || j == 2)) {
                    System.out.print("  ");
                } else {

                    System.out.print("* ");
                }

            }
            System.out.println();

        }

        System.out.println();
        System.out.println();
        int n = 4;
        int m = 4;
        // teacher logic ans great
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= m; j++) {

                if (i == 0 || i == n || j == 0 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println();
        System.out.println();

        for (int i = 0; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        

    }

}
