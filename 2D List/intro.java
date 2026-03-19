import java.util.*;

public class intro {

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < 5; i++) {

            list1.add(i);
            list2.add(i * 2);
        }

        mainlist.add(list1);
        mainlist.add(list2);

        System.out.println(mainlist);

        for (int i = 0; i < mainlist.size(); i++) {

            for (int j = 0; j < mainlist.get(i).size(); j++) {

                System.out.println(mainlist.get(i).get(j) + " ");

            }
        }

    }

}
