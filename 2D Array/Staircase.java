public class Staircase {
    
    public static void stairsearch(int array[][],int key){

        int row=0;
        int col= array.length-1;

        while(row<array.length&&col>=0){
            if(key==array[row][col]){
                System.out.print("Key found at "+"("+row+","+col+")");
                break;
            }

            else if(key<array[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
    }

    public static void main(String args[]){


        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50},
        };


        // stairsearch(matrix, 50);

        anotherpointstairsearch(matrix, 29);

    }

    public static void anotherpointstairsearch(int array[][], int key){

        int row=array.length-1;
        int col = 0;

        while (row>=0&&col<array.length) {
            
            if(key==array[row][col]){
                 System.out.print("Key found at "+"("+row+","+col+")");
                 break;

            }
            else if(key<array[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
    }
}
