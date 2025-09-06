public class Interface {

    public static void main(String args[]) {

        Scorpio s1 = new Scorpio();

        s1.wheel();
        s1.color();
    }
}

interface Car {

    void wheel();

    void color();

}

class Maruti implements Car {

    public void wheel() {
        System.out.print("This car has four wheels \n");
    }

    public void color() {
        System.out.print("It has red color");
    }
}

class Scorpio implements Car {

    public void wheel() {
        System.out.print("It has four wheels \n");
    }

    public void color() {
        System.out.print("It has only black color \n");
    }

}

// multiple inheritance

interface Dad {

    void body();

    // void face();
}

interface Mom {

    // void eye();

    void color();
}


class Child implements Mom,Dad{

   public void body(){
        System.out.print("Dad s body");
    }
    
    public void color(){
        System.out.print("Dad s body");

    }
}