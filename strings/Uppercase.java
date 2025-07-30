public class Uppercase {

    public static String upperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char firstChar = str.charAt(0);

        sb.append(Character.toUpperCase(firstChar));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                // System.out.print("in");
                sb.append(str.charAt(i));
                i++;

                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }


    public static void main(String args[]){

        String quote = "hi my name is karan meghawal";

        System.out.print(upperCase(quote));
        
    }

}
