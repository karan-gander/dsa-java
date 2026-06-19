public class Colorsort {

    public static void sortColors(int[] nums) {

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        int n = nums.length - 1;

        if (n <= 1)
            return;

        for (int i = 0; i <= n; i++) {

            if (nums[i] == 0) {
                ++countZero;
            } else if (nums[i] == 1) {
                ++countOne;
            } else if (nums[i] == 2) {
                ++countTwo;
            }

        }

        int indx = 0;
        for (int i = 0; i < countZero; i++) {

            nums[indx++] = 0;
        }

        for (int i = 0; i < countOne; i++) {

            nums[indx++] = 1;
        }

        for (int i = 0; i < countTwo; i++) {

            nums[indx++] = 2;
        }

        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i]);
        }
    }

    // System.out.print(" ok");

    public static void main(String args[]) {
        // System.out.print(" okokok");
        int q[] = { 1, 0 };

        sortColors(q);

    }
}
