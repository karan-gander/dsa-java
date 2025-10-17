public class Sort {

    public static void main(String args[]) {

        int array[] = { 0, 1, 2, 30, 4, 5 };

        System.out.print(isSorted(array, 0));
    }

    public static boolean isSorted(int array[], int i) {

        if (i == array.length - 1)
            return true;

        if (array[i] > array[i + 1]) {

            return false;
        }

        return isSorted(array, i + 1);
    }

}
