public class TypePramotion {


    public static void main(String args[]){

        char a = 'a';
        char b =  'b';
        

        short j = 4;
        byte k = 25;
        char c = 'c';

        // byte o = j+k+c;   // it is ony convert into int 
        int o = j+k+c;


        byte A = 5;

        // A=A*2;    wrong because express is convert into int

         A=(byte)(A*2);    


        System.out.print(A);

    }
}