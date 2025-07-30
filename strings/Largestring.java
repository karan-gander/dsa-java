public class Largestring {
    



    public static void main(String args[]){

        String[] array= {"apple","mango","banana"};

        String largest = array[0];

        for(int i=1;i<array.length;i++){

            if(largest.compareToIgnoreCase(array[i])<0){
                largest=array[i];
            }
        }

        System.out.print(largest);
    }
}
