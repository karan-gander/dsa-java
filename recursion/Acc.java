public class Acc {

    public static void allAccurIndex(int[] array, int key, int index) {

        if (index == array.length)
            return;

        if (array[index] == key) {
            // allAccurIndex(array, key, ++index);
            System.out.print(index + " ");
        }
        allAccurIndex(array, key, ++index);

    }

    public static void main(String args[]) {
        int array[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };

        allAccurIndex(array, 2, 0);
    }
}
