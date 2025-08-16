public class Introduction {

    public static void oddOrEven(int n) {

        int bitmass = 1;

        if ((bitmass & n) == 0) {
            System.out.print("The given number is even");
        } else {
            System.out.print("The given number is Odd");

        }
    }

    public static void getIthBit(int n, int i) {
        int bitmass = 1 << i;

        if ((n & bitmass) == 0) { // we have to comapre zero first time becuse this willl convert into some
                                  // numbers like 8,7 something we compare this with number this is not good
                                  // return an incorrect ans
            System.out.print(i + " number is 0");

        } else {
            System.out.print(i + " number is 1");

        }
    }

    public static void setIthBit(int n, int i) {

        System.out.print(n | (1 << i));
    }

    public static void clearIthBit(int n, int i) {

        System.out.print(n & (~(1 << i)));
    }

    public static void updateIthBit(int n, int i, int newBit) {

        if (newBit == 0) {
            clearIthBit(n, i);

        } else {
            setIthBit(n, i);
        }
    }

    public static void clearLastIthBit(int n, int i) {

        int bitmass = (~0) << i;

        System.out.print(n & bitmass);

    }

    public static void clearIthBitFromJ(int n, int i, int j) {

        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;

        int bitmass = a | b;

        System.out.print(n & bitmass);
    }

    public static void powerOfTwo(int n) {

        if ((n & (n - 1)) == 0) {
            System.out.print("The " + n + " is Power Of Two");
        } else {
            System.out.print("The " + n + " is Not Power Of Two");

        }
    }
    public static void countOfSetBit(int n){
        int count = 0;

        while(n>0){

            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }

        System.out.print("Count of set bits are "+ count);
    }

    public static void main(String args[]) {

        // oddOrEven(5);
        // getIthBit(10, 2);
        // setIthBit(10, 2);
        // clearIthBit(10, 1);

        // updateIthBit(10, 2, 1);

        // clearLastIthBit(10, 2);
        // clearIthBitFromJ(10, 0, 2);
        // powerOfTwo(4);
        countOfSetBit(5);
    }
}