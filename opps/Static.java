public class Static {

    public static void main(String args[]) {

        Animal cow = new Animal();

        cow.color = "white";

        Animal goat = new Animal();

        goat.color = "brown";

        Animal buffalo = new Animal();

        

    }

}

class Animal {

    static String color;

    Animal() {
        System.out.print("Hey I am animal class " + "My Color is " + color);

    }
}
