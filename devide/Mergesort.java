package devide;

public class Mergesort {

    public static void mergeSort(int array[], int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        merge(array, start, mid, end);

    }

    public static void merge(int array[], int start, int mid, int end) {

        int temp[] = new int[end - start + 1]; // temp arr
        int i = start; // tracking from the left
        int j = mid + 1; // tracking from the right
        int k = 0; // temp array tracker

        while (i <= mid && j <= end) {

            if (array[i] < array[j]) {
                temp[k] = array[i++];
            } else {
                temp[k] = array[j++];

            }
            k++;

        }

        // if any part in remain in left side array

        // for example any one array is odd

        while (i <= mid) {

            temp[k++] = array[i++];

        }

        while (j <= end) {
            temp[k++] = array[j++];

        }
        // coping original array in temp array
        for (k = 0, i = start; k < temp.length; k++,i++) {

            array[i] = temp[k];

        }

    }

    public static void main(String args[]) {

        int array[] = { 5, 4, 5, 78, 14 };

        mergeSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
