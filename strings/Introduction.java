import java.util.*;

public class Introduction {

    public static void main(String args[]) {

        String school = "Govt. School";

        String password = new String("pass123");

        // get string from user

        String name;

        Scanner sc = new Scanner(System.in);

        // next function is only takes thge first word in the string

        // name = sc.next();
        name = sc.nextLine();

        System.out.print(name);

        // functions in string
        // Here length is a function not like array only lenght

        // int array that length is only property not an function

        System.out.print(name.length());

    }

}
