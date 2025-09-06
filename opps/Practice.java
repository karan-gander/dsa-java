public class Practice extends Car {
    
    public final String drive(){
        return "Driving Electric Car";
    }

    public static void main(String args[]){
        final Car car = new Practice();

        System.out.print(car.drive());
    }
}




class Automobile{

    private String drive(){
        
        return "Driving vechile";
    }

}

class Car extends Automobile{

    protected String drive(){
        return "Car driving";
    }


}

