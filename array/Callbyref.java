public class Callbyref{


    public static void update(int num[]){

        for(int i=0;i<num.length;i++){

            num[i]*=2;
        }
    }
    public static void main(String args[]){

        int numbers[] = {1,2,3,4,5};
        update(numbers); //array supportsin java by call by ref
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}