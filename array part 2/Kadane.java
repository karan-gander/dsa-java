
public class Kadane {

    //  This is the most imposttant and optimize algo to find the max sub array 
    // it is important also for interview 
    public static void kadane(int array[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < array.length; i++) {

            currSum = currSum + array[i];
            // System.out.print(currSum);
            if (currSum < 0) {
                currSum = 0;
            }

            // System.out.print(currSum);
            maxSum = Math.max(currSum, maxSum);
            // System.out.print("\n\n");
            // System.out.print(maxSum);
        }
        System.out.print(maxSum);
    }

    public static void main(String[] args) {

        // System.out.print();
        int number[] = {-2, -3, 4, -1, -2, 1, 5 ,- 3};

        kadane(number);
    }

}
