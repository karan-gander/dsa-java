public class Leanersearch{



    public static int linearSearch(int number[],int key){

        for(int i=0;i<number.length;i++){

            if(number[i]==key){
                return  i;
            }
           
        }
        return  -1;

            

    }

    public static void main(String args[]){

        int numbers[] = {2,4,5,6,8,10,11,25,45};

        int result = linearSearch(numbers, 10);
        System.out.print(result);


    }

}