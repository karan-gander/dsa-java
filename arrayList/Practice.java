import java.util.*;

public class Practice {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) < list.get(i + 1)) {
                inc = false;
            }
            if (list.get(i) > list.get(i + 1)) {
                dec = false;
            }

        }

        if (dec || inc) {
            System.out.print("true");
        } else {

            System.out.print("False");
        }

    }

}
