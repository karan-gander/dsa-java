
public class Functionoverloading {

    // Two Types OF function Overloading 
    // 1 -> Different number of permeter with same function name
    // 2 -> Diffrent types of permameter with same function name 
    //1 Different number of perameter with same function 
    // This is called function overloading we have same name function still we are not gettting any error in this code 
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //  2- Diffrent types of perammeter 
    public static float sub(float a, float b) {
        return a - b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        System.out.println(sum(8, 5, 7));
        System.out.println(sub(8, 5));
        System.out.println(sub(8.5f, 5.0f));
    }
}
