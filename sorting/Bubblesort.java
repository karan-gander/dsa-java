public class Bubblesort {

    public static int[] bubbleSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = 1;
                }

                // System.out.print(" "+flag);

            }
            if(flag==0){
                break;
            }

        }

        return array;
    }

    public static void main(String[] args) {

        System.out.print("Hello World \n");
        int array[] = { 2,4,6,10};
        int sortedArray[]=bubbleSort(array);

        for(int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i]);
        }
    }

}