public class FastExpo {

    public static int fastExpo(int n, int a) {

        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;

            System.out.print(ans+"\n");
            n = n >> 1;

        }


        return ans;
    }

    public static void main(String[] args) {

        System.out.print(fastExpo(5,2));

    }
}
