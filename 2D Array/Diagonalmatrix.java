public class Diagonalmatrix {

    public static void sumOfDiagonal(int array[][]){


        //brute force aprroach

        int sum=0;

        for(int i=0;i<array.length;i++){ //O(n^2)

            for(int j=0;j<array[0].length;j++){
                if(i==j){
                   sum+=array[i][j];
                }
                else if((i+j)==array.length-1){
                    sum+=array[i][j];
                }
            }
        }

        System.out.print(sum);
    }


    // optimie approach

    public static void optimizeDiagonal(int array[][]){

        int sum=0;

        for(int i=0;i<array.length;i++){

            sum+=array[i][i];
            if(i!=array.length-1-i){
                sum+=array[i][array.length-1-i];
            }
        }

         System.out.print(sum);
    }
    public static void main(String args[]) {

        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };


        // sumOfDiagonal(matrix);
        optimizeDiagonal(matrix);

    }
}