public class Subset {

    public static void findSubset(String str, String ans, int i) {

        if (str.length() == i) {
            System.out.println(ans);
            return;
        }

        // Yes -

        findSubset(str, ans + str.charAt(i), i + 1);
        // No -
        findSubset(str, ans, i + 1);

    }

    public static void main(String args[]) {

        findSubset("abc", "", 0);

        

    }

}
