public class Polymorphism {
    

    
    public static void main(String args[]){

        Cal c1 = new Cal();
        System.out.print(c1.sum(5, 10));
        System.out.print(c1.sum(5, 10,45));
        System.out.print(c1.sum((float) 1.5,(float)1.5));

        Animal lion = new Animal();
        Cow cow1 = new Cow();
        lion.eat();
        cow1.eat();

    }
}


class Cal{

    // same name but diif num f perameter and diff types of perameters 
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b, int c){

        return a+b+c;
    }

    float sum(float a,float b){
        return a+b;
    }
}



class Animal{

    void eat(){
        System.out.print("Eating anything...., ");
    }
}



class Cow extends Animal{

    void eat(){

        System.out.print("Eating only grass");

    }
}
