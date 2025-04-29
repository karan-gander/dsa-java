
public class Reversearray {

    public static void reverse(int number[]) {

        int start = 0;
        int end = number.length - 1;
        while (start < end) {

            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 4, 25, 55, 46, 20};

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
