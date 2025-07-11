
public class Assignment {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 5};
        // boolean result = false;
        boolean ans=false;
        // int freq = 0;
       
       for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    ans = true;
                }
                
            }

       }
       
        System.out.println(ans);
        // System.out.println(result);

    

    }

};
