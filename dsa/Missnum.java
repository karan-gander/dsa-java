package dsa;

public class Missnum {

    public static void main(String args[]) {

        int nums[] = { 0, 1, 2, 4, 5, 6 };

        // for (int i = 1; i <= nums.length - 1; i++) {
        //     int flag = 0;
        //     for (int j = 0; j < nums.length - 1; j++) {

        //         if (nums[j] == i) {

        //             // return nums[j];
        //             // System.out.print("hii");
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if (flag == 0) {
        //         System.out.print(i);
        //         System.out.print("ii");
        //     }
        // }
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i + 1);
        }

        xor1 = xor1 ^ nums.length;

        int ans = xor1 ^ xor2;


        System.out.print(ans);
        System.out.print("ko");

        // return -1;
    }

}
