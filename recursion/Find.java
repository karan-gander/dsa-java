public class Find {

    public static void main(String argsp[]) {

        int arr[] = { 10, 45, 5, 10, 8, 2, 8 };

        System.out.print(lastAcurr(arr, 0, 8));
    }

    public static int findIndexAcc(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (key == arr[i])
            return i;

        return findIndexAcc(arr, i + 1, key);

    }

    public static int lastAcurr(int array[], int i, int key) {

        if (i == array.length)
            return -1;

        int isFound = lastAcurr(array, i+1, key);
        if (isFound == -1 && array[i] == key) {
            return i;
        }

        return isFound;
    }

}
