
public class Pairarr {

    public static void main(String[] args) {

        int num[] = {10, 20, 30, 40, 50, 22, 12, 11, 1};

        for (int i = 0; i <= num.length - 1; i++) {

            for (int j = i + 1; j <= num.length - 1; j++) {
                System.out.print(num[i] + "" + num[j] + " ");
            }

            System.out.println();

        }
    }
}
