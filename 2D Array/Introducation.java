import java.util.*;

public class Introducation {

    // Creating 2D array

    public static Boolean findMinAndMax(int array[][]) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {

                if (array[i][j] < min) {
                    min = array[i][j];
                } if(array[i][j]>max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
        return false;
    }

    public static Boolean search(int array[][], int key) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {

                if (array[i][j] == key) {
                    System.out.println("Key is find at index (" + i + "," + j + ")");
                    return true;
                }

            }
        }
        System.out.println("Key is not find ");
        return false;

    }

    public static void main(String arg[]) {

        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                // matrix[i][j] = sc.nextInt();

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();

        }

        search(matrix, 8);
        findMinAndMax(matrix);

    }

}
