public class Super {
    

    public static void main(String arg[]){

        Animal c1= new Cow();



    }
}



class Animal {

    static String color;

    Animal() {
        System.out.print("Hey I am animal class " + "My Color is " + color);

    }
}


class Cow extends Animal{

    int legs;

    Cow(){
        super.color = "white";
        System.out.print("I have four legs in cow "+ "my color  is "+ color);
    }
}
