public class Inserationsort {


    public static int[] insertaion(int array[]){

        for(int i=0;i<array.length;i++){
            int temp ,curr = array[i];
            //  temp can called curr also 
            //  we can call j  also to prev
            int prev=i-1;

            while(prev>=0&& array[prev]>temp){
                array[prev+1]=array[prev];
                prev--;


            }

            array[prev+1]=temp;
        }
        return array;
    }
    public static void main(String[] args){

        // System.out.print();
        int array[]={1,10,2,5,3,9};
        int sortedArray[]=insertaion(array);

        for(int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }


    }
}
