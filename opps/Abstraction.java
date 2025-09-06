public class Abstraction {

    public static void  main(String args[]){

        Hourse h1 = new Hourse();
        Peacock p1 = new Peacock();
        h1.eat();
        h1.walk();
    }
}

abstract class Animal {


    Animal(){
        System.out.println("Animal called !!!");
    }

    void eat() {
        System.out.println("Animal is eating  ");
    }

    abstract void walk();
}


class Hourse extends Animal{

    Hourse(){
        System.out.println("Hourse is here");
    }
    void walk(){
        System.out.println("Walking... on 4 legs");
    }


}

class Peacock extends Animal{

        Peacock(){
            System.out.print("I am mor ");
        };

        void walk(){
            System.out.print("walk on two legs");
        }

        
}




