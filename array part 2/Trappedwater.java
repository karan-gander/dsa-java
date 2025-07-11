
public class Trappedwater {

    public static int trappedWater(int height[]) {

        // calculate the left array
        int leftMaxArray[] = new int[height.length];

        int rightMaxArray[] = new int[height.length];

        leftMaxArray[0] = height[0];

        for (int i = 1; i < height.length; i++) {

            leftMaxArray[i] = Math.max(height[i], leftMaxArray[i - 1]);
            // System.out.println(leftMaxArray[i]);

        }

        // calculate the right array
        rightMaxArray[rightMaxArray.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {

            rightMaxArray[i] = Math.max(height[i], rightMaxArray[i + 1]);
            // System.out.print(rightMaxArray[i]);
        }

        int trapperdWaterLevel = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMaxArray[i], rightMaxArray[i]);

            trapperdWaterLevel += waterLevel - height[i];

        }

        return trapperdWaterLevel;
    }

    public static void main(String arg[]) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.print(trappedWater(height));

    }
}
