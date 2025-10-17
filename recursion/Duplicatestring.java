public class Duplicatestring {

    public static void duplicate(String str, int index, boolean map[], StringBuilder newstr) {

        if (index == str.length()) {

            System.out.print(newstr);
            return;
        }

        char currChar = str.charAt(index);

        if (map[currChar - 'a'] == true) {

            duplicate(str, index + 1, map, newstr);

        } else {
            map[currChar-'a']=true;
            duplicate(str, index + 1, map, newstr.append(currChar));
        }

    }



    public static void main(String args[]){

        duplicate("karrann", 0, new boolean[26], new StringBuilder());
    }

}
