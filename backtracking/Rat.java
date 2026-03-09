public class Rat {

    public static void helperRat(int mat[][], int row, int col, String path, String ans) {

        int n = mat.length;

        if (row < 0 || col < 0 || row >= n || col >= n || mat[row][col] == 0 || mat[row][col] == -1) {

            return;

        }

        if (row == n - 1 && col == n - 1) {
            ans += path;
        }

        mat[row][col] = -1;

        helperRat(mat, row + 1, col, path, ans); // Down
        helperRat(mat, row - 1, col, path, ans); // Up
        helperRat(mat, row, col - 1, path, ans); // Left
        helperRat(mat, row, col + 1, path, ans); // Right

        mat[row][col] = 1;

    }

    public static void main(String args[]) {


        int mat[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1},
        };

    }

}
