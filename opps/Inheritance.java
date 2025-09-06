public class Inheritance {

    
    public static void main(String args[]){
        
        // Fish f1 = new Fish();

        Dogs buso = new Dogs();

        buso.name = "Dhanunjay Boss";

        buso.eat();

    
    }

}

class Animal {

    void eat() {
        System.out.print("Eat");
    }

    void sleep() {
        System.out.print("sleep");
    }
}



class Mammal extends Animal{

    int legs;



}


class Dogs extends Mammal{

    String name;


}

// child class

// class Fish extends Animal {

//     int fins;

//     void swim() {
//         System.out.print("Swim");
//     }
// }
