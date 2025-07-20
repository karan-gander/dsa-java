public class Assignment {

    public static void countNumOfKey(int array[][], int key) {

        // linear search for the array
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {

                if (key == array[i][j]) {
                    count++;
                }
            }
        }

        System.out.print(count);

    }

    public static void printRowSum(int array[][], int row) {

        int sum = 0;

        for (int j = 0; j < array[row].length; j++) {

            sum += array[row][j];

        }
        System.out.print("The sum of " + row + " is " + sum);
    }

    public static void transposeMatrix() {
        int array[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int row = 4;
        int col = 3;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (i == j) {

                    System.out.print(array[i][j] + " ");
                }

                else {

                   transpose[j][i]=array[i][j];
                    
                }
            }
        }
        
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            // System.out.println();
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        // countNumOfKey(matrix, 7);

        // printRowSum(matrix, 1);/

        transposeMatrix();

    }

}
