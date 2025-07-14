public class Assignment {

    // bubble sort

    public static int[] bubble(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }

            }
            if (flag == 0) {
                break;

            }

        }

        return array;
    }

    // Selcetion Sort

    public static int[] selection(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {

            int min = i;

            for (int j = 1; j < array.length; j++) {

                if (array[j] < array[min]) {
                    min = j;
                }

            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }

        return array;
    }


    //insertaion sort 

    public static int[] insertaion(int array[]){

        for(int i=0;i<array.length;i++){

            int temp = array[i];
            int prev = i-1;

            while (prev>=0&&array[prev]>temp) {

                array[prev+1] =  array[prev];
                prev--;
                
            }

            array[prev+1] =temp;

        }

        return array;
    }



    //count Sort 

    public static int[] count(int array[]){

        int largest = Integer.MIN_VALUE;
        int count[] = new int[array.length];
        int b[]= new int[array.length];
        for(int i=0;i<array.length;i++){
            
            if(largest<array[i]){
                largest=array[i];
            }
        }
        
        // System.out.print(largest);

        for(int i=0;i<array.length;i++){

            ++count[array[i]];

            
        }
        
        
        
        for(int i=0;i<count.length;i++){
            // System.out.print(i);
            System.out.print(count[i]+" ");
        }

        System.out.println();
        
        for(int i=1;i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }

        for(int i=count.length-1;i>=0;i--){

            b[--count[array[i]]]=array[i];
        }
        
        for(int i=0;i<count.length;i++){
            // System.out.print(i);
            System.out.print(b[i]+" ");
        }





        return array;

    }

    public static void main(String[] args) {

        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        int bubbleSort[] = bubble(array);
        int selectionSort[] = selection(array);
        int insertaionsort[] = insertaion(array);
        int countSort[] = count(array);
        for (int i = 0; i < insertaionsort.length; i++) {

            // System.out.print(insertaionsort[i]);
        }

    }

}
