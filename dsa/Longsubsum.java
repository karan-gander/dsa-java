
public class Longsubsum {

    public static int longestSubarray(int[] nums, int k) {
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int currLen = 0;
            int sum = nums[i];
            for (int j = i+1; j < nums.length; j++) {

                sum += nums[j];
                if (sum == k) {
                    System.out.print(sum);
                    // currLen++;
                    // System.out.print(i);
                    currLen = j - i+1;
                    // ++currLen;
                    maxCount = Math.max(maxCount, currLen);
                }

                
            }
            // System.out.print(maxCount);
        }
        return maxCount;
    }

    public static void main(String args[]) {

        int arr[] = { 10, 5, 2, 7, 1, 9 };

        int res = longestSubarray(arr, 15);

        System.out.print(res);
        System.out.print("---");
    }

}
