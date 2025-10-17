
public class Quicksort {

    public static void quickSort(int array[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int pIndex = partitation(array, si, ei);

        quickSort(array, si, pIndex - 1); // left Part
        quickSort(array, pIndex + 1, ei); // Right Part

    }

    public static int partitation(int array[], int si, int ei) {

        int pivot = array[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        array[ei] = array[i];
        array[i] = temp;

        return i;
    }

    public static void main(String args[]){

        int array[]= {15,2,5,0,1};
        quickSort(array, 0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

}
