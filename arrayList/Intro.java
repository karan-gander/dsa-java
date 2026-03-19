
import java.util.*;

public class Intro {

    public static void swap(ArrayList<Integer> list, int indx1, int indx2) {

        int temp = list.get(indx1);

        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        // list.remove(2);
        // System.out.println(list.get(1));
        // list.set(0,10);

        // System.out.println(list.contains(11));
        // System.out.println(list.contains(10));

        swap(list, 0, 4);

        System.out.println(list);

        Collections.sort(list);

        System.out.print(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);
        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < list.size(); i++) {

        // if (max < list.get(i)) {
        // max = list.get(i);
        // }
        // }

        // System.out.print(max);

    }

}
