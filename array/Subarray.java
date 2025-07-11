
public class Subarray {

    public static void main(String[] args) {

        int nums[] = {10, 45, 44, 12, 45, 13, 66};
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                int currsum = 0;
                for (int k = i; k <= j; k++) {

                    System.out.print(nums[k] + " ");

                    currsum += nums[k];
                }

                if (maxSum < currsum) {
                    maxSum = currsum;
                }
                System.out.println();
                // System.out.print("Sum of these array----> " + currsum);
                // System.out.println();
            }
            System.out.println();
        }
        System.out.print(maxSum);

    }
}
