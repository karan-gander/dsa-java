
public class Binarysearch {

    public static int binarysearch(int number[], int key) {

        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == number[mid]) {
                return mid;

            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {

        int numbers[]  = {10,20,50,100,255,550,650};

        int result= binarysearch(numbers, 100);

        System.out.print("index is "+result);

    }

}
