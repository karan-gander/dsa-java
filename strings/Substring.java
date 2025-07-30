public class Substring {

    public static String subString(String str, int startIndex, int endString) {

        String substr = "";

        for (int i = startIndex; i < endString; i++) {

            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {


        String name = "karan";

        // String newStr = subString(name, 2, 5);

        // There is one inbuild method for to find the substring 


        System.out.print(name.substring(2,5));
    }
}
