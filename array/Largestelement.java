
public class Largestelement {

    public static int largestElement(int number[]) {

        int largest = Integer.MIN_VALUE; //-infity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {

            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.print(smallest);
        return largest;
    }

    public static void main(String args[]) {

        int numbers[] = {1, 2, 11, 78, 45, 44, 12, 0, 52};

        int result = largestElement(numbers);

        System.out.print(result);

    }
}
