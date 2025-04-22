
public class Preactice {

    public static int average(int a, int b, int c) {

        return (a + b + c) / 3;

    }

    public static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(int n) {

        int reverse = 0;
        int palindrome = n;
        // System.out.print(palindrome);
        while (palindrome != 0) {
            int lastDigit = palindrome % 10;
            // System.out.print(lastDigit);
            reverse = reverse * 10 + lastDigit;

            palindrome /= 10;

        }

        // System.out.print(reverse);
        // System.out.println();
        // System.out.print(n);
        if (n == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOfIntiger(int n) {

        int sumOfIntiger = 0;

        while (n > 0) {

            int lastDigit = n % 10;

            sumOfIntiger += lastDigit;
            n /= 10;

        }
        return  sumOfIntiger;

    }

    public static void main(String args[]) {

        // System.out.print(average(5, 5, 5));
        // System.out.print(isEven(52));
        // System.out.print(isPalindrome(121));
        System.out.print(sumOfIntiger(123));
    }
}
