public class Countsort {

    public static void sort(int arr[]) {

        int count[] = {};
        int arrb[]={};

        for (int i = 0; i < arr.length; i++) {

            ++count[arr[i]];

        }

        //  code for updated count 
        for(int i=0;i<arr.length;i++){

            count[i]=count[i] + count[i=1];
        }

        for(int i=arr.length-1;i>=0;i--){

            
        }

    }

    public static void main(String arg[]){

        System.out.print("hello world");
    }

}
