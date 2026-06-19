import java.util.Arrays;

public class Even {

    public static int mostFrequentEven(int[] nums) {

        int smallEvenFreq = 0;
        int maxfreq = 0;
        int freq = 0;
        int ans = 0;
        Arrays.sort(nums);
        int indx = 0;
        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] % 2) == 0) {
                nums[indx++] = nums[i];
            }

        }

        if(indx==0){
            return -1;
        }


        for (int i = 1; i < indx; i++) {
            // System.out.print(nums[i]);

            if (i == 0 || nums[i] == nums[i - 1]) {
                freq++;
            } else {
                ans=nums[i];
                freq++;
            }

            if (freq > maxfreq) {
                maxfreq = freq;
                // ans = nums[i];
            }

            if(freq==maxfreq){
                System.out.print(nums[i]+"--");
                return nums[i-1];
            }
        }

        System.out.print(freq+"-");
        System.out.print(maxfreq);
        System.out.print(ans);

        // if (freq == maxfreq) {
        //     ans = nums[ans - 1];
        //     System.out.print(nums[ans - 2] + "--");
        //     return ans;
        // }
        // if (freq >= 0) {
        //     return nums[ans];
        // }

        return -1;

    }

    public static void main(String args[]) {

        int q[] = { 0, 1, 2, 2, 4, 4, 1 };

        mostFrequentEven(q);

    }

}