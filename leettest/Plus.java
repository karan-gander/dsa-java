class Plus {

    public static int plusOne(int[] digits) {

        int storedNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            storedNumber = (storedNumber * 10) + digits[i];

        }
        // System.out.print(storedNumber);
        storedNumber = storedNumber + 1;
        // System.out.print(storedNumber);
        int i = digits.length - 1;
        while (storedNumber >= 0 && i >= 0) {

            int lastDigit = storedNumber % 10;
            System.out.print(digits[i]);
            digits[i] = lastDigit;
            i--;
            storedNumber = storedNumber / 10;
        }

        return storedNumber;
    }

    public static void main(String args[]) {
        int arr[] = { 9 };
        plusOne(arr);
        System.out.print(plusOne(arr));

    }

}
