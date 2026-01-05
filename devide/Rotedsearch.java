package devide;

public class Rotedsearch {

    public static int search(int array[], int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        // Kaam

        int mid = si + (ei - si) / 2;

        if (array[mid] == target) {

            return mid;

        }
        ;

        // line 1
        if (array[si] <= array[mid - 1]) {
            // left

            if (array[si] <= target && target <= array[mid - 1]) {

                return search(array, target, si, mid - 1);

            } else {
                return search(array, target, mid + 1, ei);
            }

        }

        // line 2
        else {

            if (array[mid] <= target && target <= array[ei]) {
                return search(array, target, mid + 1, ei);

            } else {
                return search(array, target, si, mid - 1);

            }
        }

    }

    public static int searchLoop(int array[], int target, int si, int ei) {

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (array[mid] == target) {

                return mid;

            }

            if (array[si] <= array[mid - 1]) {
                // left

                if (array[si] <= target && target <= array[mid - 1]) {

                    return search(array, target, si, mid - 1);

                } else {
                    return search(array, target, mid + 1, ei);
                }

            }

            // line 2
            else {

                if (array[mid] <= target && target <= array[ei]) {
                    return search(array, target, mid + 1, ei);

                } else {
                    return search(array, target, si, mid - 1);

                }
            }

        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        // int result = search(arr, 0, 0, arr.length - 1);
        int result = searchLoop(arr, 0, 0, arr.length - 1);
        System.out.print(result);
    }

}