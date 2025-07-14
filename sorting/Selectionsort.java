public class Selectionsort{

    public static int[] selection(int array[]){


        for(int i=0;i<array.length-1;i++){
            // asume the curunt val is min;
            int min=i;


            for(int j=i+1;j<array.length;j++){

                // if there min val is greater then another any value in aaray 
                // replace that with min
                if(array[min]>array[j]){
                    min = j;
                }
            }

            // swap min vlaue the currunt
            int temp=array[min];
            array[min]= array[i];
            array[i]=temp;


        }
        return array;
    }

    public static void main(String[] args){
        
        int array[]= {4,5,1,2,0,4};

        int sortedArray[] = selection(array);

       for(int i=0;i<sortedArray.length;i++){

        System.out.print(sortedArray[i]);
       } 
        
    }
}