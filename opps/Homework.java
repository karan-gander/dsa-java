public class Homework {

}

// hybrid example

class Animal {

    void eat() {
        System.out.print("Eat");
    }
}

//

class Fish extends Animal {

    void swim() {
        System.out.print("swim");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.print("fly");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.print("walk");

    }
}

class Shark extends Fish {

    void bite() {
        System.out.print("BITE");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.print("Dance");
    }
}

class Dog extends Mammal {

    void eatLag() {
        System.out.print("Eating ");
    }
}